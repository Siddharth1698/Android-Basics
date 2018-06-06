package com.example.siddharthm.sharedpreferencedemo;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ed1;
    EditText ed2;
    EditText ed3;
    Button b;
    public static final String MyPREFERENCES = "MyPrefs" ;
    public static final String Name = "nameKey";
    public static final String Phone = "phoneKey";
    public static final String Email = "emailKey";
    SharedPreferences sp;
    SharedPreferences dp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = (EditText)findViewById(R.id.editText);
        ed2 = (EditText)findViewById(R.id.editText2);
        ed3 = (EditText)findViewById(R.id.editText3);
        b = (Button)findViewById(R.id.button);

        sp = getSharedPreferences(MyPREFERENCES,Context.MODE_PRIVATE);


        b.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     String n  = ed1.getText().toString();
                                     String ph  = ed2.getText().toString();
                                     String e  = ed3.getText().toString();
                                     SharedPreferences.Editor editor = sp.edit();
                                     editor.putString(Name, n);
                                     editor.putString(Phone, ph);
                                     editor.putString(Email, e);
                                     editor.commit();

                                 }
                             }
        );
        String w1 = sp.getString(Name,"");
        String w2 =  sp.getString(Phone,"");
        String w3 = sp.getString(Email,"");


        ed1.setText(w1);
        ed2.setText(w2);
        ed3.setText(w3);
    }
}
