package com.example.tourguideapp;

public class Market {
    private String mMarketName;
    private String mMarketAddress;
    private int mMarketImage;

    public Market(String marketName, String marketAddress, int marketImage) {
        mMarketName = marketName;
        mMarketAddress = marketAddress;
        mMarketImage = marketImage;
    }

    public String getMarketName() {
        return mMarketName;
    }

    public String getMarketAddress() {
        return mMarketAddress;
    }

    public int getmMarketImage() {
        return mMarketImage;
    }
}
