package manipal2016.utsav.com.utsav2016;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/*
 *********Created by Akshath K, Punith B, Ajay J [March 2016]*********
*/
public class View_Rules_Intent extends Activity  implements View.OnClickListener
{
    String phonenocall,cono,coname,o1,o2;
    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
       // overridePendingTransition(R.anim.stylish, R.anim.fade_in2);   To put Animations
        setContentView(R.layout.view_rules);
        getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT);
        Intent intent = getIntent();
        // fetch value from key-value pair and make it visible on TextView.
       cono = intent.getStringExtra("cono");
       coname = intent.getStringExtra("coname");


        TextView textviewcono=(TextView) findViewById(R.id.textviewcono);
        TextView textviewconame=(TextView) findViewById(R.id.textviewconame);
        textviewcono.setText(cono);
        textviewconame.setText(coname);

        o1=textviewcono.getText().toString();

        ImageButton b1=(ImageButton) findViewById(R.id.button1);
        b1.setOnClickListener(this);
        ImageButton b2=(ImageButton) findViewById(R.id.button2);
        b2.setOnClickListener(this);

        String rulesperevent = intent.getStringExtra("selected-item");
        TextView textviewrulesperevent=(TextView) findViewById(R.id.textviewrules);
        textviewrulesperevent.setText(rulesperevent);

        Typeface typeFace1= Typeface.createFromAsset(getAssets(), "fonts/poorrichard.ttf");
        textviewrulesperevent.setTypeface(typeFace1);


        String venue = intent.getStringExtra("venue");
        TextView textviewvenue=(TextView) findViewById(R.id.venue);
        textviewvenue.setText(venue);
        Typeface typeFace= Typeface.createFromAsset(getAssets(), "fonts/poorrichard.ttf");
        textviewvenue.setTypeface(typeFace);

        ImageView v=(ImageView) findViewById(R.id.image);

        Bundle bundle=this.getIntent().getExtras();
        int pic=bundle.getInt("image");
        String apptitle=bundle.getString("apptitle");
        setTitle(apptitle);
       v.setImageResource(pic);


    }


    @Override
    public void onClick(View v)
    {
        switch (v.getId()) {
            case R.id.button1:
                call(o1);
                break;
            case R.id.button2:
                message();
                break;
        }
    }


    private void call(String phoneno)
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
            sendIntent.putExtra("address",o1);
            sendIntent.putExtra("sms_body", "");
            sendIntent.setType("vnd.android-dir/mms-sms");
            startActivity(sendIntent);

        }
        catch (Exception e)
        {
            Toast.makeText(this,"SMS failed, please try again later!", Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }


}