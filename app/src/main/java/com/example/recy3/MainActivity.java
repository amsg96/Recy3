package com.example.recy3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Model> items = new ArrayList<>();
    private AdapterRecy adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);
        adapter = new AdapterRecy(items,MainActivity.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerView.setAdapter(adapter);

        showdata();
    }

    private void showdata(){
        items.add(new Model(R.drawable.a,"11111"));
        items.add(new Model(R.drawable.b,"22222"));
        items.add(new Model(R.drawable.c,"33333"));
        items.add(new Model(R.drawable.ed,"44444"));
        items.add(new Model(R.drawable.efd,"55555"));
    }
}
