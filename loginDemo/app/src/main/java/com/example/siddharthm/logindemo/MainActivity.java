package com.example.siddharthm.logindemo;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edName,edEmail,edPass;
    Button buttonGo,buttonSave;
    public static final String MYPREFERENCES = "MyPrefes";
    public static final String Name = "nameKey";
    public static final String Email = "emailKey";
    SharedPreferences sp;
    dataBaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        myDb = new dataBaseHelper(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edName = (EditText)findViewById(R.id.editText);
        edEmail = (EditText)findViewById(R.id.editText2);
        edPass = (EditText)findViewById(R.id.editText3);
        buttonSave = (Button)findViewById(R.id.button);
        buttonGo = (Button)findViewById(R.id.button2);
        sp = getSharedPreferences(MYPREFERENCES, Context.MODE_PRIVATE);
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = edName.getText().toString();
                String e = edEmail.getText().toString();
                SharedPreferences.Editor editor = sp.edit();
                editor.putString(Name,n);
                editor.putString(Email,e);
                editor.commit();

                boolean isInserted = myDb.insertData(edPass.getText().toString());
                if(isInserted == true){
                    Toast.makeText(MainActivity.this,"Data inserted",Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(MainActivity.this,"Data not inserted",Toast.LENGTH_SHORT).show();
                }
            }
        });
        buttonGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(intent);
            }
        });


    }


    }

