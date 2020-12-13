package com.example.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class WaterParkFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.waterpark_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ArrayList<WaterPark> waterParks = new ArrayList<>();
        waterParks.add(new WaterPark(getString(R.string.waterpark_one), getString(R.string.waterpark_address_one), getString(R.string.time_10_6), R.drawable.anandi_park));
        waterParks.add(new WaterPark(getString(R.string.waterpark_two), getString(R.string.waterpark_address_two), getString(R.string.time_10_5), R.drawable.nilansh_park));
        waterParks.add(new WaterPark(getString(R.string.waterpark_three), getString(R.string.waterpark_address_three), getString(R.string.time_10_6), R.drawable.amrapali_park));
        waterParks.add(new WaterPark(getString(R.string.waterpark_four), getString(R.string.waterpark_address_four), getString(R.string.time_11_7), R.drawable.fun_city));
        waterParks.add(new WaterPark(getString(R.string.waterpark_five), getString(R.string.waterpark_address_five), getString(R.string.time_9_5), R.drawable.dream_world));
        waterParks.add(new WaterPark(getString(R.string.waterpark_six), getString(R.string.waterpark_address_six), getString(R.string.time_10_6), R.drawable.disney_water_wonder));
        waterParks.add(new WaterPark(getString(R.string.waterpark_seven), getString(R.string.waterpark_address_seven), getString(R.string.time_11_5), R.drawable.scorpio_club));
        waterParks.add(new WaterPark(getString(R.string.waterpark_eight), getString(R.string.waterpark_address_eight), getString(R.string.time_10_6), R.drawable.janeshwar_park));

        WaterParkListAdapter waterParkListAdapter = new WaterParkListAdapter(getActivity(), waterParks);

        ListView listView = (ListView) view.findViewById(R.id.waterpark_list);

        listView.setAdapter(waterParkListAdapter);

    }
}
