package com.example.siddharthm.valuechanger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.button);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);
        b5 = (Button)findViewById(R.id.button5);
        b6 = (Button)findViewById(R.id.button6);
        b7 = (Button)findViewById(R.id.button7);
        b8 = (Button)findViewById(R.id.button8);
        b9 = (Button)findViewById(R.id.button9);
        t = (TextView)findViewById(R.id.textView2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = b1.getText().toString();
                t.setText(s1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s2 = b2.getText().toString();
                t.setText(s2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s3 = b3.getText().toString();
                t.setText(s3);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s4 = b4.getText().toString();
                t.setText(s4);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s5 = b5.getText().toString();
                t.setText(s5);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s6 = b6.getText().toString();
                t.setText(s6);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s7 = b7.getText().toString();
                t.setText(s7);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s8 = b8.getText().toString();
                t.setText(s8);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s9 = b9.getText().toString();
                t.setText(s9);
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle","onstart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle","onrestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle","onresume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle","onpause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle","onstop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle","ondestroy");
    }
}
