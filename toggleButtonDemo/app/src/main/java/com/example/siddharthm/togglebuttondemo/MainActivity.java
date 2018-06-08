package com.example.siddharthm.togglebuttondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private ToggleButton tb1,tb2;
    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b =(Button)findViewById(R.id.button);
        tb1 = (ToggleButton)findViewById(R.id.toggleButton);
        tb2 = (ToggleButton)findViewById(R.id.toggleButton2);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ToggleButton1 ").append(tb1.getText());
                stringBuilder.append("/n ToggleButton2 ").append(tb2.getText());
                Toast.makeText(getApplicationContext(),stringBuilder.toString(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}
