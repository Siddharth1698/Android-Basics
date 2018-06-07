package com.example.siddharthm.sendsmsdemo;

import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText mobileNo;
    EditText messag;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mobileNo = (EditText)findViewById(R.id.ed1);
        messag = (EditText)findViewById(R.id.ed2);
        b = (Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String no = mobileNo.getText().toString();
                String mes = messag.getText().toString();
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                PendingIntent p = PendingIntent.getActivity(getApplicationContext(),0,intent,0);

                SmsManager sms = SmsManager.getDefault();
                sms.sendTextMessage(no,null,mes,p,null);
                Toast.makeText(getApplicationContext(), "Message sent succesfully", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
