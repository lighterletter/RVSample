package com.c4q.c4q44rv;

import android.graphics.drawable.Drawable;

/**
 * Created by john on 11/4/17.
 */

public class Model {

    private String color;

    public Drawable getDrawable() {
        return drawable;
    }

    public void setDrawable(Drawable drawable) {
        this.drawable = drawable;
    }

    private Drawable drawable;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    private int position;

    public Model(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
