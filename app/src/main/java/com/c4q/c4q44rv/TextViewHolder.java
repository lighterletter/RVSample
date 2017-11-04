package com.c4q.c4q44rv;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by john on 11/4/17.
 */

class TextViewHolder extends RecyclerView.ViewHolder {
    public TextViewHolder(View itemView) {
        super(itemView);
    }

    public void bind(final Model model) {
        TextView textView = (TextView) itemView.findViewById(R.id.viewholder_text);
        Button changeColorButton = (Button) itemView.findViewById(R.id.change_color_button);
        String value = String.valueOf(model.getPosition());
        textView.setText(value);

        changeColorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itemView.setBackgroundColor(Color.parseColor(model.getColor()));
            }
        });

    }

}
