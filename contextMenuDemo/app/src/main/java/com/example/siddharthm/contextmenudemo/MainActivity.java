package com.example.siddharthm.contextmenudemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String games[] = {"fifa 18","origins","nfs","battlefeild"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (findViewById(R.id.listView));
        ArrayAdapter<String> s = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,games);
        listView.setAdapter(s);
        registerForContextMenu(listView);
}

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Shop");
        menu.add(0,v.getId(),0,"buy");
        menu.add(0,v.getId(),0,"try trial");

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (item.getTitle() == "buy"){
            Toast.makeText(getApplicationContext(), "Buy Activated", Toast.LENGTH_SHORT).show();
        }
        if(item.getTitle() == "try trial"){
            Toast.makeText(getApplicationContext(),"Download trial from website",Toast.LENGTH_SHORT).show();
        }
        else {
            return false;
        }
        return true;
    }
}
