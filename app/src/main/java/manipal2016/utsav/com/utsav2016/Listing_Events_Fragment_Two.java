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
public class Listing_Events_Fragment_Two extends Fragment
{
    int i;
    public Spinner spinner;
    RecyclerView recyclerView;
    public Listing_Events_Fragment_Two()
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
        View v = inflater.inflate(R.layout.listing_events_fragment_two, container, false);
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
            public void onLongClick(View view, int position) {
                        switch (position)
                {
                    case 0: i=1;
                        String s1="Description: Objective is to create an intelligent, integrative, colorful rangoli, on " +
                                "any theme, using ONLY rangoli powder.\n\n" +
                                "Entries: 1 Team per college ; Team of maximum 3.\n\n" +
                                "Time: Maximum 2 hours.\n\n" +
                                "Rules: \n• Expression can be free hand pictorial, descriptive on any theme. \n• Chalk will be provided. \n• Participants must get their own colored powder. \n• No rice grains, flower petals, salt crystals etc are allowed. \n• No props are allowed. \n• Sieves and base not allowed. \n• Colours may be mixed with white rangoli powder or sand. \n• A space of area 3/3 feet will be provided. \n• Participants are NOT allowed to explain their theme to the judges.\n";
                        openintent(s1);
                        break;
                    case 1: i=2;

                        String s2="Description: Objective is to use your swift hands and intelligence to create an" +
                                "original piece of artwork using hand-cut pieces of paper.\n\n" +
                                "Entries: Maximum of 2 teams per college ; Teams of maximum 3.\n\n" +
                                "Time: Maximum 2 hours.\n\n" +
                                "Rules: \n• Topic will be given on the spot. \n• Only registered chart paper will be provided. \n• Participants must bring paper, magazines, newspapers and glue. \n• No scissors (all paper must be torn by hands), pens, or pencils will be allowed. \n• No burning of the edges of paper allowed. \n• 3-D imaging not allowed. \n• Participants have to explain (Max time 3 minutes) the theme of their collage to the judges during the competitions. \n• Collage will be marked by the judges accordingly. \n• No support is allowed. \n• NO painting or colouring allowed.\n";
                        openintent(s2);
                        break;
                    case 2: i=3;
                        String s3="Entries: Maximum of 2 teams per college; Teams of maximum 3.\n\n" +
                                "Rules: \n• Preliminary round will take place on the day of the event. \n• Only 6 teams will go to the finals. \n• The finals will be oral and will include audiovisual questions. \n• Specific rules regarding the evaluation procedure, time to answer a particular question and the type of rounds will be given at the venue during the competition.\n";
                        openintent(s3);
                        break;
                    case 3:  i=4;
                        String s4="Entries: Maximum of 2 teams per college; Teams of max 3\n\n" +
                                "Rules: \n• Only Hindi. \n• Written preliminary round. \n• Top 6 teams will go to finals. \n• Specific rules regarding the evaluation procedure, time to answer, types of rounds etc. will be given during the event.";
                        openintent(s4);
                        break;
                    case 4:  i=5;
                        String s5="Entries: 1 Entry per college.\n\n" +
                                "Time: 2 mins for set up and sound check & Maximum 5 mins for performance.\n\n" +
                                "Rules: \n• Songs must be purely classical. \n• Original kritis are allowed but filmi or folk songs (even though classically based) not allowed. \n• Non film songs like geeth/ghazals/bhajans and abhangs not allowed. \n• Participants are allowed 2 accompanists, (excluding Tanpura) that have to be arranged by themselves. \n• Recorded background music or karaoke is NOT allowed. \n• Electronic shruti is allowed but other electronic instruments or music software are not allowed. \n• Name of the Raga & Tala should be announced by the participant at the beginning.\n";
                        openintent(s5);
                        break;
                    case 5:  i=6;
                        String s6="Entries: 1 Team per college; Team of minimum 3 & maximum 5\n\n" +
                                "Time: Maximum 4 mins including set up, wind up & sound check time \n\n" +
                                "Rules: \n• Any type of musical instrument is not allowed. \n• Play anything which is not a musical instrument. For example: Beat Boxing, Cups and Plates with sticks/spoons etc. \n• Any form of vocals not allowed (except in beat boxing). \n• Maximum TWO tables shall be provided for the items used by the participant. \n• Recorded background music or karaoke track NOT allowed.\n";
                        openintent(s6);
                        break;
                    case 6:  i=7;
                        String s7="Entries: Maximum of 2 teams per college; Teams of maximum 3.\n\n" +
                                "Rules: \n• Preliminary round will take place on the day of the event. \n• Only 6 teams will go to the finals. \n• The finals will be oral and will include audio visual questions. \n• Specific rules regarding the evaluation procedure, time to answer a particular question and the type of rounds will be given at the venue during the competition.\n";
                        openintent(s7);
                        break;
                    case 7:  i=8;
                        String s8="Entries: 1 Entry per college.\n\n" +
                                "Time: Maximum 5 mins including set up, wind up & Sound check time.\n\n" +
                                "Rules: \n• Only Indian classical dance steps are allowed. \n• No film/folk steps allowed. \n• Recorded music allowed, but music should be classical, not film music (classical dance steps from Hindi film music, classical songs from movies not allowed.) \n• No extra setting time will be given for live music, if any. \n• Any kind of Props strictly not allowed. \n• Fire and live props (like birds, animals, infants) not allowed. \n";
                        openintent(s8);
                        break;
                    case 8:  i=9;
                        String s9="Entries: 1 Entry per college.\n\n" +
                                "Time: Maximum 4 mins including set up, wind up & sound check time. \n\n" +
                                "Rules: \n• Creativity allowed. \n• Recorded music allowed. \n• No extra setting time will be given for live music, if any. \n• Songs from Hindi or any other Indian language movies/album or folk songs are allowed. \n• Any kind of Props strictly not allowed. \n• Risky gimmicks such as marshal art dancing, blind fold dancing, using fire, AC electricity, bikes, carts, moving wheels, animals, children, infants etc not allowed. \n• Folk dance and fusion of Indian steps is allowed. \n• Spillage of any kind (eg: Petals, powder, paper pieces etc) is NOT allowed. \n";
                        openintent(s9);
                        break;
                    case 9:i=10;
                        String s10="";
                        openintent(s10);
                        break;
                    case 10: i=11;

                        String s11="Entries: 1 Team per college; Team of minimum 5 and maximum 10.\n\n" +
                                "Time: Maximum 5 mins including set up, windup & sound check time.\n\n" +
                                "Rules: \n• Creativity allowed. \n• Recorded music allowed. \n• No extra setting time will be given for live music, if any. \n• Songs from Hindi or any other Indian language movies/album or folk songs are allowed. \n• Any kind of Props strictly not allowed. \n• Risky gimmicks such as marshal art dancing, blind fold dancing, using fire, AC electricity, bikes, carts, moving wheels, animals, children, infants etc not allowed. \n• Folk dance and fusion of Indian steps is allowed. \n• Spillage of any kind (eg: Petals, powder, paper etc) is NOT allowed. \n";
                        openintent(s11);
                        break;
                }
            }
        }));
        return v;
    }

    public void openintent(String s)
    {
        Intent intent = new Intent(getContext(), View_Rules_Intent.class);
        intent.putExtra("selected-item",s);

        Bundle bundle=new Bundle();
        if(i==1)
        {

            String coname="Mr. John Benette John";
            String cono="+918971028721";
            intent.putExtra("cono",cono);
            intent.putExtra("coname",coname);


            String ve="Venue: Dr TMA Pai 1st Floor \nOrganised By: FOA, Manipal \nTimings: 09:00 am – 11:00 am";
            intent.putExtra("venue",ve);


            bundle.putInt("image",R.drawable.ic_rangoli);
            bundle.putString("apptitle", "RANGOLI");
        }
        else if(i==2)
        {

            String coname="Mr. John Benette John";
            String cono="+918971028721";
            intent.putExtra("cono",cono);
            intent.putExtra("coname",coname);

            String ve="Venue: Dr TMA Pai 1st Floor \nOrganised By: FOA, Manipal \nTimings: 11:00 am – 01:00 pm";
            intent.putExtra("venue",ve);

            bundle.putInt("image",R.drawable.ic_collage);
            bundle.putString("apptitle", "COLLAGE");
        } else if(i==3)
        {
            String coname="Dr. A. Muthusamy";
            String cono="+919448763720";
            intent.putExtra("cono",cono);
            intent.putExtra("coname",coname);

            String ve="Venue: Dr TMA Pai 1st Floor \nOrganised By: SOLS, Manipal \nTimings: 09:00 am – 11:00 am";
            intent.putExtra("venue",ve);

            bundle.putInt("image",R.drawable.ic_quiz);
            bundle.putString("apptitle", "GENERAL QUIZ");
        } else if(i==4)
        {
            String coname="Dr Mithun Pai";
            String cono="+919591955595";
            intent.putExtra("cono",cono);
            intent.putExtra("coname",coname);

            String ve="Venue: Dr TMA Pai 1st Floor \nOrganised By: MCODS, Mangalore \nTimings: 11:00 am – 01:00 pm";
            intent.putExtra("venue",ve);

            bundle.putInt("image",R.drawable.ic_antakshari);
            bundle.putString("apptitle", "ANTAKSHARI");
        } else if(i==5)
        {
            String coname="Dr. B. Suresh Kumar Shetty";
            String cono="+919886092392";
            intent.putExtra("cono",cono);
            intent.putExtra("coname",coname);

            String ve="Venue: Counseling Hall, MU \nOrganised By: KMC, Mangalore \nTimings: 02:00 pm – 05.00pm";
            intent.putExtra("venue",ve);

            bundle.putInt("image",R.drawable.ic_vocal_solo_sing);
            bundle.putString("apptitle", "CARNATIC/HINDUSTANI CLASSICAL VOCAL (SOLO)");
        } else if(i==6)
        {

            String coname="Mr. John Benette John";
            String cono="+918971028721";
            intent.putExtra("cono",cono);
            intent.putExtra("coname",coname);

            String ve="Venue: Utsav Main stage, KMC Greens \nOrganised By: MIT, Manipal \nTimings: 11:00 am – 01:00 pm";
            intent.putExtra("venue",ve);

            bundle.putInt("image",R.drawable.ic_creative_jam);
            bundle.putString("apptitle", "CREATIVE JAM");
        } else if(i==7)
        {

            String coname="Dr. A. Muthusamy";
            String cono="+919448763720";
            intent.putExtra("cono",cono);
            intent.putExtra("coname",coname);

            String ve="Venue: Utsav Main stage, KMC Greens \nOrganised By: SOLS, Manipal \nTimings: 02:00 pm – 03:45 pm";
            intent.putExtra("venue",ve);

            bundle.putInt("image",R.drawable.ic_quiz_finals);
            bundle.putString("apptitle", "GENERAL QUIZ");
        } else if(i==8)
        {

            String coname="Mr. John Benette John";
            String cono="+918971028721";
            intent.putExtra("cono",cono);
            intent.putExtra("coname",coname);

            String ve="Venue: Utsav Main stage, KMC Greens \nOrganised By: FOA, Manipal \nTimings: 04:00 pm – 06:00 pm";
            intent.putExtra("venue",ve);

            bundle.putInt("image",R.drawable.ic_classical_dance_solo);
            bundle.putString("apptitle", "INDIAN CLASSICAL DANCE (SOLO)");
        } else if(i==9)
        {

            String coname="Mr. John Benette John";
            String cono="+918971028721";
            intent.putExtra("cono",cono);
            intent.putExtra("coname",coname);

            String ve="Venue: Utsav Main stage, KMC Greens \nOrganised By: FOA, Manipal \nTimings: 06:00 pm – 08:00 pm";
            intent.putExtra("venue",ve);

            bundle.putInt("image",R.drawable.ic_solo_clss);
            bundle.putString("apptitle", "INDIAN NON CLASSICAL DANCE (SOLO)");
        }
        else if(i==10)
        {
            String coname="Dr Alex Joseph";
            String cono="+919448548060";
            intent.putExtra("cono",cono);
            intent.putExtra("coname",coname);


            String ve="Venue: Utsav Main stage, KMC Greens \nOrganised By: MCOPS, Manipal \nTimings: 06:45 pm – 07:00 pm";
            intent.putExtra("venue",ve);

            bundle.putInt("image",R.drawable.ic_prize1);
            bundle.putString("apptitle", "PRIZE DISTRIBUTION");
        }
        else if(i==11)
        {
            String coname="Dr Alex Joseph";
            String cono="+919448548060";
            intent.putExtra("cono",cono);
            intent.putExtra("coname",coname);

            String ve="Venue: Utsav Main stage, KMC Greens \nOrganised By: MCOPS, Manipal \nTimings: 08:00 pm – 10:00 pm";
            intent.putExtra("venue",ve);

            bundle.putInt("image",R.drawable.ic_indian_non_classical);
            bundle.putString("apptitle", "INDIAN NON CLASSICAL DANCE (GROUP)");
        }
        intent.putExtras(bundle);

        startActivity(intent);
    }

    public List<Data> fill_with_data()
    {
        List<Data> data = new ArrayList<>();
        data.add(new Data("RANGOLI", "\nVenue: Dr TMA Pai 1st Floor \nOrganised By: FOA, Manipal \nTimings: 09:00 am – 11:00 am", R.drawable.ic_rangoli ));
        data.add(new Data("COLLAGE", "\nVenue: Dr TMA Pai 1st Floor \nOrganised By: FOA, Manipal \nTimings: 11:00 am – 01:00 pm", R.drawable.ic_collage));
        data.add(new Data("QUIZ (PRELIMS)", "\nVenue: Dr TMA Pai 1st Floor \nOrganised By: SOLS, Manipal \nTimings: 09:00 am – 11:00 am", R.drawable.ic_quiz));
        data.add(new Data("ANTAKSHARI (PRELIMS)", "\nVenue: Dr TMA Pai 1st Floor \nOrganised By: MCODS, Mangalore \nTimings: 11:00 am – 01:00 pm", R.drawable.ic_antakshari));
        data.add(new Data("INDIAN CLASSICAL VOCAL (SOLO)", "\nVenue: Counseling Hall, MU \nOrganised By: KMC, Mangalore \nTimings: 02:00 pm – 05.00pm", R.drawable.ic_vocal_solo_sing));
        data.add(new Data("CREATIVE JAM", "\nVenue: Utsav Main stage, KMC Greens \nOrganised By: MIT, Manipal \nTimings: 11:00 am – 01:00 pm", R.drawable.ic_creative_jam));
        data.add(new Data("QUIZ (FINALS)", "\nVenue: Utsav Main stage, KMC Greens \nOrganised By: SOLS, Manipal \nTimings: 02:00 pm – 03:45 pm", R.drawable.ic_quiz_finals));
        data.add(new Data("INDIAN CLASSICAL DANCE (SOLO)", "\nVenue: Utsav Main stage, KMC Greens \nOrganised By: FOA, Manipal \nTimings: 04:00 pm – 06:00 pm", R.drawable.ic_classical_dance_solo));
        data.add(new Data("INDIAN NON CLASSICAL DANCE (SOLO)", "\nVenue: Utsav Main stage, KMC Greens \nOrganised By: FOA, Manipal \nTimings: 06:00 pm – 08:00 pm", R.drawable.ic_solo_clss));
        data.add(new Data("PRIZE DISTRIBUTION", "\nVenue: Utsav Main stage, KMC Greens \nOrganised By: MCOPS, Manipal \nTimings: 06:45 pm – 07:00 pm", R.drawable.ic_prize1));
        data.add(new Data("INDIAN NON CLASSICAL DANCE (GROUP)", "\nVenue: Utsav Main stage, KMC Greens \nOrganised By: MCOPS, Manipal \nTimings: 08:00 pm – 10:00 pm", R.drawable.ic_indian_non_classical));
        return data;
    }
}