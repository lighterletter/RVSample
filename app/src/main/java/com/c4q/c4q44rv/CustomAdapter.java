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
    int viewType1 = 1111;
    int vieType2 = 2222;


    public CustomAdapter(List<Model> models) {
        this.models = models;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        if (viewType == viewType1) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.color_viewholder, parent, false);
            return new ColorViewHolder(view); //rename fn+shift+f6
        } else {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.textview_viewholder, parent, false);
            return new TextViewHolder(view); //rename fn+shift+f6
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        getItemViewType(position);
        if (getItemViewType(position) == viewType1) {
            ColorViewHolder colorViewHolder = (ColorViewHolder) holder;
            colorViewHolder.bind(models.get(position));
        } else {
            TextViewHolder textViewHolder = (TextViewHolder) holder;
            Model model = models.get(position);
            model.setPosition(position);
            textViewHolder.bind(model);
        }
    }

    @Override
    public int getItemCount() {
        return models.size();
    }


    @Override
    public int getItemViewType(int position) {
        if (position % 2 == 0) {
            return viewType1;
        } else {
            return vieType2;
        }
    }
}
