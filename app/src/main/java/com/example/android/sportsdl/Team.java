package com.example.android.sportsdl;

import java.util.UUID;

/**
 * Created by cholni01 on 5/20/2016.
 */
public class Team {
    private UUID mID;
    private String mTitle;
    private String mLeague;
    private String mCountry;
    private boolean mSelected;

    public Team(){
        mID = UUID.randomUUID();
    }

    //for now allow setting titles
    public void setTitle(String title) {
        mTitle = title;
    }

    public UUID getID() {
        return mID;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getLeague() {
        return mLeague;
    }

    public String getCountry() {
        return mCountry;
    }

    public boolean isSelected() {
        return mSelected;
    }

    public void setSelected(boolean selected) {
        mSelected = selected;
    }

}
