package com.example.quranapp;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class startActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

    }

    public void paraView(View view)
    {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.putExtra("category","p");
        startActivity(intent);
    }

    public void surahView(View view)
    {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.putExtra("category","s");
        startActivity(intent);
    }

}