package com.c4q.c4q44rv;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by john on 11/4/17.
 */

public class ColorViewHolder extends RecyclerView.ViewHolder {

    public ColorViewHolder(View itemView) {
        super(itemView);
    }

    public void bind(Model model) {
        String colorValue = model.getColor();
        int colorInt = Color.parseColor(colorValue);
        itemView.setBackgroundColor(colorInt);
    }
}
