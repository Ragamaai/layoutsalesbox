package com.example.ramsraga.salesbox.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.ramsraga.salesbox.fragment.FragmentDetails;
import com.example.ramsraga.salesbox.fragment.FragmentFavourites;
import com.example.ramsraga.salesbox.fragment.FragmentOpportunity;
import com.example.ramsraga.salesbox.fragment.FragmentPriority;
import com.example.ramsraga.salesbox.fragment.FragmentRecents;
import com.example.ramsraga.salesbox.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static ViewPager viewPager;
    /*public TabLayout tabLayout;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_contacts_layout);
        viewPager = (ViewPager) findViewById(R.id.pager);
        setupViewPager(viewPager);

        /*tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);*/



/** set the adapter for ViewPager */
        /*mViewPager.setAdapter(new AnnouncementsAdapter(
                getSupportFragmentManager()));
    }

    *//** Defining a FragmentPagerAdapter class for controlling the fragments to be shown when user swipes on the screen. *//*
    public class AnnouncementsAdapter extends FragmentPagerAdapter {

        public AnnouncementsAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {


            return new Fragment();
        }





        @Override
        public int getCount() {
            return 2;
        }
    }*/
    }

    private void setupViewPager(ViewPager viewPager) {

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new FragmentOpportunity(), "Opportunity");
        adapter.addFragment(new FragmentPriority(), "Prioritized");
        adapter.addFragment(new FragmentFavourites(), "Favourites");
        adapter.addFragment(new FragmentRecents(), "Recents");
        adapter.addFragment(new FragmentDetails(),"Details" );

        viewPager.setAdapter(adapter);




    }
    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {

            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

}


