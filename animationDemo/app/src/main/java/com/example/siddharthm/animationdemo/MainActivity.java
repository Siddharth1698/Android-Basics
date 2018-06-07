package com.example.siddharthm.animationdemo;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView ann;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logo);
        ann = (ImageView)findViewById(R.id.imgv);
       ann.setBackgroundResource(R.drawable.animation);

    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        AnimationDrawable frameAnimation = (AnimationDrawable)ann.getBackground();
        if(hasFocus){
            frameAnimation.start();
        }else {
            frameAnimation.stop();
        }
    }
}
