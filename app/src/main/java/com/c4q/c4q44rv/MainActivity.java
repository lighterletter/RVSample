package com.c4q.c4q44rv;

import android.graphics.drawable.Drawable;
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

    private final static String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find our reference
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        //build necessities
        final LinearLayoutManager manager = new LinearLayoutManager(this);
        List<Model> list = buildModelList();
        CustomAdapter adapter = new CustomAdapter(list);

        //assign values
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);

        // set this cache size to not recycle because if not recycled views would be bound with previous information.
        recyclerView.setItemViewCacheSize(list.size());

    }

    private List<Model> buildModelList() {
        List<Model> modelList = new ArrayList<>();

        Drawable bunnies = getResources().getDrawable(R.drawable.bunnies);
        Drawable cats = getResources().getDrawable(R.drawable.cats);
        Drawable elephant = getResources().getDrawable(R.drawable.elephant);
        Drawable giraffes = getResources().getDrawable(R.drawable.giraffes);
        Drawable lion = getResources().getDrawable(R.drawable.lion);
        Drawable panda = getResources().getDrawable(R.drawable.panda);
        Drawable penguins = getResources().getDrawable(R.drawable.penguins);
        Drawable puppy = getResources().getDrawable(R.drawable.puppy);
        Drawable tiger = getResources().getDrawable(R.drawable.tiger);

        Model bunniesModel = new Model("#eeb939");
        bunniesModel.setDrawable(bunnies);
        Model catsModel = new Model("#34526d");
        catsModel.setDrawable(cats);
        Model elephantModel = new Model("#ffffff");
        elephantModel.setDrawable(elephant);
        Model giraffeModel = new Model("#f9982f");
        giraffeModel.setDrawable(giraffes);
        Model lionModel = new Model("#e3ee31");
        lionModel.setDrawable(lion);
        Model pandaModel = new Model("#4366b0");
        pandaModel.setDrawable(panda);
        Model penguinModel = new Model("#2f90f9");
        penguinModel.setDrawable(penguins);
        Model puppyModel = new Model("#bbbbbb");
        puppyModel.setDrawable(puppy);
        Model tigerModel = new Model("#aaaaaa");
        tigerModel.setDrawable(tiger);

        modelList.add(bunniesModel);
        modelList.add(catsModel);
        modelList.add(elephantModel);
        modelList.add(giraffeModel);
        modelList.add(lionModel);
        modelList.add(pandaModel);
        modelList.add(penguinModel);
        modelList.add(puppyModel);
        modelList.add(tigerModel);
        return modelList;
    }
}
