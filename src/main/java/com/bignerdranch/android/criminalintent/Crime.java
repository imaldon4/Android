package com.bignerdranch.android.criminalintent;

import java.util.UUID;

public class Crime {
    private UUID mID;
    private String mTitle;

    public Crime(){
        // Generate unique identifier.
        // UUID is part of Android
        mID = UUID.randomUUID();
    }

    public UUID getmID() {
        return mID;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }


}
