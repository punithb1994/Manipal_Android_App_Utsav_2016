package manipal2016.utsav.com.utsav2016;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewFlipper;
/*
 *********Created by Akshath K, Punith B, Ajay J [March 2016]*********
*/
public class Home_Fragment extends Fragment implements View.OnClickListener
{
    private int[] IMAGE_IDS = {
            R.drawable.splash0, R.drawable.splash1, R.drawable.splash2,
            R.drawable.splash3,  R.drawable.splash4,  R.drawable.splash5,  R.drawable.splash6,  R.drawable.splash7
    };
    Button Btnevents,Btnschedule,Btnmaps,Btnabout;
    ViewFlipper flipper;
     @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        Btnevents = (Button) rootView.findViewById(R.id.button_events);
        Btnschedule = (Button) rootView.findViewById(R.id.button_schedule);
        flipper = (ViewFlipper) rootView.findViewById(R.id.flipper1);
        flipper.setOnClickListener(this);
        flipper.startFlipping();
        final Animation animAnticipateOvershoot = AnimationUtils.loadAnimation(getContext(), R.anim.alpha);
        flipper.setAnimation(animAnticipateOvershoot);
        Btnmaps = (Button) rootView.findViewById(R.id.button_maps);
        Btnabout = (Button) rootView.findViewById(R.id.button_about);

         TextView textviewwriteup=(TextView) rootView.findViewById(R.id.textviewwriteup);
         Typeface typeFace1= Typeface.createFromAsset(getContext().getAssets(), "fonts/poorrichard.ttf");
         textviewwriteup.setTypeface(typeFace1);

         TextView texttag=(TextView) rootView.findViewById(R.id.txtreason);
         Typeface typeFace2= Typeface.createFromAsset(getContext().getAssets(), "fonts/greatvibes.ttf");
         texttag.setTypeface(typeFace2);

        Btnevents.setOnClickListener(this);
        Btnschedule.setOnClickListener(this);
        Btnmaps.setOnClickListener(this);
        Btnabout.setOnClickListener(this);
        return rootView;
    }
    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.flipper1: flipper.showNext();
                break;
            case R.id.button_events:
                Intent add_mem1 = new Intent(getContext(),Gallery_Intent.class);
                startActivity(add_mem1);
                break;
            case R.id.button_schedule: Intent add_mem2 = new Intent(getContext(),Listing_Events.class);
                startActivity(add_mem2);
                break;
            case R.id.button_maps:Intent add_mem3 = new Intent(getContext(),Maps_Activity.class);
                startActivity(add_mem3);
                break;
            case R.id.button_about:
                Intent add_result = new Intent(getContext(),Result_Intent.class);
                startActivity(add_result);
                break;
        }
    }
}
