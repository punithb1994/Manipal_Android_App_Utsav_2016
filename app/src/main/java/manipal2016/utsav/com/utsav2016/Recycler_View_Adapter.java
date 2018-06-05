package manipal2016.utsav.com.utsav2016;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import java.util.Collections;
import java.util.List;
/*
 *********Created by Akshath K, Punith B, Ajay J [March 2016]*********
*/
public class Recycler_View_Adapter extends RecyclerView.Adapter<CardView_Holder>
{
    private static final String TAG = "Recycler_View_Adapter";
    List<Data> list = Collections.emptyList();
    Context context;
    public Recycler_View_Adapter(List<Data> list, Context context)
    {
        this.list = list;
        this.context = context;
    }

    @Override
    public CardView_Holder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        //Inflate the layout, initialize the View Holder
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        CardView_Holder holder = new CardView_Holder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(CardView_Holder holder, int position)
    {
        //Use the provided View Holder on the onCreateViewHolder method to populate the current row on the RecyclerView
        holder.title.setText(list.get(position).title);
        holder.description.setText(list.get(position).description);
        holder.imageView.setImageResource(list.get(position).imageId);
        animate(holder);
    }
    @Override
    public int getItemCount()
    {
        //returns the number of elements the RecyclerView will display
        return list.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView)
    {
        super.onAttachedToRecyclerView(recyclerView);
    }
    public void animate(RecyclerView.ViewHolder viewHolder)
    {
        final Animation animAnticipateOvershoot = AnimationUtils.loadAnimation(context, R.anim.trans);
        viewHolder.itemView.setAnimation(animAnticipateOvershoot);
    }
    public static class RecyclerTouchListener implements RecyclerView.OnItemTouchListener
    {
        private GestureDetector gestureDetector;
        private ClickListener clickListener;
        public RecyclerTouchListener(Context context, final RecyclerView recyclerView, final ClickListener clickListener)
        {
            Log.d(TAG, "constructor invoked");
            this.clickListener =clickListener;
            gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener()
            {
               @Override
            public boolean onSingleTapUp(MotionEvent e)
               {
                   Log.d(TAG, "onSingleTap " +e);
                   return true;
               }
                @SuppressWarnings("deprecation")
                public void onLongPress(MotionEvent e)
                {
                    View child = recyclerView.findChildViewUnder(e.getX(),e.getY());
                    if(child!=null && clickListener!=null)
                    {
                        clickListener.onLongClick(child,recyclerView.getChildPosition(child));
                    }
                    Log.d(TAG, "onLongPress " +e);
                }
            });
        }
        @SuppressWarnings("deprecation")
        @Override
        public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e)
        {

            View child = rv.findChildViewUnder(e.getX(),e.getY());
            if(child!=null && clickListener!=null && gestureDetector.onTouchEvent(e))
            {
                clickListener.onLongClick(child,rv.getChildPosition(child));
            }
            return false;
        }

        @Override
        public void onTouchEvent(RecyclerView rv, MotionEvent e)
        {
            Log.d(TAG,"constructor invoked");
        }

        @Override
        public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept)
        {

        }
    }
    public static interface ClickListener
    {
        public void onClick(View view, int position);
        public void onLongClick(View view, int position);
    }
}