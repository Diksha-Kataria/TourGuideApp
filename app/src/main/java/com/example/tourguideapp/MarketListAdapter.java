package com.example.tourguideapp;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MarketListAdapter extends ArrayAdapter<Market> {
    Activity currentContext;

    public MarketListAdapter(Activity context, ArrayList<Market> markets) {
        super(context, 0, markets);
        currentContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.market_list_item, parent, false);
        }

        final Market currentMarket = getItem(position);

        TextView marketNameTextView = (TextView) listItemView.findViewById(R.id.market_name);
        assert currentMarket != null;
        marketNameTextView.setText(currentMarket.getMarketName());

        TextView marketAddressTextView = (TextView) listItemView.findViewById(R.id.market_address);
        marketAddressTextView.setText(currentMarket.getMarketAddress());

        ImageView marketImageImageView = (ImageView) listItemView.findViewById(R.id.market_image);
        marketImageImageView.setImageResource(currentMarket.getmMarketImage());

        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent marketIntent = new Intent(currentContext, PlayMarketDetailActivity.class);
                marketIntent.putExtra(Constants.MARKET_NAME, currentMarket.getMarketName());
                marketIntent.putExtra(Constants.MARKET_ADDRESS, currentMarket.getMarketAddress());
                marketIntent.putExtra(Constants.MARKET_IMAGE, currentMarket.getmMarketImage());

                currentContext.startActivity(marketIntent);

            }
        });

        return listItemView;
    }
}
