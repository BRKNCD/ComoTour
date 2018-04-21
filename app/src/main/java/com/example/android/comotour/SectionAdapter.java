package com.example.android.comotour;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Gian on 21/04/2018.
 */

public class SectionAdapter extends FragmentPagerAdapter {

    String[] tabTitles = {"CITY", "LAKE", "EVENTS", "P.O.I."};

    public SectionAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CityFragment();
        } else if (position == 1) {
            return new LakeFragment();
        } else if (position == 2) {
            return new EventsFragment();
        } else {
            return new PointOfInterestFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
