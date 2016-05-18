package com.example.android.sportsdl;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SettingsTabs extends Fragment {

    public SettingsTabs() {
        // Required empty public constructor
    }

    public static SettingsTabs newInstance() {
        SettingsTabs fragment = new SettingsTabs();
        return fragment;
    }

    private SectionsPagerAdapter mSetSectionsPagerAdapter;
    private ViewPager mSetViewPager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_settings_tabs, container, false);

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSetSectionsPagerAdapter = new SectionsPagerAdapter(getChildFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mSetViewPager = (ViewPager) rootView.findViewById(R.id.settings_container);
        mSetViewPager.setAdapter(mSetSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) rootView.findViewById(R.id.settings_tabs);
        tabLayout.setupWithViewPager(mSetViewPager);
        return rootView;
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            switch (position) {
                case 0:
                    return CommunityFragment.newInstance();
                case 1:
                    return SettingsAppearance.newInstance();

                // default: return MyFragment.newInstance();
            /* It is better to use default so that it always returns a fragment and no problems would ever occur */
            }
            return null; //if you use default, you would not need to return null
        }

        @Override
        public int getCount() {
            // Show 2 total pages.
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Interests";
                case 1:
                    return "Settings";
            }
            return null;
        }
    }
}
