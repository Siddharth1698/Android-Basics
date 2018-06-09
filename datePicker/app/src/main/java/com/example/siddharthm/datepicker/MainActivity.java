package com.example.siddharthm.datepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    DatePicker dp;
    Button b;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = (TextView)findViewById(R.id.textView);
        b = (Button)findViewById(R.id.button);
        dp =(DatePicker)findViewById(R.id.datePicker1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.setText(getCurrentDate());
            }
        });
    }

    private String getCurrentDate() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(dp.getMonth() + 1 + "/");
        stringBuilder.append(dp.getDayOfMonth()+ "/");
        stringBuilder.append(dp.getYear());
        return stringBuilder.toString();
    }
}
