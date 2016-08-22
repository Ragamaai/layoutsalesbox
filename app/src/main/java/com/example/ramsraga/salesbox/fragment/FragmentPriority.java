package com.example.ramsraga.salesbox.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.ramsraga.salesbox.adapter.AnnouncementsAdapter;
import com.example.ramsraga.salesbox.model.ModelAnnouncementCard;
import com.example.ramsraga.salesbox.R;

/**
 * Created by ramsraga on 06-07-2016.
 */
public class FragmentPriority extends Fragment {



    public AnnouncementsAdapter announcementsadapter;
    public ModelAnnouncementCard modelannouncementcard;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.priority_layout, container,
                false);

        String month = "Month";
        String name = "Name";
        String opportunitiy = "Opportunity";
        String create = "Create Contract";
        int profile = R.drawable.image_bottombar_profile;
        String value = "Value";
        String valuenmbr = "0";
        String weight = "Weight";
        String weightnmbr = "0";
        String profit = "Profit";
        String profitnmbr = "0";
        int profilesn = R.drawable.image_user_profile;
        String profilenmbr = "0";
        int check = R.drawable.check;
        String checknmbr = "0";
        int calendar = R.drawable.calendar;
        String calendarnmbr = "0";



        ListView List=(ListView)rootView.findViewById(R.id.list);


        announcementsadapter = new AnnouncementsAdapter(getActivity(), R.layout.opportunities_list);
        List.setAdapter(announcementsadapter);


        for (int i = 0; i < 10; i++) {
            modelannouncementcard = new ModelAnnouncementCard(month, name, opportunitiy, create, profile, value, valuenmbr, weight, weightnmbr, profit, profitnmbr, profilesn, profilenmbr, check, checknmbr, calendar, calendarnmbr);
            announcementsadapter.add(modelannouncementcard);



        }return rootView;
    }

}


