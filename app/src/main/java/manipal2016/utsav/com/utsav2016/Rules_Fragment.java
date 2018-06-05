package manipal2016.utsav.com.utsav2016;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/*
 *********Created by Akshath K, Punith B, Ajay J [March 2016]*********
*/
public class Rules_Fragment extends Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.rules_fragment, container, false);
       // TextView textview1=(TextView) rootView.findViewById(R.id.editText1);
        //Typeface typeFace1= Typeface.createFromAsset(getContext().getAssets(), "fonts/poorrichard.ttf");
       // textview1.setTypeface(typeFace1);

       // TextView textview2=(TextView) rootView.findViewById(R.id.editText2);
       // Typeface typeFace2= Typeface.createFromAsset(getContext().getAssets(), "fonts/poorrichard.ttf");
       // textview2.setTypeface(typeFace2);
        return rootView;
    }
}
