package com.example.mdashikulislam.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String [] age;
    String [] name;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name  = new String[6];
        name[0] = "Name";
        name[1] = "Rafi";
        name[2] = "Pantho";
        name[3] = "Rehan";
        name[4] = "Lia";
        name[5] = "Gojal";



        listView = findViewById(R.id.listName);

        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_multiple_choice,name);
        ArrayAdapter<String> stringArrayAdapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,age);

        listView.setAdapter(stringArrayAdapter);


    }
}
