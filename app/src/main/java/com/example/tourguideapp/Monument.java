package com.example.tourguideapp;

public class Monument {

    private String mMonumentName;
    private int mYear;
    private String mBuildBy;
    private int mMonumentImage;

    public Monument(String monumentName, int year, String buildBy, int monumentImage) {
        mMonumentName = monumentName;
        mYear = year;
        mBuildBy = buildBy;
        mMonumentImage = monumentImage;
    }

    public String getMonumentName() {
        return mMonumentName;
    }

    public int getYear() {
        return mYear;
    }

    public String getBuildBy() {
        return mBuildBy;
    }

    public int getMonumentImage() {
        return mMonumentImage;
    }
}
