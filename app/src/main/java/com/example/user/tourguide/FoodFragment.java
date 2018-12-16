package com.example.user.tourguide;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class FoodFragment extends Fragment {
    static ArrayList<tourListClass> tourlist = new ArrayList<tourListClass>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        tourlist.add(new tourListClass(R.drawable.food1, R.string.foodString1));
        tourlist.add(new tourListClass(R.drawable.food2, R.string.foodString2));
        tourlist.add(new tourListClass(R.drawable.food3, R.string.foodString3));
        tourlist.add(new tourListClass(R.drawable.food4, R.string.foodString4));
        tourlist.add(new tourListClass(R.drawable.food5, R.string.foodString5));
        tourlist.add(new tourListClass(R.drawable.food6, R.string.foodString6));
        tourlist.add(new tourListClass(R.drawable.food7, R.string.foodString7));
        tourlist.add(new tourListClass(R.drawable.food8, R.string.foodString8));
        tourlist.add(new tourListClass(R.drawable.food9, R.string.foodString9));
        tourlist.add(new tourListClass(R.drawable.food10, R.string.foodString10));


        tourListAdapter adapter = new tourListAdapter(getActivity(), tourlist);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
