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

public class MonumentListAdapter extends ArrayAdapter<Monument> {
    Activity currentContext;

    public MonumentListAdapter(Activity context, ArrayList<Monument> monuments) {
        super(context, 0, monuments);
        currentContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        final Monument currentMonument = getItem(position);

        TextView monumentNameTextView = (TextView) listItemView.findViewById(R.id.tv_name);
        assert currentMonument != null;
        monumentNameTextView.setText(currentMonument.getMonumentName());

        TextView yearTextView = (TextView) listItemView.findViewById(R.id.tv_year);
        yearTextView.setText(String.valueOf(currentMonument.getYear()));

        TextView buildByTextView = (TextView) listItemView.findViewById(R.id.tv_builder);
        buildByTextView.setText(currentMonument.getBuildBy());

        ImageView monumentImageView = (ImageView) listItemView.findViewById(R.id.iv_one);
        monumentImageView.setImageResource(currentMonument.getMonumentImage());

        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent monumentIntent = new Intent(currentContext, PlayMonumentDetailActivity.class);
                monumentIntent.putExtra(Constants.MONUMENT_NAME, currentMonument.getMonumentName());
                monumentIntent.putExtra(Constants.BUILT_BY, currentMonument.getBuildBy());
                monumentIntent.putExtra(Constants.MONUMENT_IMAGE, currentMonument.getMonumentImage());
                monumentIntent.putExtra(Constants.MONUMENT_YEAR, currentMonument.getYear());

                currentContext.startActivity(monumentIntent);

            }
        });

        return listItemView;
    }
}
