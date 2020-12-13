package com.example.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PlayShoppingMallDetailActivity extends AppCompatActivity {
    TextView tvShoppingMallName;
    TextView tvShoppingMallAddress;
    TextView tvShoppingMallTiming;
    ImageView ivShoppingMallImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoppingmall_detail);

        Intent intent = getIntent();
        String shoppingMallName = intent.getStringExtra(Constants.SHOPPINGMALL_NAME);
        String shoppingMallAddress = intent.getStringExtra(Constants.SHOPPINGMALL_ADDRESS);
        String shoppingMallTiming = intent.getStringExtra(Constants.SHOPPINGMALL_TIME);
        int shoppingMallImage = intent.getIntExtra(Constants.SHOPPINGMALL_IMAGE, 0);

        tvShoppingMallName = (TextView) findViewById(R.id.shoppingmall_text_one);
        tvShoppingMallAddress = (TextView) findViewById(R.id.shoppingmall_text_two);
        tvShoppingMallTiming = (TextView) findViewById(R.id.shoppingmall_text_three);
        ivShoppingMallImage = (ImageView) findViewById(R.id.iv_shoppingmall_image);


        tvShoppingMallName.setText(shoppingMallName);
        tvShoppingMallAddress.setText(shoppingMallAddress);
        tvShoppingMallTiming.setText(shoppingMallTiming);
        ivShoppingMallImage.setImageResource(shoppingMallImage);

    }
}
