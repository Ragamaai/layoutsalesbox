package com.example.ramsraga.salesbox.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.example.ramsraga.salesbox.R;
import com.example.ramsraga.salesbox.adapter.CalllistsAdapter;
import com.example.ramsraga.salesbox.adapter.LeadsAdapter;
import com.example.ramsraga.salesbox.model.ModelCalllistsCard;
import com.example.ramsraga.salesbox.model.ModelLeadsCard;

public class LeadsActivity extends Activity {
RelativeLayout relativeLayout;
    ListView List;
    public ModelLeadsCard modelleadscard;
    public LeadsAdapter leadsadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leads_layout);

        List=(ListView)findViewById(R.id.list);

        int clockimage = R.drawable.clock_index;
        String date = "20-10-2016,";
        String time="12:00PM";
        String name="Name";
        String gmail ="name@gmail.com";
        String interestin="Interest in";
        int profile= R.drawable.image_bottombar_profile;


        leadsadapter = new LeadsAdapter(LeadsActivity.this, R.layout.leads_list_layout);
        List.setAdapter(leadsadapter);


        for (int i = 0; i < 10; i++) {
            modelleadscard = new ModelLeadsCard(clockimage,date,time, name,gmail,interestin,profile);
            leadsadapter.add(modelleadscard);

        }

    }
}



