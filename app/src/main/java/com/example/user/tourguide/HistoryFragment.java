package com.example.user.tourguide;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


import java.util.ArrayList;
import java.util.List;

public class HistoryFragment extends Fragment {

    static ArrayList<tourListClass> tourlist = new ArrayList<tourListClass>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        tourlist.add(new tourListClass(R.drawable.hist1, R.string.historyString1));
        tourlist.add(new tourListClass(R.drawable.hist2, R.string.historyString2));
        tourlist.add(new tourListClass(R.drawable.hist3, R.string.historyString3));
        tourlist.add(new tourListClass(R.drawable.hist4, R.string.historyString4));
        tourlist.add(new tourListClass(R.drawable.hist5, R.string.historyString5));
        tourlist.add(new tourListClass(R.drawable.hist6, R.string.historyString6));
        tourlist.add(new tourListClass(R.drawable.hist7, R.string.historyString7));
        tourlist.add(new tourListClass(R.drawable.hist8, R.string.historyString8));
        tourlist.add(new tourListClass(R.drawable.hist9, R.string.historyString9));
        tourlist.add(new tourListClass(R.drawable.hist10, R.string.historyString10));


        tourListAdapter adapter = new tourListAdapter(getActivity(), tourlist);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
