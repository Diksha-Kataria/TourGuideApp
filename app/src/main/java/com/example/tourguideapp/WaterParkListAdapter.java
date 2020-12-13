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

public class WaterParkListAdapter extends ArrayAdapter<WaterPark> {
    Activity currentContext;

    public WaterParkListAdapter(Activity context, ArrayList<WaterPark> waterParks) {
        super(context, 0, waterParks);
        currentContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.waterpark_list_item, parent, false);
        }

        final WaterPark currentWaterPark = getItem(position);

        TextView waterParkNameTextView = (TextView) listItemView.findViewById(R.id.waterpark_name);
        assert currentWaterPark != null;
        waterParkNameTextView.setText(currentWaterPark.getWaterParkName());

        TextView waterParkTimeTextView = (TextView) listItemView.findViewById(R.id.waterpark_time);
        waterParkTimeTextView.setText(currentWaterPark.getWaterParkTiming());

        ImageView waterParkImageView = (ImageView) listItemView.findViewById(R.id.waterpark_image);
        waterParkImageView.setImageResource(currentWaterPark.getmWaterParkImage());

        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent waterParkIntent = new Intent(currentContext, PlayWaterParkDetailActivity.class);
                waterParkIntent.putExtra(Constants.WATERPARK_NAME, currentWaterPark.getWaterParkName());
                waterParkIntent.putExtra(Constants.WATERPARK_ADDRESS, currentWaterPark.getWaterParkAddress());
                waterParkIntent.putExtra(Constants.WATERPARK_TIME, currentWaterPark.getWaterParkTiming());
                waterParkIntent.putExtra(Constants.WATERPARK_IMAGE, currentWaterPark.getmWaterParkImage());

                currentContext.startActivity(waterParkIntent);

            }
        });

        return listItemView;
    }
}
