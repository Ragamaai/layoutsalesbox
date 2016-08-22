package com.example.ramsraga.salesbox.activity;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.ramsraga.salesbox.adapter.AnnouncementsAdapter;
import com.example.ramsraga.salesbox.model.ModelAnnouncementCard;
import com.example.ramsraga.salesbox.R;

public class OpportunitiesActivity extends FragmentActivity{

ImageView bottomfirstimage,bottomsecondimage,bottomthirdimage,bottomfourthimage;
    ListView List;
    public ModelAnnouncementCard modelannouncementcard;
    public AnnouncementsAdapter announcementsadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opportunities_layout);



        bottomfirstimage=(ImageView)findViewById(R.id.bottom_first_image);
        bottomsecondimage=(ImageView)findViewById(R.id.bottom_second_image);
        bottomthirdimage=(ImageView)findViewById(R.id.bottom_third_image);
        bottomfourthimage=(ImageView)findViewById(R.id.bottom_fourth_image);




      List=(ListView)findViewById(R.id.list);

        String month = "Month";
        String name = "Name";
        String opportunitiy="Opportunity";
        String create="Create Contract";
        int profile = R.drawable.image_bottombar_profile;
        String value="Value";
        String valuenmbr="0";
        String weight="Weight";
        String weightnmbr="0";
        String profit="Profit";
        String profitnmbr="0";
        int profilesn = R.drawable.image_user_profile;
        String profilenmbr="0";
        int check= R.drawable.check;
        String checknmbr="0";
        int calendar=R.drawable.calendar;
        String calendarnmbr="0";



        announcementsadapter = new AnnouncementsAdapter(OpportunitiesActivity.this, R.layout.opportunities_list);
        List.setAdapter(announcementsadapter);


        for (int i = 0; i < 10; i++) {
            modelannouncementcard = new ModelAnnouncementCard(month, name, opportunitiy, create, profile, value,valuenmbr,weight,weightnmbr,profit,profitnmbr,profilesn,profilenmbr,check,checknmbr,calendar,calendarnmbr);
            announcementsadapter.add(modelannouncementcard);




    }
}}