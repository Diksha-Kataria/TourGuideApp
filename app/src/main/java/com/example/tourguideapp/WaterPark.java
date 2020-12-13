package com.example.tourguideapp;

public class WaterPark {
    private String mWaterParkName;
    private String mWaterParkAddress;
    private String mWaterParkTiming;
    private int mWaterParkImage;

    public WaterPark(String waterParkName, String waterParkAddress, String waterParkTiming, int waterParkImage) {
        mWaterParkName = waterParkName;
        mWaterParkAddress = waterParkAddress;
        mWaterParkTiming = waterParkTiming;
        mWaterParkImage = waterParkImage;
    }

    public String getWaterParkName() {
        return mWaterParkName;
    }

    public String getWaterParkAddress() {
        return mWaterParkAddress;
    }

    public String getWaterParkTiming() {
        return mWaterParkTiming;
    }

    public int getmWaterParkImage() {
        return mWaterParkImage;
    }
}
