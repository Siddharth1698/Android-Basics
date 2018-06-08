package com.example.siddharthm.customcheckboxdemo;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox ch1,ch2;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ch1 = (CheckBox)findViewById(R.id.checkBox3);
        ch2 = (CheckBox)findViewById(R.id.checkBox4);
        b = (Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "";
                if(ch1.isChecked()){
                    s = ch1.getText().toString();
                }
                if(ch2.isChecked()){
                    s = s + ch2.getText().toString();
                }
                if(s!=null && !s.toString().equals("")){
                    Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(),"NOTHING SELECTED",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
