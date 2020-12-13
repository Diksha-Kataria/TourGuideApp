package com.example.tourguideapp;

public class ShoppingMall {
    private String mShoppingMallName;
    private String mShoppingMallAddress;
    private String mTiming;
    private int mShoppingMallImage;

    public ShoppingMall(String shoppingMallName, String shoppingMallAddress, String timing, int shoppingMallImage) {
        mShoppingMallName = shoppingMallName;
        mShoppingMallAddress = shoppingMallAddress;
        mTiming = timing;
        mShoppingMallImage = shoppingMallImage;
    }

    public String getShoppingMallName() {
        return mShoppingMallName;
    }

    public String getShoppingMallAddress() {
        return mShoppingMallAddress;
    }

    public String getTiming() {
        return mTiming;
    }

    public int getmShoppingMallImage() {
        return mShoppingMallImage;
    }
}
