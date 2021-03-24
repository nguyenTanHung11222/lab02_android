package com.example.ongk;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rclName;
    private NameListAdapter nameListAdapter;
    private ArrayList<String> nameArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rclName = findViewById(R.id.rcvName);
        nameArrayList = new ArrayList<>();
        nameArrayList.add("Cường");
        nameArrayList.add("Tài");
        nameArrayList.add("Tiến");
        nameArrayList.add("JuunD");
        nameArrayList.add("Long");
        nameArrayList.add("Hưng");
        nameArrayList.add("Chính");
        nameArrayList.add("Hưng Trúc");

        nameListAdapter = new NameListAdapter(this,nameArrayList);
        rclName.setAdapter(nameListAdapter);
        rclName.setLayoutManager(new LinearLayoutManager(this));
    }
}