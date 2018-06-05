package manipal2016.utsav.com.utsav2016;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
/*
 *********Created by Akshath K, Punith B, Ajay J [March 2016]*********
*/
public class Splash_Screen extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

       //TextView title= (TextView) findViewById(R.id.title);
        StartAnimations();
      //title.setEnabled(false);
        Thread t = new Thread()
        {
            public void run()
            {
                try
                {
                    sleep(1400);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally
                {
                    Intent intent = new Intent(Splash_Screen.this,Main_Activity.class);
                    startActivity(intent);
                }
            }
        };
        t.start();
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        finish();
    }
    private void StartAnimations() {
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.alpha);
        anim.reset();
        LinearLayout l2 = (LinearLayout) findViewById(R.id.l2);
        l2.clearAnimation();
        l2.startAnimation(anim);

   anim = AnimationUtils.loadAnimation(this, R.anim.fade_in);
      anim.reset();
       TextView apptitle = (TextView) findViewById(R.id.title);

        Typeface typeFace1= Typeface.createFromAsset(getAssets(), "fonts/poorrichard.ttf");
       apptitle.setTypeface(typeFace1);
        apptitle.clearAnimation();
       apptitle.startAnimation(anim);
    }
}