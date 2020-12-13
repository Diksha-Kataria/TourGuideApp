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

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class MonumentFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.monument_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ArrayList<Monument> monuments = new ArrayList<>();
        monuments.add(new Monument(getString(R.string.monument_one), 1784, getString(R.string.built_1), R.drawable.bada_imambara));
        monuments.add(new Monument(getString(R.string.monument_two), 1838, getString(R.string.built_2), R.drawable.chota_imambara_image));
        monuments.add(new Monument(getString(R.string.monument_three), 1780, getString(R.string.built_3), R.drawable.residency_image));
        monuments.add(new Monument(getString(R.string.monument_four), 1721, getString(R.string.built_4), R.drawable.dilkusha_kothi));
        monuments.add(new Monument(getString(R.string.monument_five), 1848, getString(R.string.built_5), R.drawable.kaisarbagh_palace));
        monuments.add(new Monument(getString(R.string.monument_six), 1877, getString(R.string.built_6), R.drawable.rumi_darwaza));
        monuments.add(new Monument(getString(R.string.monument_seven), 1798, getString(R.string.built_7), R.drawable.chattar_manzil));
        monuments.add(new Monument(getString(R.string.monument_eight), 1881, getString(R.string.built_8), R.drawable.clock_tower));
        monuments.add(new Monument(getString(R.string.monument_nine), 1874, getString(R.string.built_9), R.drawable.tomb_image));
        monuments.add(new Monument(getString(R.string.monument_ten), 1837, getString(R.string.built_10), R.drawable.jama_masjid));

        MonumentListAdapter monumentListAdapter = new MonumentListAdapter(getActivity(), monuments);

        ListView listView = (ListView) view.findViewById(R.id.monument_list);

        listView.setAdapter(monumentListAdapter);

    }
}


