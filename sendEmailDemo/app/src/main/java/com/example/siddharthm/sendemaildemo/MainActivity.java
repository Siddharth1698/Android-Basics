package com.example.siddharthm.sendemaildemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText to;
    EditText sub;
    EditText mess;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        to = (EditText)findViewById(R.id.editText1);
        sub = (EditText)findViewById(R.id.editText2);
        mess = (EditText)findViewById(R.id.editText3);
        b = (Button)findViewById(R.id.button1);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String To = to.getText().toString();
                String Sub = to.getText().toString();
                String Mess = mess.getText().toString();
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{To});
                intent.putExtra(Intent.EXTRA_SUBJECT,Sub);
                intent.putExtra(Intent.EXTRA_TEXT,Mess);

                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent,"Choose an email client"));
            }
        });


    }
}
