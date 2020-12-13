package com.example.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PlayMonumentDetailActivity extends AppCompatActivity {
    TextView tvMonumentName;
    TextView tvBuildBy;
    TextView tvYear;
    ImageView ivMonumentImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monument_detail);

        Intent intent = getIntent();
        String monumentName = intent.getStringExtra(Constants.MONUMENT_NAME);
        String buildBy = intent.getStringExtra(Constants.BUILT_BY);
        int year = intent.getIntExtra(Constants.MONUMENT_YEAR, 0);
        int image = intent.getIntExtra(Constants.MONUMENT_IMAGE, 0);

        tvMonumentName = (TextView) findViewById(R.id.monument_text_one);
        tvBuildBy = (TextView) findViewById(R.id.monument_text_two);
        tvYear = (TextView) findViewById(R.id.monument_text_three);
        ivMonumentImage = (ImageView) findViewById(R.id.monument_image);


        tvMonumentName.setText(monumentName);
        tvBuildBy.setText(buildBy);
        tvYear.setText(String.valueOf(year));
        ivMonumentImage.setImageResource(image);

    }
}
