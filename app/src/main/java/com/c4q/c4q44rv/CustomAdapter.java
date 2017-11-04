package com.c4q.c4q44rv;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by john on 11/4/17.
 */

public class CustomAdapter extends RecyclerView.Adapter {
    private List<Model> models;

    public CustomAdapter(List<Model> models) {
        this.models = models;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.textview_viewholder, parent, false);
        return new AnimalViewHolder(view); //rename fn+shift+f6
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        AnimalViewHolder animalViewHolder = (AnimalViewHolder) holder;
        Model model = models.get(position);
        model.setPosition(position);
        animalViewHolder.bind(model);
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

}
