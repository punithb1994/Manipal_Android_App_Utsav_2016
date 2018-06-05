package manipal2016.utsav.com.utsav2016;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

/*
 *********Created by Akshath K, Punith B, Ajay J [March 2016]*********
*/
public class Feedback extends Fragment
{
    Button send;
    EditText emailbody;
    int i, j;
    TextView tv;
     @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.feedback, container, false);
        emailbody = (EditText) v.findViewById(R.id.body);
        send = (Button) v.findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sendEmail();
            }
        });
        tv = (TextView) v.findViewById(R.id.displaytextview);
        emailbody.addTextChangedListener(new TextWatcher()
        {
            public void afterTextChanged(Editable s)
            {
                i++;
                j = 300 - s.length();
                tv.setText(j + " characters left");
            }
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {
            }
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                String k=emailbody.getText().toString();
                if(k.length()==0)
                {
                    tv.setVisibility(View.INVISIBLE);
                }
                else
                {
                    tv.setVisibility(View.VISIBLE);
                }
                }
        });
        return v;
    }

    public void sendEmail()
    {
        final Intent emailIntent = new Intent(Intent.ACTION_SEND);
        String k = emailbody.getText().toString();
        if (!k.isEmpty())
        {
            emailIntent.setType("plain/text");
            emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"utsavmanipal2016@gmail.com"});
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Bug Report");
            emailIntent.putExtra(Intent.EXTRA_TEXT, emailbody.getText().toString());
            getContext().startActivity(Intent.createChooser(emailIntent, "Feedback sent"));

        }
        else
        {

            }
    }
}
