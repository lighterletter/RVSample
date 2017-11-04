package com.c4q.c4q44rv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = "rv";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find our reference
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        //build necessities
        final LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setReverseLayout(true);
        manager.setStackFromEnd(false);
        CustomAdapter adapter = new CustomAdapter(buildModelList());

        //assign values
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);

        recyclerView.scrollToPosition(3);
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                int position = manager.findFirstVisibleItemPosition();
                Log.d(TAG, "onScrolled: position: " + position);
            }
        });

    }

    private List<Model> buildModelList() {
        List<Model> modelList = new ArrayList<>();
        modelList.add(new Model("#ffffff"));
        modelList.add(new Model("#f9982f"));
        modelList.add(new Model("#e3ee31"));
        modelList.add(new Model("#4366b0"));
        modelList.add(new Model("#2f90f9"));
        modelList.add(new Model("#bbbbbb"));
        modelList.add(new Model("#aaaaaa"));
        return modelList;
    }

}
