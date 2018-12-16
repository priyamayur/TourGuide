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


public class PlacesFragment extends Fragment {
    static ArrayList<tourListClass> tourlist = new ArrayList<tourListClass>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tour_list, container, false);
        tourlist.add(new tourListClass(R.drawable.places1, R.string.placesString1));
        tourlist.add(new tourListClass(R.drawable.places2, R.string.placesString2));
        tourlist.add(new tourListClass(R.drawable.places3, R.string.placesString3));
        tourlist.add(new tourListClass(R.drawable.places4, R.string.placesString4));
        tourlist.add(new tourListClass(R.drawable.places5, R.string.placesString5));
        tourlist.add(new tourListClass(R.drawable.places6, R.string.placesString6));
        tourlist.add(new tourListClass(R.drawable.places7, R.string.placesString7));
        tourlist.add(new tourListClass(R.drawable.places8, R.string.placesString8));
        tourlist.add(new tourListClass(R.drawable.places9, R.string.placesString9));
        tourlist.add(new tourListClass(R.drawable.places10, R.string.placesString10));


        tourListAdapter adapter = new tourListAdapter(getActivity(), tourlist);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;

    }
}
