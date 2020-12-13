package com.example.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PlayMarketDetailActivity extends AppCompatActivity {
    TextView tvMarketName;
    TextView tvMarketAddress;
    ImageView ivMarketImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market_detail);

        Intent intent = getIntent();
        String marketName = intent.getStringExtra(Constants.MARKET_NAME);
        String marketAddress = intent.getStringExtra(Constants.MARKET_ADDRESS);
        int marketImage = intent.getIntExtra(Constants.MARKET_IMAGE, 0);

        tvMarketName = (TextView) findViewById(R.id.market_text_one);
        tvMarketAddress = (TextView) findViewById(R.id.market_text_two);
        ivMarketImage = (ImageView) findViewById(R.id.iv_market_image);


        tvMarketName.setText(marketName);
        tvMarketAddress.setText(marketAddress);
        ivMarketImage.setImageResource(marketImage);

    }
}
