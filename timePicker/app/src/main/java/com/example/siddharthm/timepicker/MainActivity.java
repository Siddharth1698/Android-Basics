package com.example.siddharthm.timepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    TextView t;
    Button b;
    TimePicker tp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = (TextView)findViewById(R.id.textView);
        b = (Button)findViewById(R.id.button);
        tp = (TimePicker)findViewById(R.id.timePicker);
        tp.setIs24HourView(true);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.setText(getCurrentTime());
            }
        });
    }

    private String getCurrentTime() {
        String currentTime = "Current time: " + tp.getCurrentHour() +":" + tp.getCurrentMinute();
        return currentTime;
    }
}
