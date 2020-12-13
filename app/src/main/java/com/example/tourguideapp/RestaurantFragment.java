package com.example.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class RestaurantFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.restaurants_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ArrayList<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant(getString(R.string.restaurant_one), getString(R.string.restaurant_address_one), getString(R.string.time_11_11), R.drawable.royal_sky));
        restaurants.add(new Restaurant(getString(R.string.restaurant_two), getString(R.string.restaurant_address_two), getString(R.string.time_9_11), R.drawable.moti_mahal));
        restaurants.add(new Restaurant(getString(R.string.restaurant_three), getString(R.string.restaurant_address_three), getString(R.string.time_11_11), R.drawable.royal_cafe));
        restaurants.add(new Restaurant(getString(R.string.restaurant_four), getString(R.string.restaurant_address_four), getString(R.string.time_12_10), R.drawable.dastarkhwan_image));
        restaurants.add(new Restaurant(getString(R.string.restaurant_five), getString(R.string.restaurant_address_five), getString(R.string.time_11_11), R.drawable.urban_dhaba));
        restaurants.add(new Restaurant(getString(R.string.restaurant_six), getString(R.string.restaurant_address_six), getString(R.string.time_11_11), R.drawable.barbeque_nation));
        restaurants.add(new Restaurant(getString(R.string.restaurant_seven), getString(R.string.restaurant_address_seven), getString(R.string.time_1_11), R.drawable.aryans_image));
        restaurants.add(new Restaurant(getString(R.string.restaurant_eight), getString(R.string.restaurant_address_eight), getString(R.string.time_11_11), R.drawable.pacific_hut));
        restaurants.add(new Restaurant(getString(R.string.restaurant_nine), getString(R.string.restaurant_address_nine), getString(R.string.time_1_11), R.drawable.tunday_kababi));

        RestaurantListAdapter restaurantListAdapter = new RestaurantListAdapter(getActivity(), restaurants);

        ListView listView = (ListView) view.findViewById(R.id.restaurants_list);

        listView.setAdapter(restaurantListAdapter);

    }
}
