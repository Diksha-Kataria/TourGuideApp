package com.example.tourguideapp;

public class Restaurant {
    private String mReataurantName;
    private String mAddress;
    private String mTime;
    private int mRestaurantImage;

    public Restaurant(String restaurantName, String address, String time, int restaurantImage) {
        mReataurantName = restaurantName;
        mAddress = address;
        mTime = time;
        mRestaurantImage = restaurantImage;
    }

    public String getRestaurantName() {
        return mReataurantName;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getTime() {
        return mTime;
    }

    public int getRestaurantImage() {
        return mRestaurantImage;
    }
}
