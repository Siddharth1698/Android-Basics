package com.example.siddharthm.alarmmanager;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = (Button)findViewById(R.id.button1);
                b.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             startAlert();
                                         }
                                     }
                );


    }

    private void startAlert() {
        ed = (EditText)findViewById(R.id.editText);
        int i = Integer.parseInt(ed.getText().toString());
        Intent intent = new Intent(this,MyBroadCastServices.class);
        PendingIntent p = PendingIntent.getBroadcast(this.getApplicationContext(),21321,intent,0);
        AlarmManager alarmManager = (AlarmManager)getSystemService(ALARM_SERVICE);
        alarmManager.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis()+(i*1000),p);
        Toast.makeText(this, "alarm", Toast.LENGTH_SHORT).show();

    }
}
