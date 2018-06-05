package manipal2016.utsav.com.utsav2016;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import java.util.ArrayList;
import java.util.List;
/*
 *********Created by Akshath K, Punith B, Ajay J [March 2016]*********
*/
public class Listing_Events_Fragment_Four extends Fragment
{
    int i;
    public Spinner spinner;
    RecyclerView recyclerView;
    public Listing_Events_Fragment_Four()
    {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.listing_events_fragment_four, container, false);
        // Inflate the layout for this fragment
        List<Data> data = fill_with_data();
        recyclerView = (RecyclerView) v.findViewById(R.id.recyclerview);
        Recycler_View_Adapter adapter = new Recycler_View_Adapter(data,this.getContext());
        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        itemAnimator.setAddDuration(1000);
        itemAnimator.setRemoveDuration(1000);
        recyclerView.setItemAnimator(itemAnimator);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        recyclerView.addOnItemTouchListener(new Recycler_View_Adapter.RecyclerTouchListener(getActivity(), recyclerView, new Recycler_View_Adapter.ClickListener() {
            @Override
            public void onClick(View view, int position)
            {
                           }
            @Override
            public void onLongClick(View view, int position)
            {
                  switch (position) {
                    case 0: i=1;
                        String s1 = "Entries: 1 Entry per college.\n\n" +
                                "Rules: \n• Preliminary round will be held at the time of the event. \n• Top 6 players will go to the finals. \n• Rules will be announced during the event. \n• Specific rules regarding the evaluation procedure, time to answer a particular question and the type of rounds will be given during the event.\n";
                        openintent(s1);
                        break;
                    case 1: i=2;
                        String s2 = "Description: Objective is to make an explicit model from clay \n\n" +
                                "Entries: 1 Team per college ; Team of maximum 3.\n\n" +
                                "Time: Maximum 2 hours\n\n" +
                                "Rules: \n• Model may be based on any theme.\n• Supports are NOT allowed. \n• Other required materials has to be brought by the participants themselves. \n• Colours, sparkles, papers may be used for final decoration of the clay model. \n• More weightage will be given to the skill in clay modeling than to that in accessory decorations. \n• Participants are NOT allowed to write anything (using clay or anything on clay) or explain their theme to the judges.\n";
                        openintent(s2);
                        break;
                    case 2:  i=3;
                        String s3 = "Entries: 1 Team per college ; Team of minimum 6 and maximum 8.\n\n" +
                                "Time: Maximum 4 minutes.\n\n" +
                                "Rules: \n• Themes (by lots) will be given 24 hours prior at the Info Desk. \n• No speech or human sounds allowed. \n• Props, Vulgarity/ obscenity in concept, dress, talk and action are strictly prohibited. \n• Any one from the Panel of Referees has the right to stop the item on the spot if the item is found vulgar. \n• Background non-human sounds are allowed. Eg: Rustling of leaves, Chirping of birds etc.  \n• No recorded music.\n";
                        openintent(s3);
                        break;
                    case 3: i=4;
                        String s4 = "Entries: 1 Team per college ; Team of minimum 6 and maximum 8.\n\n" +
                                "Time: Maximum 4 minutes including set up time, narration etc.\n\n" +
                                "Rules: \n• Topics (by lots) will be available 24 hours in advance at the Info Desk. \n• Skit must be in Hindi or English. \n• Props, Vulgarity/ obscenity in concept, dress, talk and action are strictly prohibited. \n• Any one from the Panel of Referees has the right to stop the item on the spot if the item is found vulgar. \n• Maximum of TWO hand held live musical instruments are allowed. \n• NO tables will be provided.\n";
                        openintent(s4);
                        break;
                    case 4: i=5;
                        String s5 = "Entries: 1 Team per college ; Team of min. 6 and max. 8 (inclusive of narrator).\n\n" +
                                "Time: Maximum 4 minutes including set up time, narration etc.\n\n" +
                                "Rules: \n• Products (by lots) available 24 hour in advance at the Info Desk. \n• Props, Vulgarity/ obscenity in concept, dress, talk and action are strictly prohibited. \n• Any one from the Panel of Referees has the right to stop the item on the spot if the item is found vulgar. \n• Narration to be done in Hindi or English. \n• Recorded narration NOT allowed. \n• Only one narrator per team and the narrator is allowed to read from a prepared script.\n";
                        openintent(s5);
                        break;
                    case 5: i=6;
                        String s6 = "Entries: 1 Team per college ; Team of 2 only.\n\n" +
                                "Time: Maximum 4 mins including set up, wind up & Sound check time.\n\n" +
                                "Rules: \n• Any kind of music can be used. \n• Any form of dance may be used. \n• However, vulgarity of any kind is strictly prohibited. \n• Any kind of Props are strictly not allowed. \n• No extra setting time will be given for live music, if any. \n• Fire and live props are not allowed.\n";
                        openintent(s6);
                        break;
                    case 6: i=7;
                        String s7 = "Entries: 1 Team per college ; Teams of min.10 and max.15 (inclusive of  narrator).\n\n" +
                                "Time: Maximum 7 mins including set up, wind up, sound check & narration time.\n\n" +
                                "Rules: \n• Teams must do a fashion show on a particular theme of their choice. \n• There can be any number of segments with or without one change of clothing in the given time. \n• Any kind of Props strictly not allowed. \n• Risky gimmicks, fire, AC electricity, bikes, carts, moving wheels, animals, children, infants etc not allowed. \n• Spillage of any kind (eg: Petals, powder, paper pieces etc) is NOT allowed. \n• Topless with body painting is allowed only for men. \n• Narrations are allowed, but only one narrator per team.\n";
                        openintent(s7);
                        break;
                    case 7: i=8;
                        String s8 = "";
                        openintent(s8);
                        break;
                }

            }
        }));
        return v;
    }

    public void openintent(String s)
    {
        Intent intent = new Intent(getContext(), View_Rules_Intent.class);
        intent.putExtra("selected-item", s);

        Bundle bundle=new Bundle();
        if(i==1)
        {
            String coname="Ms. Kavita Nagasampige";
            String cono="+919448775053";
            intent.putExtra("cono",cono);
            intent.putExtra("coname",coname);


            String ve="Venue: Utsav Main Stage, KMC Greens \nOrganised By: SOC, Manipal \nTimings: 09:00 am – 11:30 am";
            intent.putExtra("venue",ve);
            bundle.putInt("image",R.drawable.ic_paint);
            bundle.putString("apptitle", "JAM");
        }
        else if(i==2)
        {
            String coname="Dr. Blessy Prabha Valsaraj";
            String cono="+919945193662";
            intent.putExtra("cono",cono);
            intent.putExtra("coname",coname);
            String ve="Venue: KMC Greens Steps \nOrganised By: MCON, Manipal \nTimings: 09:00 am – 11:00 am";
            intent.putExtra("venue",ve);
            bundle.putInt("image",R.drawable.ic_pottery);
            bundle.putString("apptitle", "CLAY MODELING");
        } else if(i==3)
        {

            String coname="Dr. Arun Urala";
            String cono="+919900173670";
            intent.putExtra("cono",cono);
            intent.putExtra("coname",coname);

            String ve="Venue: Utsav Main Stage, KMC Greens \nOrganised By: MCODS, Manipal \nTimings: 11:30 am – 12:30 pm";
            intent.putExtra("venue",ve);

            bundle.putInt("image",R.drawable.ic_mime);
            bundle.putString("apptitle", "MIME");
        } else if(i==4)
        {

            String coname="Dr. Arun Urala";
            String cono="+919900173670";
            intent.putExtra("cono",cono);
            intent.putExtra("coname",coname);

            String ve="Venue: Utsav Main Stage, KMC Greens \nOrganised By: MCODS, Manipal \nTimings: 02:00 pm – 03:30 pm";
            intent.putExtra("venue",ve);

            bundle.putInt("image",R.drawable.ic_street_play);
            bundle.putString("apptitle", "STREET PLAY");
        } else if(i==5)
        {

            String coname="Ms. Kavita Nagasampige";
            String cono="+919448775053";
            intent.putExtra("cono",cono);
            intent.putExtra("coname",coname);


            String ve="Venue: Utsav Main Stage, KMC Greens \nOrganised By: SOC, Manipal \nTimings: 03:30 pm – 05.00pm";
            intent.putExtra("venue",ve);

            bundle.putInt("image",R.drawable.ic_mad_ads);
            bundle.putString("apptitle", "MAD ADS");
        } else if(i==6)
        {

            String coname="Ms Anusha Pai";
            String cono="+919886017745";
            intent.putExtra("cono",cono);
            intent.putExtra("coname",coname);



            String ve="Venue: Utsav Main stage, KMC Greens \nOrganised By: WGSHA, Manipal \nTimings: 05:00 pm – 06:00 pm";
            intent.putExtra("venue",ve);

            bundle.putInt("image",R.drawable.ic_duet_dance);
            bundle.putString("apptitle", "DUET DANCE");
        } else if(i==7)
        {
            String coname="Dr. Chandini Gupta";
            String cono="+919886738555";
            intent.putExtra("cono",cono);
            intent.putExtra("coname",coname);


            String ve="Venue: Utsav Main stage, KMC Greens \nOrganised By: MCON, WGSHA, KMC, Manipal & MCOPS with CCC, MU \nTimings: 06:00 pm – 08:00 pm";
            intent.putExtra("venue",ve);

            bundle.putInt("image",R.drawable.ic_fashion_show);
            bundle.putString("apptitle", "FASHION SHOW");
        } else if(i==8)
        {

            String coname="Dr. Chandini Gupta";
            String cono="+919886738555";
            intent.putExtra("cono",cono);
            intent.putExtra("coname",coname);

            String ve="Venue: Utsav Main stage, KMC Greens \nOrganised By: MCON, WGSHA, KMC, Manipal & MCOPS with CCC, MU \nTimings: 08:30 pm – 09:00 pm";
            intent.putExtra("venue",ve);

            bundle.putInt("image",R.drawable.ic_prize);
            bundle.putString("apptitle", "VALEDICTORY & PRIZE DISTRIBUTION");
        }
        intent.putExtras(bundle);

        startActivity(intent);
    }
    public List<Data> fill_with_data()
    {
        List<Data> data = new ArrayList<>();
        data.add(new Data("JAM", "\nVenue: Utsav Main Stage, KMC Greens \nOrganised By: SOC, Manipal \nTimings: 09:00 am – 11:30 am", R.drawable.ic_paint ));
        data.add(new Data("CLAY MODELING", "\nVenue: KMC Greens Steps \nOrganised By: MCON, Manipal \nTimings: 09:00 am – 11:00 am", R.drawable.ic_pottery));
        data.add(new Data("MIME", "\nVenue: Utsav Main Stage, KMC Greens \nOrganised By: MCODS, Manipal \nTimings: 11:30 am – 12:30 pm", R.drawable.ic_mime));
        data.add(new Data("STREET PLAY", "\nVenue: Utsav Main Stage, KMC Greens \nOrganised By: MCODS, Manipal \nTimings: 02:00 pm – 03:30 pm", R.drawable.ic_street_play));
        data.add(new Data("MAD ADS", "\nVenue: Utsav Main Stage, KMC Greens \nOrganised By: SOC, Manipal \nTimings: 03:30 pm – 05.00pm", R.drawable.ic_mad_ads));
        data.add(new Data("DUET DANCE", "\nVenue: Utsav Main stage, KMC Greens \nOrganised By: WGSHA, Manipal \nTimings: 05:00 pm – 06:00 pm", R.drawable.ic_duet_dance));
        data.add(new Data("FASHION SHOW", "\nVenue: Utsav Main stage, KMC Greens \nOrganised By: MCON, WGSHA, KMC, Manipal & MCOPS with CCC, MU \nTimings: 06:00 pm – 08:00 pm", R.drawable.ic_fashion_show));
        data.add(new Data("VALEDICTORY & PRIZE DISTRIBUTION", "\nVenue: Utsav Main stage, KMC Greens \nOrganised By: MCON, WGSHA, KMC, Manipal & MCOPS with CCC, MU \nTimings: 08:30 pm – 09:00 pm", R.drawable.ic_prize));
        return data;
    }
}
