package com.example.siddharthm.sqlitedb;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    dataBaseHelper myDb;
    EditText ed1,ed2,ed3;
    Button b,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDb = new dataBaseHelper(this);
        ed1 = (EditText)findViewById(R.id.editText);
        ed2 = (EditText)findViewById(R.id.editText2);
        ed3 = (EditText)findViewById(R.id.editText3);
        b = (Button)findViewById(R.id.button);
        b2 = (Button)findViewById(R.id.button2);
        AddData();
        viewAll();

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

    public void viewAll(){
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res = myDb.getAllData();
                if(res.getCount() == 0){
                    showMessage("ERROR","NO DATA FOUND");
                    return;
                } else {
                    StringBuffer buffer = new StringBuffer();
                    while (res.moveToNext()){
                        buffer.append("ID: " + res.getString(0)+"\n");
                        buffer.append("NAME: " + res.getString(1)+"\n");
                        buffer.append("SURNAME: " + res.getString(2)+"\n");
                        buffer.append("MARKS: " + res.getString(3)+"\n");

                    }
                    showMessage("DATA",buffer.toString());
                }
            }
        });
    }

    public void showMessage(String title,String message){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }
}
