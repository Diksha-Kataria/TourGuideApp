package com.example.tourguideapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {


    public MyFragmentPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MonumentFragment();
        } else if (position == 1) {
            return new RestaurantFragment();
        } else if (position == 2) {
            return new MarketFragment();
        } else if (position == 3) {
            return new ShoppingMallFragment();
        } else {
            return new WaterParkFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Monuments";
        } else if (position == 1) {
            return "Restaurants";
        } else if (position == 2) {
            return "Markets";
        } else if (position == 3) {
            return "Shopping Mall";
        } else {
            return "Water Park";
        }
    }
}
