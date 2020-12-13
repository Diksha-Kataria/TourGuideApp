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

public class ShoppingMallFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.shoppingmall_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ArrayList<ShoppingMall> shoppingMalls = new ArrayList<>();
        shoppingMalls.add(new ShoppingMall(getString(R.string.shoppingmall_one), getString(R.string.shoppingmall_address_one), getString(R.string.time_11_10), R.drawable.wave_mall));
        shoppingMalls.add(new ShoppingMall(getString(R.string.shoppingmall_two), getString(R.string.shoppingmall_address_two), getString(R.string.time_10_10), R.drawable.pheonix_mall));
        shoppingMalls.add(new ShoppingMall(getString(R.string.shoppingmall_three), getString(R.string.shoppingmall_address_three), getString(R.string.time_10_9), R.drawable.sahara_mall));
        shoppingMalls.add(new ShoppingMall(getString(R.string.shoppingmall_four), getString(R.string.shoppingmall_address_four), getString(R.string.time_11_11), R.drawable.awadh_mall));
        shoppingMalls.add(new ShoppingMall(getString(R.string.shoppingmall_five), getString(R.string.shoppingmall_address_five), getString(R.string.time_9_11), R.drawable.fun_mall));
        shoppingMalls.add(new ShoppingMall(getString(R.string.shoppingmall_six), getString(R.string.shoppingmall_address_six), getString(R.string.time_10_10), R.drawable.singapore_mall));
        shoppingMalls.add(new ShoppingMall(getString(R.string.shoppingmall_seven), getString(R.string.shoppingmall_address_seven), getString(R.string.time_8_11), R.drawable.riverside_mall));
        shoppingMalls.add(new ShoppingMall(getString(R.string.shoppingmall_eight), getString(R.string.shoppingmall_address_eight), getString(R.string.time_10_11), R.drawable.palassio_mall));
        shoppingMalls.add(new ShoppingMall(getString(R.string.shoppingmall_nine), getString(R.string.shoppingmall_address_nine), getString(R.string.time_10_12), R.drawable.umrao_mall));

        ShoppingMallListAdapter shoppingMallListAdapter = new ShoppingMallListAdapter(getActivity(), shoppingMalls);

        ListView listView = (ListView) view.findViewById(R.id.shoppingmall_list);

        listView.setAdapter(shoppingMallListAdapter);

    }
}