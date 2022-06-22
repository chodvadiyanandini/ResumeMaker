package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class spinnerActivity extends BaseAdapter {
    Context context;
    String[] placeArray;

    spinnerActivity(Context PlaceSpinner, String[] placeArray) {
        this.context = PlaceSpinner;
        this.placeArray = placeArray;
    }


    @Override
    public int getCount() {
        return placeArray.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.activity_spinner, null);
        TextView spinnertxt = view.findViewById(R.id.placetxt);
        spinnertxt.setText(placeArray[position]);
        return view;
    }
}