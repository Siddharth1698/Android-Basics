package com.example.siddharthm.picassocheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView i1,i2,i3,i4,i5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i1 = (ImageView)findViewById(R.id.imageView);
        i2 = (ImageView)findViewById(R.id.imageView2);
        i3 = (ImageView)findViewById(R.id.imageView3);
        i4 = (ImageView)findViewById(R.id.imageView4);
        i5 = (ImageView)findViewById(R.id.imageView5);


                Picasso.get().load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRW3DRLEwttFGnqaBOFeweQ_9EqtR-iZaGPZw94EXDtNE9R7dt8").into(i1);


                Picasso.get().load("https://blogs-images.forbes.com/erikkain/files/2017/10/ACO_CurseofPharaoh_Thebes_ScorpionFight_1507597412.jpg").into(i2);


                Picasso.get().load("https://static-ca.ebgames.ca/images/products/732184/8scrmax3.jpg").into(i3);


                Picasso.get().load("https://cdn.wccftech.com/wp-content/uploads/2017/07/Assassins-Creed-Origins-1.jpg").into(i4);


                Picasso.get().load("https://gpstatic.com/acache/33/17/4/uk/s3-622dd3c8a1b0b0ce278efa5c609e44a1.jpg").into(i5);

    }
}
