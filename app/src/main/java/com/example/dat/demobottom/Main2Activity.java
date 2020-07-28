package com.example.dat.demobottom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.dat.demobottom.Model.Category;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    RecyclerViewAdapter mRcvAdapter;
    List<Category> arraylist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycledemo);
        arraylist = new ArrayList<>();
        arraylist.add(new Category(1,"a", R.drawable.rectangle));
        arraylist.add(new Category(2,"b", R.drawable.rectangle1));
        arraylist.add(new Category(3,"c", R.drawable.rectangle2));
        arraylist.add(new Category(4,"d", R.drawable.rectangle3));
        arraylist.add(new Category(5,"e", R.drawable.rectangle4));
        arraylist.add(new Category(6,"f", R.drawable.rectangle5));
        mRcvAdapter = new RecyclerViewAdapter(arraylist);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mRcvAdapter);

    }
}
