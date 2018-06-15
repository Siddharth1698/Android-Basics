package com.example.siddharthm.logindemo;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.siddharthm.logindemo.MainActivity.Email;
import static com.example.siddharthm.logindemo.MainActivity.MYPREFERENCES;
import static com.example.siddharthm.logindemo.MainActivity.Name;

public class Main2Activity extends AppCompatActivity {
    TextView textName;
    TextView textEmail;
    TextView textPass;
    Button buttonShow;
    SharedPreferences sp;
    dataBaseHelper myDb;
    String passi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myDb = new dataBaseHelper(this);
        setContentView(R.layout.activity_main2);
        textName = (TextView)findViewById(R.id.textView13);
        textEmail = (TextView)findViewById(R.id.textView14);
        textPass = (TextView)findViewById(R.id.textView3);
        sp = getSharedPreferences(MYPREFERENCES, Context.MODE_PRIVATE);
        buttonShow = (Button)findViewById(R.id.button3);
        String w1 = sp.getString(Name,"");
        String w2 =  sp.getString(Email,"");
        textName.setText(w1);
        textEmail.setText(w2);
        buttonShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res = myDb.getData();
                if(res.getCount() == 0){
                  return;
                } else {
                    String buffer = new String();
                    while (res.moveToNext()){
                        buffer ="PASS: " + res.getString(1)+"\n";
                    }
                    textPass.setText(buffer);
                }
            }
        });


    }
}
