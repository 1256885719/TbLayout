package com.example.thinkpad.tablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter{
    private List<Fragment> fragments;
    private List<String> titles;

    public ViewPagerAdapter(FragmentManager manager, List<Fragment> fragments,List<String> titles) {
        super(manager);
        this.fragments=fragments;
        this.titles=titles;
    }

    @Override
    public Fragment getItem(int i) {
        if (fragments!=null){
            return fragments.get(i);
        }
        return null;
    }

    @Override
    public int getCount() {
        if (fragments!=null){
            return fragments.size();
        }
        return 0;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        if (titles!=null){
            return titles.get(position);
        }
        return "";
    }
}
