package com.example.siddharthm.tabbedactivitydemo;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class TwoFragment extends Fragment {

    ListView listView;



    public TwoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String[] StringArray = {"Android","IPhone","WindowsMobile","Blackberry",
                "WebOS","Ubuntu","Windows7","Max OS X"};

        View rootView = inflater.inflate(R.layout.fragment_two, container, false);
        listView = (ListView)rootView.findViewById(R.id.listView);

        ArrayAdapter adapter = new ArrayAdapter<String>(getActivity().getBaseContext(),android.R.layout.simple_list_item_1,StringArray);
        listView.setAdapter(adapter);
        // Inflate the layout for this fragment
        return rootView;
    }

}
