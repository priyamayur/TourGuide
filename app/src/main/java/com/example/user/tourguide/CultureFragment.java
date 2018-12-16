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


public class CultureFragment extends Fragment {
    static ArrayList<tourListClass> tourlist = new ArrayList<tourListClass>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        tourlist.add(new tourListClass(R.drawable.cult1, R.string.cultureString1));
        tourlist.add(new tourListClass(R.drawable.cult2, R.string.cultureString2));
        tourlist.add(new tourListClass(R.drawable.cult3, R.string.cultureString3));
        tourlist.add(new tourListClass(R.drawable.cult4, R.string.cultureString4));
        tourlist.add(new tourListClass(R.drawable.cult5, R.string.cultureString5));
        tourlist.add(new tourListClass(R.drawable.cult6, R.string.cultureString6));
        tourlist.add(new tourListClass(R.drawable.cult7, R.string.cultureString7));
        tourlist.add(new tourListClass(R.drawable.cult8, R.string.cultureString8));
        tourlist.add(new tourListClass(R.drawable.cult9, R.string.cultureString9));
        tourlist.add(new tourListClass(R.drawable.cult10, R.string.cultureString10));


        tourListAdapter adapter = new tourListAdapter(getActivity(), tourlist);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
