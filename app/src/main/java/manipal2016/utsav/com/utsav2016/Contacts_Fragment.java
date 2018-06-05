package manipal2016.utsav.com.utsav2016;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
/*
 *********Created by Akshath K, Punith B, Ajay J [March 2016]*********
*/
public class Contacts_Fragment extends Fragment implements View.OnClickListener
{
    String phoneno,o1,o2,o3,o4,o5,o6,o7,o8,o9,o10,o11,o12,o13,o14,o15,o16,o17;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33,b34;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.fragment_contacts, container, false);
        b1=(Button) rootView.findViewById(R.id.button1);
        b1.setOnClickListener(this);
        b2=(Button) rootView.findViewById(R.id.button2);
        b2.setOnClickListener(this);


        b3=(Button) rootView.findViewById(R.id.button3);
        b3.setOnClickListener(this);
        b4=(Button) rootView.findViewById(R.id.button4);
        b4.setOnClickListener(this);


        b5=(Button) rootView.findViewById(R.id.button5);
        b5.setOnClickListener(this);
        b6=(Button) rootView.findViewById(R.id.button6);
        b6.setOnClickListener(this);

        b7=(Button) rootView.findViewById(R.id.button7);
        b7.setOnClickListener(this);
        b8=(Button) rootView.findViewById(R.id.button8);
        b8.setOnClickListener(this);

        b9=(Button) rootView.findViewById(R.id.button9);
        b9.setOnClickListener(this);
        b10=(Button) rootView.findViewById(R.id.button10);
        b10.setOnClickListener(this);

        b11=(Button) rootView.findViewById(R.id.button11);
        b11.setOnClickListener(this);
        b12=(Button) rootView.findViewById(R.id.button12);
        b12.setOnClickListener(this);

        b13=(Button) rootView.findViewById(R.id.button13);
        b13.setOnClickListener(this);
        b14=(Button) rootView.findViewById(R.id.button14);
        b14.setOnClickListener(this);

        b15=(Button) rootView.findViewById(R.id.button15);
        b15.setOnClickListener(this);
        b16=(Button) rootView.findViewById(R.id.button16);
        b16.setOnClickListener(this);

        b17=(Button) rootView.findViewById(R.id.button17);
        b17.setOnClickListener(this);
        b18=(Button) rootView.findViewById(R.id.button18);
        b18.setOnClickListener(this);

        b19=(Button) rootView.findViewById(R.id.button19);
        b19.setOnClickListener(this);
        b20=(Button) rootView.findViewById(R.id.button20);
        b20.setOnClickListener(this);

        b21=(Button) rootView.findViewById(R.id.button21);
        b21.setOnClickListener(this);
        b22=(Button) rootView.findViewById(R.id.button22);
        b22.setOnClickListener(this);

        b23=(Button) rootView.findViewById(R.id.button23);
        b23.setOnClickListener(this);
        b24=(Button) rootView.findViewById(R.id.button24);
        b24.setOnClickListener(this);

        b25=(Button) rootView.findViewById(R.id.button25);
        b25.setOnClickListener(this);
        b26=(Button) rootView.findViewById(R.id.button26);
        b26.setOnClickListener(this);

        b27=(Button) rootView.findViewById(R.id.button27);
        b27.setOnClickListener(this);
        b28=(Button) rootView.findViewById(R.id.button28);
        b28.setOnClickListener(this);

        b29=(Button) rootView.findViewById(R.id.button29);
        b29.setOnClickListener(this);
        b30=(Button) rootView.findViewById(R.id.button30);
        b30.setOnClickListener(this);

        b31=(Button) rootView.findViewById(R.id.button31);
        b31.setOnClickListener(this);
        b32=(Button) rootView.findViewById(R.id.button32);
        b32.setOnClickListener(this);

        b33=(Button) rootView.findViewById(R.id.button33);
        b33.setOnClickListener(this);
        b34=(Button) rootView.findViewById(R.id.button34);
        b34.setOnClickListener(this);

        TextView E1=(TextView) rootView.findViewById(R.id.editText2);
        o1=E1.getText().toString();

        TextView E2=(TextView) rootView.findViewById(R.id.editText5);
        o2=E2.getText().toString();

        TextView E3=(TextView) rootView.findViewById(R.id.editText8);
        o3=E3.getText().toString();

        TextView E4=(TextView) rootView.findViewById(R.id.editText11);
        o4=E4.getText().toString();

        TextView E5=(TextView) rootView.findViewById(R.id.editText14);
        o5=E5.getText().toString();

        TextView E6=(TextView) rootView.findViewById(R.id.editText17);
        o6=E6.getText().toString();

        TextView E7=(TextView) rootView.findViewById(R.id.editText20);
        o7=E7.getText().toString();

        TextView E8=(TextView) rootView.findViewById(R.id.editText23);
        o8=E8.getText().toString();

        TextView E9=(TextView) rootView.findViewById(R.id.editText26);
        o9=E9.getText().toString();

        TextView E10=(TextView) rootView.findViewById(R.id.editText29);
        o10=E10.getText().toString();

        TextView E11=(TextView) rootView.findViewById(R.id.editText32);
        o11=E11.getText().toString();

        TextView E12=(TextView) rootView.findViewById(R.id.editText35);
        o12=E12.getText().toString();

        TextView E13=(TextView) rootView.findViewById(R.id.editText38);
        o13=E13.getText().toString();

        TextView E14=(TextView) rootView.findViewById(R.id.editText41);
        o14=E14.getText().toString();

        TextView E15=(TextView) rootView.findViewById(R.id.editText44);
        o15=E15.getText().toString();

        TextView E16=(TextView) rootView.findViewById(R.id.editText47);
        o16=E16.getText().toString();

        TextView E17=(TextView) rootView.findViewById(R.id.editText50);
        o17=E17.getText().toString();
        return rootView;
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.button1: phoneno=o1;
                               call();
                               break;
            case R.id.button2: phoneno=o1;
                               message();
                               break;
            case R.id.button3: phoneno=o2;
                               call();
                               break;
            case R.id.button4: phoneno=o2;
                               message();
                               break;
            case R.id.button5: phoneno=o3;
                               call();
                               break;
            case R.id.button6: phoneno=o3;
                               message();
                               break;
            case R.id.button7: phoneno=o4;
                               call();
                               break;
            case R.id.button8: phoneno=o4;
                               message();
                               break;
            case R.id.button9: phoneno=o5;
                               call();
                               break;
            case R.id.button10: phoneno=o5;
                                message();
                                break;
            case R.id.button11: phoneno=o6;
                                call();
                                break;
            case R.id.button12: phoneno=o6;
                                message();
                                break;
            case R.id.button13: phoneno=o7;
                                call();
                                break;
            case R.id.button14: phoneno=o7;
                                message();
                                break;
            case R.id.button15: phoneno=o8;
                                call();
                                break;
            case R.id.button16: phoneno=o8;
                                message();
                                break;
            case R.id.button17: phoneno=o9;
                                call();
                                break;
            case R.id.button18: phoneno=o9;
                                message();
                                break;
            case R.id.button19: phoneno=o10;
                                call();
                                break;
            case R.id.button20: phoneno=o10;
                                message();
                                break;
            case R.id.button21: phoneno=o11;
                                call();
                                break;
            case R.id.button22: phoneno=o11;
                                message();
                                break;
            case R.id.button23: phoneno=o12;
                                call();
                                break;
            case R.id.button24: phoneno=o12;
                                message();
                                break;
            case R.id.button25: phoneno=o13;
                                call();
                                break;
            case R.id.button26: phoneno=o13;
                                message();
                                break;
            case R.id.button27: phoneno=o14;
                                call();
                                break;
            case R.id.button28: phoneno=o14;
                                message();
                                break;
            case R.id.button29: phoneno=o15;
                                call();
                                break;
            case R.id.button30: phoneno=o15;
                                message();
                                break;
            case R.id.button31: phoneno=o16;
                                call();
                                break;
            case R.id.button32: phoneno=o16;
                                message();
                                break;
            case R.id.button33: phoneno=o17;
                                call();
                                break;
            case R.id.button34: phoneno=o17;
                                message();
                                break;
        }
    }

    private void call()
    {
        try
        {
            Intent callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse("tel:"+phoneno));
            startActivity(callIntent);
        }
        catch (ActivityNotFoundException activityException)
        {
            Log.e("dialing-example", "Call failed", activityException);
        }
    }
    private void message()
    {
        try
        {
        Intent sendIntent = new Intent(Intent.ACTION_VIEW);
        sendIntent.putExtra("address",phoneno);
        sendIntent.putExtra("sms_body", "");
        sendIntent.setType("vnd.android-dir/mms-sms");
        startActivity(sendIntent);

    }
        catch (Exception e)
        {
        Toast.makeText(getContext(),"SMS failed, please try again later!", Toast.LENGTH_LONG).show();
        e.printStackTrace();
        }
    }



}
