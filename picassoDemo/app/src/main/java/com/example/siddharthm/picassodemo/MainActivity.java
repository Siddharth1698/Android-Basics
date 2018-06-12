package com.example.siddharthm.picassodemo;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button drawablee,placeholder,url,error,callback,resize,rotate,scale,target;
    private Target targeti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView)findViewById(R.id.imageView);


        drawablee = (Button)findViewById(R.id.button);
        placeholder = (Button)findViewById(R.id.button2);
        url = (Button)findViewById(R.id.button3);
        error = (Button)findViewById(R.id.button4);
        callback = (Button)findViewById(R.id.button5);
        resize = (Button)findViewById(R.id.button6);
        rotate = (Button)findViewById(R.id.button7);
        scale = (Button)findViewById(R.id.button8);
        target = (Button)findViewById(R.id.button9);

        drawablee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Picasso.get().load(R.mipmap.ic_launcher).into(imageView);
            }
        });
        placeholder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Picasso.get().load("https://images4.alphacoders.com/640/thumb-1920-64028.jpg").placeholder(R.mipmap.ic_launcher_round).into(imageView);
            }
        });
        url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/a/ae/Castle_Neuschwanstein.jpg").into(imageView);
            }
        });
        error.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Picasso.get().load("https:/").error(R.mipmap.ic_launcher_round).into(imageView);
            }
        });
        resize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/a/ae/Castle_Neuschwanstein.jpg").resize(150, 200).into(imageView);
            }
        });
        scale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/a/ae/Castle_Neuschwanstein.jpg").resize(150,150).centerCrop().into(imageView);
            }
        });
        rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/a/ae/Castle_Neuschwanstein.jpg").rotate(90f).into(imageView);
            }
        });
        callback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/a/ae/Castle_Neuschwanstein.jpg").into(imageView, new Callback() {
                    @Override
                    public void onSuccess() {
                        Toast.makeText(getApplicationContext(),"Success",Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getApplicationContext(),"failed",Toast.LENGTH_SHORT).show();

                    }
                });

            }
        });


        target.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/a/ae/Castle_Neuschwanstein.jpg").placeholder(R.drawable.placeholder).error(R.drawable.error).into(targeti);


            }
        });
        targeti = new Target() {
            @Override
            public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {
                imageView.setImageBitmap(bitmap);
            }

            @Override
            public void onBitmapFailed(Exception e, Drawable errorDrawable) {
                imageView.setImageDrawable(errorDrawable);
            }

            @Override
            public void onPrepareLoad(Drawable placeHolderDrawable) {
                imageView.setImageDrawable(placeHolderDrawable);
            }
        };




    }
}
