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

public class ShoppingMallListAdapter extends ArrayAdapter<ShoppingMall> {
    Activity currentContext;

    public ShoppingMallListAdapter(Activity context, ArrayList<ShoppingMall> shoppingMalls) {
        super(context, 0, shoppingMalls);
        currentContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.shoppingmall_list_item, parent, false);
        }

        final ShoppingMall currentShoppingMall = getItem(position);

        TextView shoppingMallNameTextView = (TextView) listItemView.findViewById(R.id.shoppingmall_name);
        assert currentShoppingMall != null;
        shoppingMallNameTextView.setText(currentShoppingMall.getShoppingMallName());

        TextView shoppingMallTimeTextView = (TextView) listItemView.findViewById(R.id.shoppingmall_time);
        shoppingMallTimeTextView.setText(currentShoppingMall.getTiming());

        ImageView shoppingMallImageView = (ImageView) listItemView.findViewById(R.id.shoppingmall_image);
        shoppingMallImageView.setImageResource(currentShoppingMall.getmShoppingMallImage());

        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shoppingMallIntent = new Intent(currentContext, PlayShoppingMallDetailActivity.class);
                shoppingMallIntent.putExtra(Constants.SHOPPINGMALL_NAME, currentShoppingMall.getShoppingMallName());
                shoppingMallIntent.putExtra(Constants.SHOPPINGMALL_ADDRESS, currentShoppingMall.getShoppingMallAddress());
                shoppingMallIntent.putExtra(Constants.SHOPPINGMALL_TIME, currentShoppingMall.getTiming());
                shoppingMallIntent.putExtra(Constants.SHOPPINGMALL_IMAGE, currentShoppingMall.getmShoppingMallImage());

                currentContext.startActivity(shoppingMallIntent);

            }
        });

        return listItemView;
    }
}
