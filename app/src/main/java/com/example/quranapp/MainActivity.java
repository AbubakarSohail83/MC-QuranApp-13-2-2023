package com.example.quranapp;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView mainView=(RecyclerView) findViewById(R.id.mainRecyclerView);
        mainView.setLayoutManager(new LinearLayoutManager(this));
        String [] languages={"Java","Javascript","C++","C#","Python","Flask","React","MongoDb","Basic"};
        mainView.setAdapter(new mainViewAdapter(languages));
    }

}