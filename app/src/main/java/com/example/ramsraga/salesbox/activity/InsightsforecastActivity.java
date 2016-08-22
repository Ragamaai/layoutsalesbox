package com.example.ramsraga.salesbox.activity;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.ramsraga.salesbox.R;
import com.example.ramsraga.salesbox.adapter.ForecastAdapter;
import com.example.ramsraga.salesbox.adapter.TimelineAdapter;
import com.example.ramsraga.salesbox.model.ModelForecastCard;
import com.example.ramsraga.salesbox.model.ModelTimelineCard;

public class InsightsforecastActivity  extends Activity{

    ListView List;
    public ModelForecastCard modelforecastcard;
    public ForecastAdapter forecastadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.insights_forecast);

        List=(ListView)findViewById(R.id.list);

        int profileIimage = R.drawable.icon_tab_contact;
        String forecast = "Forecast";
        String overview="Overview";
        String testing="Karthik Testing";
        int check= R.drawable.icon_check_done;


        forecastadapter = new ForecastAdapter(InsightsforecastActivity.this, R.layout.insight_forecast_list);
        List.setAdapter(forecastadapter);


        for (int i = 0; i < 10; i++) {
            modelforecastcard = new ModelForecastCard(profileIimage,forecast,overview,testing,check);
            forecastadapter.add(modelforecastcard);

        }

    }
}
