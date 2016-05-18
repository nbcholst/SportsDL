package com.example.android.sportsdl;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SettingsInterests extends Fragment {

    public SettingsInterests() {
        // Required empty public constructor
    }

    public static SettingsInterests newInstance() {
        SettingsInterests fragment = new SettingsInterests();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_settings_interests, container, false);
        return rootView;
    }
}
