package com.example.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PlayRestaurantDetailActivity extends AppCompatActivity {
    TextView tvRestaurantName;
    TextView tvAddress;
    TextView tvTime;
    ImageView ivRestaurantImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_detail);

        Intent intent = getIntent();
        String restaurantName = intent.getStringExtra(Constants.RESTAURANT_NAME);
        String restaurantAddress = intent.getStringExtra(Constants.RESTAURANT_ADDRESS);
        String restaurantTime = intent.getStringExtra(Constants.RESTAURANT_TIME);
        int restaurantImage = intent.getIntExtra(Constants.RESTAURANT_IMAGE, 0);

        tvRestaurantName = (TextView) findViewById(R.id.restaurant_text_one);
        tvAddress = (TextView) findViewById(R.id.restaurant_text_two);
        tvTime = (TextView) findViewById(R.id.restaurant_text_three);
        ivRestaurantImage = (ImageView) findViewById(R.id.iv_restaurant_image);


        tvRestaurantName.setText(restaurantName);
        tvAddress.setText(restaurantAddress);
        tvTime.setText(restaurantTime);
        ivRestaurantImage.setImageResource(restaurantImage);

    }
}
