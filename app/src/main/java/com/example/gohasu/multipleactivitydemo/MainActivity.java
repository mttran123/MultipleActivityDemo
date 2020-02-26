package com.example.gohasu.multipleactivitydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

//    public void goToNext(View view) {
//        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
//        intent.putExtra("age", 30);
//
//        startActivity(intent);
//    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);
        final ArrayList<String> family = new ArrayList<>();
        family.add("Mai");
        family.add("Joshua");
        family.add("Vi An");

        ArrayAdapter<String> name = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, family);

        listView.setAdapter(name);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("name", family.get(i));

                startActivity(intent);
            }
        });
    }
}
