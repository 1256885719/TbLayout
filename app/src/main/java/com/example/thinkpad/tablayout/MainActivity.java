package com.example.thinkpad.tablayout;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private TabLayout mTabLayout;
    private FragmentPagerAdapter mAdapter;
    private List<Fragment> fragments;
    private List<String> titles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        mTabLayout = (TabLayout) findViewById(R.id.tablayout);

        mTabLayout.setupWithViewPager(mViewPager);

        fragments = new ArrayList<Fragment>();
        AFragment aFragment = new AFragment();
        Fragment bFragment = new Fragment();
        Fragment cFragment = new Fragment();
        Fragment dFragment = new Fragment();
        Fragment eFragment = new Fragment();
        fragments.add(aFragment);
        fragments.add(bFragment);
        fragments.add(cFragment);
        fragments.add(dFragment);
        fragments.add(eFragment);

        titles = new ArrayList<String>();
        titles.add("A");
        titles.add("B");
        titles.add("C");
        titles.add("D");
        titles.add("E");

        mAdapter = new ViewPagerAdapter(getSupportFragmentManager(), fragments, titles);
        mViewPager.setAdapter(mAdapter);
        mTabLayout.setTabMode(TabLayout.MODE_FIXED);

    }
}
