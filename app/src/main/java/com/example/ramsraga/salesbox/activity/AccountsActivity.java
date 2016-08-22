package com.example.ramsraga.salesbox.activity;


import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.ramsraga.salesbox.R;
import com.example.ramsraga.salesbox.adapter.AccountsAdapter;
import com.example.ramsraga.salesbox.adapter.AnnouncementsAdapter;
import com.example.ramsraga.salesbox.model.ModelAccountsCard;


public class AccountsActivity extends Activity {

    ListView List;
    public ModelAccountsCard modelaccountscard;
    public AccountsAdapter accountsadapter;
    LinearLayout linearbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accounts_layout);

        List=(ListView)findViewById(R.id.list);

        linearbar=(LinearLayout)findViewById(R.id.bottom_bar);


        int accimage = R.drawable.accountsicon;
        String name = "Name";
        int profile = R.drawable.image_bottombar_profile;
        int profilesn = R.drawable.image_user_profile;
        String profilenmbr="0";
        int check= R.drawable.check;
        String checknmbr="0";
        int calendar=R.drawable.calendar;
        String calendarnmbr="0";
        int money=R.drawable.money;
        String moneynmbr="0";
        String closedsales="Closed sales";
        String closedsalesnmbr="0";
        String closedprofit="Closed profit";
        String closedprofitnmbr="0";
        String value="Value";
        String valuenmbr="0";
        String weighted="Weight";
        String weightnmbr="0";





        accountsadapter = new AccountsAdapter(AccountsActivity.this, R.layout.accounts_list);
        List.setAdapter(accountsadapter);


        for (int i = 0; i < 10; i++) {
            modelaccountscard = new ModelAccountsCard(accimage, name, profile, profilesn,profilenmbr,check,checknmbr,calendar,calendarnmbr,money,moneynmbr,closedsales,closedsalesnmbr,closedprofit,closedprofitnmbr,value,valuenmbr,weighted,weightnmbr);
            accountsadapter.add(modelaccountscard);

linearbar.setOnClickListener(new View.OnClickListener() {

    @Override
    public void onClick(View v) {
     Intent i=new Intent (AccountsActivity.this,CalllistsActivity.class);
        startActivity(i);
    }
});



        }

    }
}