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
public class Listing_Events_Fragment_Three extends Fragment
{
    int i;
    public Spinner spinner;
    RecyclerView recyclerView;
    public Listing_Events_Fragment_Three()
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
        View v = inflater.inflate(R.layout.listing_events_fragment_three, container, false);
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
            public void onClick(View view, int position) {
                           }

            @Override
            public void onLongClick(View view, int position) {
                               switch (position) {
                    case 0:
                        i = 1;
                        String s1 = "Description: Objective is to capture a photo on the given theme.\n\n" +
                                "Entries: Maximum of 2 entries per college.\n\n" +
                                "Time: Maximum 2 hours.\n\n" +
                                "Rules: \n• The participant has to bring his/her own digital camera. \n• The Participant has to capture 3 photographs on the theme announced on the spot by the judges. \n• No mixing, matching or morphing of photographs will be permitted. \n• Software such as Photoshop etc. for enhancing images not permitted.\n• The organizers will have all rights for the use of these pictures as and when they deem fit. \n• Digital images are evaluated on the basis of impact, composition, technical quality and relevance to the theme. \n• Additional instructions will be announced on spot.\n";
                        openintent(s1);
                        break;
                    case 1:
                        i = 2;
                        String s2 = "Description: Objective is to install a 3-dimensional structure from building blocks.\n\n" +
                                "Entries: 1 Team per college ; Team of maximum 3.\n\n" +
                                "Time: Maximum 2 hours.\n\n" +
                                "Rules: \n• Installation may be based on any theme but the theme has to be specified by each team. \n• Building blocks can be anything of participants’ choice and imagination, like thermocole pieces, soft drink bottle caps, old CDs or floppies etc. \n• Preformed shapes, templates, LED lights, skulls, bones, currency notes, etc., not allowed. \n• A space of volume 3/3/3 feet will be provided. \n• Installations must not exceed the boundaries in any of the three dimensions. \n• DC operated LED can be used, no AC facility will be provided.\n• Judgement will be based on choice of building blocks and their correlation to the theme chosen, imagination and creativity. \n• Participants are NOT allowed to explain their theme to the judges.\n";
                        openintent(s2);
                        break;
                    case 2:
                        i = 3;
                        String s3 = "Entries: 1 Entry per college\n\n" +
                                "Time: Maximum 3 minutes for recitation \n\n" +
                                "Rules: \n• Three topics will be given ONE hour in advance at the Info Desk. \n• Poems need to be composed by the participants themselves on one or more of the three given topics. \n• No limit on the number of poems per participant but time should not be exceeded. \n• Poems should be in English only. \n• Participants can give short introductions to their poems but this should be within the permitted total time. \n• Poets have to give hard copy of their poem to one of the judges before they recite.\n";
                        openintent(s3);
                        break;
                    case 3:
                        i = 4;
                        String s4 = "Entries: 1 Entry per college\n\n" +
                                "Time: Maximum 3 minutes for recitation.\n\n" +
                                "Rules: \n• Three topics will be given ONE hour in advance at the info desk. \n• Poems need to be original and composed by the participants themselves on one or more of the three topics. \n• No limit on the number of poems per participant but time should not be exceeded. \n• Poems should be in Hindi only. \n• Participants can give short introductions to their poems but this should be within the permitted total time. \n• Poets have to give hard copy of their poems to the judges before recital.\n";
                        openintent(s4);
                        break;
                    case 4:
                        i = 5;
                        String s5 = "Entries: 1 Entry per college.\n\n" +
                                "Time: Maximum 3 minutes.\n\n" +
                                "Rules: \n• Theme will be given 24 hours in advance at the Info Desk. \n• Only different personalities, situations can be mimicked. \n• Language to be used is Hindi or English only. \n• No use of foul, intimidating or offending language. \n• Emphasis should be on humor and should not hurt sentiments of any person or group of persons, community, cast, religion or political party, etc. \n• Any one from the Panel of Referees has the right to stop the item on the spot if the item is found vulgar.\n";
                        openintent(s5);
                        break;
                    case 5:
                        i = 6;
                        String s6 = "Entries: Maximum of 2 teams per college Teams of max 3\n\n" +
                                "Rules: \n• Only Hindi. \n• Written preliminary round. \n• Top 6 teams will go to finals. \n• Specific rules regarding the evaluation procedure, time to answer, types of rounds etc. will be given during the event.\t";
                        openintent(s6);
                        break;
                    case 6:
                        i = 7;
                        String s7 = "Entries: 1 Entry per college\n\n" +
                                "Time: Maximum 4 min including set up, wind up and sound check time.\n\n" +
                                "Rules: \n• Songs must be sung in English or any other foreign language. \n• Religious and/or prayer songs not allowed. \n• Orchestra will NOT be provided or allowed. \n• Self-guitar or any other instrumental support is NOT allowed. \n• Participants may sing with or without Karaoke.\n";
                        openintent(s7);
                        break;
                    case 7:
                        i = 8;
                        String s8 = "Entries: 1 Team per college ; Team of minimum 4 & maximum 8 singers.\n\n" +
                                "Time: Maximum 4 min including set up, wind up and sound check time.\n\n" +
                                "Rules: \n• Songs must be sung in English or any other foreign language. \n• Religious and/or prayer songs not allowed. \n• Orchestra will NOT be provided or allowed. \n• Self-guitar or any other instrumental support is NOT allowed. \n• Participants may sing with or without Karaoke. \n";
                        openintent(s8);
                        break;
                    case 8:
                        i = 9;
                        String s9 = "";
                        openintent(s9);
                        break;
                    case 9:
                        i = 10;
                        String s10 = "Entries: 1 Entry per college\n\n" +
                                "Time: Maximum 4 mins including set up, wind up & sound check time.\n\n" +
                                "Rules: \n• Only western/non Indian dance steps. \n• Recorded music allowed. \n• No extra setting time will be given for live music, if any. \n• Dance must be to English or any other foreign language song/tune. \n• No Indian dance steps or songs allowed. \n• Any kind of Props strictly not allowed. \n• Risky gimmicks such as marshal art dancing, blind fold dancing, using fire, AC electricity, bikes, carts, moving wheels, animals, children, infants etc not allowed. \n• Fusion of Non Indian steps is allowed. \n• Spillage of any kind (eg: Petals, powder, paper etc) is NOT allowed.\n";
                        openintent(s10);
                        break;
                    case 10:
                        i = 11;
                        String s11 = "Entries: 1 Team per college ; Team of minimum 5 and maximum 10.\n\n" +
                                "Time: Maximum 5 mins including set up, wind up & sound check time.\n\n" +
                                "Rules: \n• Only western/non Indian dance steps. \n• Recorded music allowed. \n• No extra setting time will be given for live music, if any. \n• Dance must be to English or any other foreign language song/tune. \n• No Indian dance steps or songs allowed. \n• Any kind of Props strictly not allowed. \n• Risky gimmicks such as marshal art dancing, blind fold dancing, using fire, AC electricity, bikes, carts, moving wheels, animals, children, infants etc not allowed. \n• Fusion of Non Indian steps is allowed. \n• Spillage of any kind (eg: Petals, powder, etc) is NOT allowed. \n• Topless dance is NOT allowed\n";
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
        intent.putExtra("selected-item", s);

        Bundle bundle=new Bundle();
        if(i==1)
        {
            String coname="Dr. Mohandas Rao KG";
            String cono="+919741988839";
            intent.putExtra("cono",cono);
            intent.putExtra("coname",coname);
            String ve="Venue: MMMC, Manipal \nOrganised By: MMMC, Manipal \nTimings: 09:00 am – 11:00 am";
            intent.putExtra("venue",ve);


            bundle.putInt("image",R.drawable.ic_spt_pht);
            bundle.putString("apptitle", "SPOT PHOTOGRAPHY");
        }
        else if(i==2)
        {
            String coname="Dr. Mohandas Rao KG";
            String cono="+919741988839";
            intent.putExtra("cono",cono);
            intent.putExtra("coname",coname);
            String ve="Venue: MMMC, Manipal \nOrganised By: MMMC, Manipal \nTimings: 11:00 am – 01:00 pm";
            intent.putExtra("venue",ve);
            bundle.putInt("image",R.drawable.ic_installation);
            bundle.putString("apptitle", "INSTALLATION");
        } else if(i==3)
        {

            String coname="Dr. Arun Urala";
            String cono="+919900173670";
            intent.putExtra("cono",cono);
            intent.putExtra("coname",coname);

            String ve="Venue: Counseling Hall, MU \nOrganised By: MCODS, Manipal \nTimings: 09:00 am – 11:00 am";
            intent.putExtra("venue",ve);

            bundle.putInt("image",R.drawable.ic_poetry);
            bundle.putString("apptitle", "POETRY (ENGLISH)");
        } else if(i==4)
        {
            String coname="Dr. Arun Urala";
            String cono="+919900173670";
            intent.putExtra("cono",cono);
            intent.putExtra("coname",coname);

            String ve="Venue: Counseling Hall, MU \nOrganised By: MCODS, Manipal \nTimings: 11:00 am – 01:00 pm";
            intent.putExtra("venue",ve);

            bundle.putInt("image",R.drawable.ic_hindi_poetry);
            bundle.putString("apptitle", "POETRY (HINDI)");
        } else if(i==5)
        {
            String coname="Mr. Darryl Jeethesh D’Souza";
            String cono="+919986382162";
            intent.putExtra("cono",cono);
            intent.putExtra("coname",coname);

            String ve="Venue: Counseling Hall, MU \nOrganised By: SOIS, Manipal \nTimings: 02:00 pm – 04.00pm";
            intent.putExtra("venue",ve);

            bundle.putInt("image",R.drawable.ic_mimcry);
            bundle.putString("apptitle", "MIMICRY");
        } else if(i==6)
        {
            String coname="Dr Mithun Pai";
            String cono="+919591955595";
            intent.putExtra("cono",cono);
            intent.putExtra("coname",coname);

            String ve="Venue: Utsav Main stage, KMC Greens \nOrganised By: MCODS, Mangalore \nTimings: 02:00 pm – 04:00 pm";
            intent.putExtra("venue",ve);

            bundle.putInt("image",R.drawable.ic_ant_final);
            bundle.putString("apptitle", "ANTAKSHARI (FINALS)");
        } else if(i==7)
        {
            String coname="Ms. Winniecia Dkhar";
            String cono="+918095372184";
            intent.putExtra("cono",cono);
            intent.putExtra("coname",coname);

            String ve="Venue: Utsav Main stage, KMC Greens \nOrganised By: SOAHS, Manipal \nTimings: 04:00 pm – 05:15 pm";
            intent.putExtra("venue",ve);

            bundle.putInt("image",R.drawable.ic_solo_western);
            bundle.putString("apptitle", "WESTERN/NON INDIAN VOCAL (SOLO)");
        } else if(i==8)
        {
            String coname="Ms. Winniecia Dkhar";
            String cono="+918095372184";
            intent.putExtra("cono",cono);
            intent.putExtra("coname",coname);

            String ve="Venue: Utsav Main stage, KMC Greens \nOrganised By: SOAHS, Manipal \nTimings: 05:15 pm – 06:45 pm";
            intent.putExtra("venue",ve);

            bundle.putInt("image",R.drawable.ic_group_vocal_western);
            bundle.putString("apptitle", "WESTERN/NON INDIAN VOCAL (GROUP)");
        } else if(i==9)
        {
            String coname="Ms. Winniecia Dkhar";
            String cono="+918095372184";
            intent.putExtra("cono",cono);
            intent.putExtra("coname",coname);


            String ve="Venue: Utsav Main stage, KMC Greens \nOrganised By: SOAHS, Manipal \nTimings: 06:45 pm – 07:00 pm";
            intent.putExtra("venue",ve);

            bundle.putInt("image",R.drawable.ic_prizeee);
            bundle.putString("apptitle", "PRIZE DISTRIBUTION");
        }
        else if(i==10)
        {
            String coname="Mr. John Benette John";
            String cono="+918971028721";
            intent.putExtra("cono",cono);
            intent.putExtra("coname",coname);



            String ve="Venue: Utsav Main stage, KMC Greens \nOrganised By: MIT, Manipal \nTimings: 07:00 pm – 08:30 pm";
            intent.putExtra("venue",ve);

            bundle.putInt("image",R.drawable.ic_western);
            bundle.putString("apptitle", "WESTERN/NON INDIAN DANCE (SOLO)");
        }
        else if(i==11)
        {
            String coname="Mr. John Benette John";
            String cono="+918971028721";
            intent.putExtra("cono",cono);
            intent.putExtra("coname",coname);


            String ve="Venue: Utsav Main stage, KMC Greens \nOrganised By: MIT, Manipal \nTimings: 08:30 pm – 10:00 pm";
            intent.putExtra("venue",ve);

            bundle.putInt("image",R.drawable.ic_group);
            bundle.putString("apptitle", "WESTERN/NON INDIAN DANCE (GROUP)");
        }
        intent.putExtras(bundle);

        startActivity(intent);
    }

    public List<Data> fill_with_data()
    {
        List<Data> data = new ArrayList<>();
        data.add(new Data("SPOT PHOTOGRAPHY", "\nVenue: MMMC, Manipal \nOrganised By: MMMC, Manipal \nTimings: 09:00 am – 11:00 am", R.drawable.ic_spt_pht ));
        data.add(new Data("INSTALLATION", "\nVenue: MMMC, Manipal \nOrganised By: MMMC, Manipal \nTimings: 11:00 am – 01:00 pm", R.drawable.ic_installation));
        data.add(new Data("POETRY (ENGLISH)", "\nVenue: Counseling Hall, MU \nOrganised By: MCODS, Manipal \nTimings: 09:00 am – 11:00 am", R.drawable.ic_poetry));
        data.add(new Data("POETRY (HINDI)", "\nVenue: Counseling Hall, MU \nOrganised By: MCODS, Manipal \nTimings: 11:00 am – 01:00 pm", R.drawable.ic_hindi_poetry));
        data.add(new Data("MIMICRY", "\nVenue: Counseling Hall, MU \nOrganised By: SOIS, Manipal \nTimings: 02:00 pm – 04.00pm", R.drawable.ic_mimcry));
        data.add(new Data("ANTAKSHARI (FINALS)", "\nVenue: Utsav Main stage, KMC Greens \nOrganised By: MCODS, Mangalore \nTimings: 02:00 pm – 04:00 pm", R.drawable.ic_ant_final));
        data.add(new Data("WESTERN/NON INDIAN VOCAL (SOLO)", "\nVenue: Utsav Main stage, KMC Greens \nOrganised By: SOAHS, Manipal \nTimings: 04:00 pm – 05:15 pm", R.drawable.ic_solo_western));
        data.add(new Data("WESTERN/NON INDIAN VOCAL (GROUP)", "\nVenue: Utsav Main stage, KMC Greens \nOrganised By: SOAHS, Manipal \nTimings: 05:15 pm – 06:45 pm", R.drawable.ic_group_vocal_western));
        data.add(new Data("PRIZE DISTRIBUTION", "\nVenue: Utsav Main stage, KMC Greens \nOrganised By: SOAHS, Manipal \nTimings: 06:45 pm – 07:00 pm", R.drawable.ic_prizeee));
        data.add(new Data("WESTERN/NON INDIAN DANCE (SOLO)", "\nVenue: Utsav Main stage, KMC Greens \nOrganised By: MIT, Manipal \nTimings: 07:00 pm – 08:30 pm", R.drawable.ic_western));
        data.add(new Data("WESTERN/NON INDIAN DANCE (GROUP)", "\nVenue: Utsav Main stage, KMC Greens \nOrganised By: MIT, Manipal \nTimings: 08:30 pm – 10:00 pm", R.drawable.ic_group));
        return data;
    }
}
