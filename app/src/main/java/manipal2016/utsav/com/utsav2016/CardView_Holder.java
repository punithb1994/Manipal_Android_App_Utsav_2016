package manipal2016.utsav.com.utsav2016;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/*
 *********Created by Akshath K, Punith B, Ajay J [March 2016]*********
*/
public class CardView_Holder extends RecyclerView.ViewHolder
{
    CardView cv;
    TextView title;
    TextView description;
    ImageView imageView;
    CardView_Holder(View itemView)
    {
        super(itemView);
        cv = (CardView) itemView.findViewById(R.id.cardView);
        title = (TextView) itemView.findViewById(R.id.title);
        description = (TextView) itemView.findViewById(R.id.description);
        imageView = (ImageView) itemView.findViewById(R.id.imageView);
    }
}