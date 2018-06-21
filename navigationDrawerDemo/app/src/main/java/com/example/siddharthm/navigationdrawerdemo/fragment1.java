package com.example.siddharthm.navigationdrawerdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragment1 extends Fragment {
    ImageView imageView;


    public fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

      View rootView =  inflater.inflate(R.layout.fragment_fragment1,container,false);
      imageView = (ImageView)rootView.findViewById(R.id.imageView2);
        Picasso.get().load("https://media.contentapi.ea.com/content/dam/ea/easports/fifa/home/2018/world-cup-april30/top/f18wc-homepage-top-hero-bg-xs.jpg").into(imageView);
        // Inflate the layout for this fragment
        return rootView;
    }

}
