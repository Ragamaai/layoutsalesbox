package com.example.ramsraga.salesbox.activity;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.ramsraga.salesbox.R;
import com.example.ramsraga.salesbox.adapter.AccountsAdapter;
import com.example.ramsraga.salesbox.adapter.CalllistsAdapter;
import com.example.ramsraga.salesbox.model.ModelAccountsCard;
import com.example.ramsraga.salesbox.model.ModelCalllistsCard;

public class CalllistsActivity extends Activity {
LinearLayout linearbar;
    ListView List;
    public ModelCalllistsCard modelcalllistscard;
    public CalllistsAdapter calllistsadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.call_layout);
linearbar=(LinearLayout)findViewById(R.id.bottom_bar);
        List=(ListView)findViewById(R.id.list);

        String trrr = "Trrrr";
        String nounit = "No Unit";
        int profile = R.drawable.image_bottombar_profile;
        String barvalue="0";
        String deadline ="Deadline";
        String notset="Not set";
        String accounts="Accounts";
        String accountnmbr="1";
        String contacts="Contacts";
        String contactsnmbr="2";
        int callaccept= R.drawable.calloggreen;
        String callacceptnmbr="0";
        int callreject=R.drawable.callogred;
        String callrejectnmbr="0";
        int calendar=R.drawable.calendar;
        String calendarnmbr="0";
        int money=R.drawable.money;
        String moneynmbr="0";





        calllistsadapter = new CalllistsAdapter(CalllistsActivity.this, R.layout.call_lists_layout);
        List.setAdapter(calllistsadapter);


        for (int i = 0; i < 10; i++) {
            modelcalllistscard = new ModelCalllistsCard(trrr, nounit, profile, barvalue,deadline,notset,accounts,accountnmbr,contacts,contactsnmbr,callaccept,callacceptnmbr,callreject,callrejectnmbr,calendar,calendarnmbr,money,moneynmbr);
            calllistsadapter.add(modelcalllistscard);

            linearbar.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Intent i = new Intent(CalllistsActivity.this, LeadsActivity.class);
                    startActivity(i);
                }
            });


        }

    }
}



