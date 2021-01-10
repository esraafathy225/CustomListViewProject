package com.company.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class DayAdapter extends ArrayAdapter<Day> {

    public DayAdapter(@NonNull Context context, @NonNull List<Day> objects) {
        super(context, 0, objects);
    }

    // Call getView method
    // Call layout resource
    // Call textview id
    // set String into textview

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        convertView=LayoutInflater.from(getContext()).inflate(R.layout.custom_item,parent,false);

        TextView txt1=convertView.findViewById(R.id.txt1);
        TextView txt2=convertView.findViewById(R.id.txt2);
        ImageView imageView=convertView.findViewById(R.id.img);

        Day day=getItem(position);

        txt1.setText(day.getDay());
        txt2.setText(day.getNumber());
        imageView.setImageResource(day.getImageId());

        return convertView;
    }
}
