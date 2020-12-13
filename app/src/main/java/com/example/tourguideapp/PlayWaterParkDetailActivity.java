package com.example.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PlayWaterParkDetailActivity extends AppCompatActivity {
    TextView tvWaterParkName;
    TextView tvWaterParkAddress;
    TextView tvWaterParkTiming;
    ImageView ivWaterParkImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waterpark_detail);

        Intent intent = getIntent();
        String waterParkName = intent.getStringExtra(Constants.WATERPARK_NAME);
        String waterParkAddress = intent.getStringExtra(Constants.WATERPARK_ADDRESS);
        String waterParkTiming = intent.getStringExtra(Constants.WATERPARK_TIME);
        int waterParkImage = intent.getIntExtra(Constants.WATERPARK_IMAGE, 0);

        tvWaterParkName = (TextView) findViewById(R.id.waterpark_text_one);
        tvWaterParkAddress = (TextView) findViewById(R.id.waterpark_text_two);
        tvWaterParkTiming = (TextView) findViewById(R.id.waterpark_text_three);
        ivWaterParkImage = (ImageView) findViewById(R.id.iv_waterpark_image);


        tvWaterParkName.setText(waterParkName);
        tvWaterParkAddress.setText(waterParkAddress);
        tvWaterParkTiming.setText(waterParkTiming);
        ivWaterParkImage.setImageResource(waterParkImage);

    }
}
