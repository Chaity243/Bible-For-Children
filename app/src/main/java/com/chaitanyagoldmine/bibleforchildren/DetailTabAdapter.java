package com.chaitanyagoldmine.bibleforchildren;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.chaitanyagoldmine.bibleforchildren.Fragments.ChildFragment;
import com.chaitanyagoldmine.bibleforchildren.Fragments.GenisisFragment;

public class DetailTabAdapter extends FragmentPagerAdapter {
    private Context context;
    private String[] tabTitles = {"Children Story", "Genesis"};

    public DetailTabAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
        //History_Api();
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                // Top Rated fragment activity
                return    new ChildFragment();

            case 1:
                // Games fragment activity
                return  new GenisisFragment();
            //   return    new Scheduled_Fragment();

        }

        return null;
    }

    @Override
    public int getCount() {
        return tabTitles.length;
    }

}
