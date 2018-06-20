package com.example.siddharthm.jsonrecyclerview;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import static com.example.siddharthm.jsonrecyclerview.MainActivity.EXTRA_DESC;
import static com.example.siddharthm.jsonrecyclerview.MainActivity.EXTRA_SUBTITLE;
import static com.example.siddharthm.jsonrecyclerview.MainActivity.EXTRA_TITLE;
import static com.example.siddharthm.jsonrecyclerview.MainActivity.EXTRA_URL;

public class detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        String imageUrl = intent.getStringExtra(EXTRA_URL);
        String title = intent.getStringExtra(EXTRA_TITLE);
        String subtitle = intent.getStringExtra(EXTRA_SUBTITLE);
        String desc = intent.getStringExtra(EXTRA_DESC);
        ImageView imageView = findViewById(R.id.image_view_detail);
        TextView textViewCreator = findViewById(R.id.text_view_creator_detail);
        TextView textViewLikes = findViewById(R.id.text_view_creator_detail_likes);
        TextView textViewDesc = findViewById(R.id.text_view_creator_description_detail);
        Picasso.with(this).load(imageUrl).fit().centerInside().into(imageView);
        textViewCreator.setText(title);
        textViewLikes.setText(subtitle);
        textViewDesc.setText(desc);
    }

    public interface OnItemClickListener {
    }
}
