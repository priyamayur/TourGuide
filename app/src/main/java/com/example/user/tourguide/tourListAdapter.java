package com.example.user.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class tourListAdapter extends ArrayAdapter<tourListClass> {


    public tourListAdapter(Context context, ArrayList<tourListClass> words) {
        super(context, 0, words);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.tour_list_item, parent, false);
        }


        tourListClass currentTour = getItem(position);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);

        imageView.setImageResource(currentTour.getImageID());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.desc_text_view);

        defaultTextView.setText(currentTour.getDescID());

        return listItemView;
    }
}


