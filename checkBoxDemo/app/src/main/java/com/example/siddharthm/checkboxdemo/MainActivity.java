package com.example.siddharthm.checkboxdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox order,gaming,music;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        order = (CheckBox)findViewById(R.id.checkBox);
        gaming = (CheckBox)findViewById(R.id.checkBox2);
        music = (CheckBox)findViewById(R.id.checkBox3);
        b = (Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = "";
                if(order.isChecked()){
                    a = "coding is love ";
                }
                if(gaming.isChecked()){
                    a = a + "gaming is fun ";
                }
                if(music.isChecked()){
                    a = a + "music is life ";
                }
                Toast.makeText(getApplicationContext(),a,Toast.LENGTH_SHORT).show();
            }
        });

    }
}
