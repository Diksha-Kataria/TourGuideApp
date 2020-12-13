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

public class RestaurantListAdapter extends ArrayAdapter<Restaurant> {
    Activity currentContext;

    public RestaurantListAdapter(Activity context, ArrayList<Restaurant> restaurants) {
        super(context, 0, restaurants);
        currentContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.restaurants_list_item, parent, false);
        }

        final Restaurant currentRestaurant = getItem(position);

        TextView restaurantNameTextView = (TextView) listItemView.findViewById(R.id.restaurant_name);
        assert currentRestaurant != null;
        restaurantNameTextView.setText(currentRestaurant.getRestaurantName());

        TextView timeTextView = (TextView) listItemView.findViewById(R.id.restaurant_time);
        timeTextView.setText(currentRestaurant.getTime());

        ImageView restaurantImageView = (ImageView) listItemView.findViewById(R.id.restaurant_image);
        restaurantImageView.setImageResource(currentRestaurant.getRestaurantImage());

        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restaurantIntent = new Intent(currentContext, PlayRestaurantDetailActivity.class);
                restaurantIntent.putExtra(Constants.RESTAURANT_NAME, currentRestaurant.getRestaurantName());
                restaurantIntent.putExtra(Constants.RESTAURANT_ADDRESS, currentRestaurant.getAddress());
                restaurantIntent.putExtra(Constants.RESTAURANT_TIME, currentRestaurant.getTime());
                restaurantIntent.putExtra(Constants.RESTAURANT_IMAGE, currentRestaurant.getRestaurantImage());

                currentContext.startActivity(restaurantIntent);

            }
        });

        return listItemView;
    }
}
