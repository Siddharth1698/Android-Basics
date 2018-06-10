package com.example.siddharthm.sqlitedb;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    dataBaseHelper myDb;
    EditText ed1,ed2,ed3;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDb = new dataBaseHelper(this);
        ed1 = (EditText)findViewById(R.id.editText);
        ed2 = (EditText)findViewById(R.id.editText2);
        ed3 = (EditText)findViewById(R.id.editText3);
        b = (Button)findViewById(R.id.button);
        AddData();

 }

    public void AddData(){

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isInserted =  myDb.insertData(ed1.getText().toString(),ed2.getText().toString(),ed3.getText().toString());
                if(isInserted == true){

                    Toast.makeText(MainActivity.this,"Data inserted",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this,"Data not inserted",Toast.LENGTH_SHORT).show();
                }
            }

        });

    }
}
