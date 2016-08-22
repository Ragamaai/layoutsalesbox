package com.example.ramsraga.salesbox.activity;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.ramsraga.salesbox.R;
import com.example.ramsraga.salesbox.adapter.TimelineAdapter;
import com.example.ramsraga.salesbox.model.ModelTimelineCard;

public class InsightstimelineActivity extends Activity{

    ListView List;
    public ModelTimelineCard modeltimelinecard;
    public TimelineAdapter timelineadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.insights_timeline);

        List=(ListView)findViewById(R.id.list);

        int appointmentimage = R.drawable.accountsicon;
        String name = "abc";
        int leadsimage=R.drawable.icon_leads;
        String date="Jul 14,2016";
        String time="12:00PM";
        int profileIimage= R.drawable.icon_tab_contact;


        timelineadapter = new TimelineAdapter(InsightstimelineActivity.this, R.layout.insights_timeline_lists);
        List.setAdapter(timelineadapter);


        for (int i = 0; i < 10; i++) {
            modeltimelinecard = new ModelTimelineCard(appointmentimage,name,leadsimage, date,time,profileIimage);
            timelineadapter.add(modeltimelinecard);

        }

    }
}


