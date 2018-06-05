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
public class Listing_Events_Fragment_One extends Fragment
{
    int i;
    public Spinner  spinner;
    public Listing_Events_Fragment_One()
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
        View v = inflater.inflate(R.layout.listing_events_fragment_one, container, false);
        // Inflate the layout for this fragment
        List<Data> data = fill_with_data();
        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.recyclerview);
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
                          switch (position) {
                    case 0:     i=1;
                        String s1 = "Description: Objective is to create a beautiful painting based on any theme.\n\n"+
                                "Entries: Maximum of 2 entries per college.\n\n" +
                                "Time: Maximum 2 hours.\n\n" +
                                "Rules: \n• Expression can be free hand pictorial. \n• Chart paper will be provided." +
                                "\n• Participants have to get their own paint sets, container for water and other required materials. \n• Only water colour is allowed. \n• No oil paints allowed. \n• Participants are NOT allowed to explain their theme to the judges.\n";
                        openintent(s1);
                        break;
                    case 1:    i=2;
                        String s2 = "Description: Objective is to draw a caricature/editorial scene based on a situation " +
                                "given to the participants.\n\n" +
                                "Entries: Maximum of 2 entries per college.\n\n" +
                                "Time: Maximum 2 hours.\n\n" +
                                "Rules: \n• Paper will be provided. \n• Participants must bring their own black High-Tech Pen ONLY. \n• Topic will be given on the spot. \n• Participants are NOT allowed to explain their theme to the judges. \n• NO support will be allowed and only free hand cartooning is permitted.\n";
                        openintent(s2);
                        break;
                    case 2:       i=3;
                        String s3 = "Entries: 1 Team per college; Team of 2. \n\n" +
                                "Time: Maximum 3 minutes to speak ‘for’ and 3 minutes to speak ‘against’ the topic plus one minute for the judges to ask one question to the team.\n\n" +
                                "Rules: \n• Topics must be picked up 24 hours in advance, at Info Desk. \n• Participants whose turn has not come will remain outside the debate room.\n";
                        openintent(s3);
                        break;
                    case 3:     i=4;
                        String s4 = "Entries: 1 Entry per college.\n\n" +
                                "Time: Maximum 3 minutes to speak.\n\n" +
                                "Rules: \n• Topic given on the day of the event, participant has 3 minutes to prepare.\n";
                        openintent(s4);
                        break;
                    case 4:    i=5;
                        String s5 = "Entries: 1 Entry per college.\n\n" +
                                "Time: 2 mins for set up and sound check & maximum 5 mins for performance.\n\n" +
                                "Rules: \n• Any Classical & Non Classical music instruments allowed. \n• One or two accompanist excluding Tanpura are allowed. \n• Electronic shruti is allowed, but other classical electronic instruments not allowed. \n• No music software is allowed.\n";
                        openintent(s5);
                        break;
                    case 5:      i=6;
                        String s6 = "Entries: 1 Team per college; Team of maximum 3.\n\n" +
                                "Rules: \n• Final round may include Dumb Charade, TDH, Pictionary. \n• Specific rules regarding the evaluation procedure, time to answer a particular question and the type of rounds will be given during the event.\n";
                        openintent(s6);
                        break;
                    case 6:      i=7;
                        String s7 = "Entries: 1 Parade per college; Team of min 10 and max 20 (inclusive of narrator)\n\n" +
                                "Time: Max 5mins including set up, wind up, sound check & Narration time \n\n" +
                                "Rules: \n• Stage props and Props measuring more than 2 X 2 Feet are not allowed.\n• Minimal hand held props like Chinese fan, umbrella, artificial trishul/sword, Dandiya sticks, small Mutka, or any prop that is not more than 1.5 X 1.5 feet are allowed subject to prior screening and approval by CCC. \n• Risky gimmicks, marshal art or real weapons, fire, AC electricity, bikes, carts, moving wheels, animals, children, infants etc not allowed. \n• Spillage of any kind (eg: Petals, powder, paper pieces etc) is NOT allowed. \n• During presentations, NO college flag or national flag is allowed on the stage and colleges will be disqualified if found using the same.\n• Narrations and recorded music are allowed for the presentation, but only one narrator per team.\n";
                        openintent(s7);
                        break;
                    case 7:    i=8;
                        String s8 = "Entries: 1 Entry per college.\n\n" +
                                "Time: Maximum 4 min including set up, wind up and sound check time.\n\n" +
                                "Rules: \n• Songs can be from a film of any Indian language. \n• Non film songs such as Geeth/Ghazals are also allowed. \n• Religious and/or prayer songs not allowed. \n• Original classical kritis, keerthans, bhajans and abhangs are not allowed. \n• Orchestra will NOT be provided or allowed. \n• Self-guitar or any other instrumental support is NOT allowed. \n• Participants may sing with or without Karaoke.\n";
                        openintent(s8);
                        break;
                    case 8:     i=9;
                        String s9 = "Entries: 1 Team per college ; Team of minimum 4 & maximum 8 singers\n\n" +
                                "Time: Maximum 4 min including set up wind up and sound check time.\n\n" +
                                "Rules: \n• Songs can be from a film of any Indian language. \n• Religious and/or prayer songs not allowed. \n• Original classical kritis, keerthans, bhajans and abhangs are not allowed. \n• Orchestra will NOT be provided or allowed. \n• Self-guitar or any other instrumental support is NOT allowed. \n• Participants may sing with or without Karaoke.\n";
                        openintent(s9);
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
                String coname="Ms. Salma Taj";
                String cono="+919900816188";
                intent.putExtra("cono",cono);
                intent.putExtra("coname",coname);

                String ve="Venue: Dr TMA Pai 1st Floor \nOrganised By: ICAS, Manipal \nTimings: 09:00 am – 11:00 am";
                intent.putExtra("venue",ve);
               bundle.putInt("image",R.drawable.ic_paint);
                bundle.putString("apptitle", "PAINTING");
            }
            else if(i==2)
            {
                String coname="Ms. Salma Taj";
                String cono="+919900816188";
                intent.putExtra("cono",cono);
                intent.putExtra("coname",coname);


                String ve="Venue: Dr TMA Pai 1st Floor \nOrganised By: ICAS, Manipal \nTimings: 11:00 am – 01:00 pm";
                intent.putExtra("venue",ve);
              bundle.putInt("image",R.drawable.ic_cartoon);
                bundle.putString("apptitle", "CARTOONING");
            }
            else if(i==3)
        {
            String coname="Ms. Winniecia Dkhar";
            String cono="+918095372184";
            intent.putExtra("cono",cono);
            intent.putExtra("coname",coname);


            String ve="Venue: Counseling Hall, Manipal.edu building \nOrganised By: SOAHS, Manipal \nTimings: 09:00 am – 11:00 am";
            intent.putExtra("venue",ve);
            bundle.putInt("image",R.drawable.ic_debate);
            bundle.putString("apptitle", "DEBATE");
        }
            else if(i==4)
        {

            String coname="Ms. Winniecia Dkhar";
            String cono="+918095372184";
            intent.putExtra("cono",cono);
            intent.putExtra("coname",coname);


            String ve="Venue: Counseling Hall, Manipal.edu building \nOrganised By: SOAHS, Manipal \nTimings: 11:00 am – 01:00 pm";
            intent.putExtra("venue",ve);
            bundle.putInt("image",R.drawable.ic_extempore);
            bundle.putString("apptitle", "EXTEMPORE");
        }
            else if(i==5)
        {

            String coname="Dr. Blessy Prabha Valsaraj";
            String cono="+919945193662";
            intent.putExtra("cono",cono);
            intent.putExtra("coname",coname);

            String ve="Venue: Counseling Hall, Manipal.edu building \nOrganised By: MCON, Manipal \nTimings: 02:00 pm – 04.00pm";
            intent.putExtra("venue",ve);
            bundle.putInt("image",R.drawable.ic_inst);
            bundle.putString("apptitle", "INSTRUMENTAL SOLO");
        } else if(i==6)
        {

            String coname="Ms. Kavita Nagasampige";
            String cono="+919448775053";
            intent.putExtra("cono",cono);
            intent.putExtra("coname",coname);


            String ve="Venue: Utsav Main stage, KMC Greens \nOrganised By: SOC, Manipal \nTimings: 02:00 pm – 04:00 pm";
            intent.putExtra("venue",ve);
            bundle.putInt("image",R.drawable.ic_potp);
            bundle.putString("apptitle", "POT POURRI");
        } else if(i==7)
        {


            String coname="Dr. Chandini Gupta";
            String cono="+919886738555";
            intent.putExtra("cono",cono);
            intent.putExtra("coname",coname);



            String ve="Venue: Utsav Main stage, KMC Greens \nOrganised By: KMC, Manipal \nTimings: 05:00 pm – 07:00 pm";
            intent.putExtra("venue",ve);
            bundle.putInt("image",R.drawable.ic_cul_pro);
            bundle.putString("apptitle", "CULTURAL PROCESSION PARADE");
        } else if(i==8)
        {


            String coname="Dr. B. Suresh Kumar Shetty";
            String cono="+919886092392";
            intent.putExtra("cono",cono);
            intent.putExtra("coname",coname);



            String ve="Venue: Utsav Main stage, KMC Greens \nOrganised By: KMC, Mangalore \nTimings: 07:00 pm – 08:30 pm";
            intent.putExtra("venue",ve);
            bundle.putInt("image",R.drawable.ic_vocal_solo);
            bundle.putString("apptitle", "INDIAN NON CLASSICAL LIGHT VOCAL (SOLO)");
        } else if(i==9)
        {


            String coname="Dr. B. Suresh Kumar Shetty";
            String cono="+919886092392";
            intent.putExtra("cono",cono);
            intent.putExtra("coname",coname);



            String ve="Venue: Utsav Main stage, KMC Greens \nOrganised By: KMC, Mangalore \nTimings: 08:30 pm – 10:00 pm";
            intent.putExtra("venue",ve);
            bundle.putInt("image",R.drawable.ic_group_vocal);
            bundle.putString("apptitle", "INDIAN NON CLASSICAL LIGHT VOCAL (GROUP)");
        }
        intent.putExtras(bundle);
        startActivity(intent);


    }
    public List<Data> fill_with_data()
    {
        List<Data> data = new ArrayList<>();
        data.add(new Data("PAINTING", "\nVenue: Dr TMA Pai 1st Floor \nOrganised By: ICAS, Manipal \nTimings: 09:00 am – 11:00 am", R.drawable.ic_paint ));
        data.add(new Data("CARTOONING", "\nVenue: Dr TMA Pai 1st Floor \nOrganised By: ICAS, Manipal \nTimings: 11:00 am – 01:00 pm", R.drawable.ic_cartoon));
        data.add(new Data("DEBATE", "\nVenue: Counseling Hall, Manipal.edu building \nOrganised By: SOAHS, Manipal \nTimings: 09:00 am – 11:00 am", R.drawable.ic_debate));
        data.add(new Data("EXTEMPORE", "\nVenue: Counseling Hall, Manipal.edu building \nOrganised By: SOAHS, Manipal \nTimings: 11:00 am – 01:00 pm", R.drawable.ic_extempore));
        data.add(new Data("INSTRUMENTAL (SOLO)", "\nVenue: Counseling Hall, Manipal.edu building \nOrganised By: MCON, Manipal \nTimings: 02:00 pm – 04.00pm", R.drawable.ic_inst));
        data.add(new Data("POT POURRI", "\nVenue: Utsav Main stage, KMC Greens \nOrganised By: SOC, Manipal \nTimings: 02:00 pm – 04:00 pm", R.drawable.ic_potp));
        data.add(new Data("CULTURAL PROCESSION, PARADE, INAUGURATION & PRIZE DISTRIBUTION", "\nVenue: Utsav Main stage, KMC Greens \nOrganised By: KMC, Manipal \nTimings: 05:00 pm – 07:00 pm", R.drawable.ic_cul_pro));
        data.add(new Data("INDIAN NON CLASSICAL LIGHT VOCAL (SOLO)", "\nVenue: Utsav Main stage, KMC Greens \nOrganised By: KMC, Mangalore \nTimings: 07:00 pm – 08:30 pm", R.drawable.ic_vocal_solo));
        data.add(new Data("INDIAN NON CLASSICAL LIGHT VOCAL (GROUP)", "\nVenue: Utsav Main stage, KMC Greens \nOrganised By: KMC, Mangalore \nTimings: 08:30 pm – 10:00 pm", R.drawable.ic_group_vocal));
        return data;
    }
}