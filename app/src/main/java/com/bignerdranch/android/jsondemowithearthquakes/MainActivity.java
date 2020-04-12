package com.bignerdranch.android.jsondemowithearthquakes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private EarthquakeAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mAdapter = new EarthquakeAdapter(QueryUtils.extractEarthquakes());
        mRecyclerView.setAdapter(mAdapter);
    }
}


