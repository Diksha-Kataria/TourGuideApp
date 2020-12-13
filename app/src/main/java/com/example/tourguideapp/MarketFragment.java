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

public class MarketFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.market_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ArrayList<Market> markets = new ArrayList<>();
        markets.add(new Market(getString(R.string.market_one), getString(R.string.market_address_one), R.drawable.aminabad_market));
        markets.add(new Market(getString(R.string.market_two), getString(R.string.market_address_two), R.drawable.chowk_market));
        markets.add(new Market(getString(R.string.market_three), getString(R.string.market_address_three), R.drawable.nakhas_market));
        markets.add(new Market(getString(R.string.market_four), getString(R.string.market_address_four), R.drawable.yahiyaganj_market));
        markets.add(new Market(getString(R.string.market_five), getString(R.string.market_address_five), R.drawable.janpath_market));
        markets.add(new Market(getString(R.string.market_six), getString(R.string.market_address_six), R.drawable.bhoothnath_market));
        markets.add(new Market(getString(R.string.market_seven), getString(R.string.market_address_seven), R.drawable.gol_market));
        markets.add(new Market(getString(R.string.market_eight), getString(R.string.market_address_eight), R.drawable.garbarjhala_market));
        markets.add(new Market(getString(R.string.market_nine), getString(R.string.market_address_nine), R.drawable.sadar_market));
        markets.add(new Market(getString(R.string.market_ten), getString(R.string.market_address_ten), R.drawable.harzatganj_market));

        MarketListAdapter marketListAdapter = new MarketListAdapter(getActivity(), markets);

        ListView listView = (ListView) view.findViewById(R.id.market_list);

        listView.setAdapter(marketListAdapter);

    }
}
