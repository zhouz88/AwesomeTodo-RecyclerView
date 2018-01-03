package com.example.kerwinzhou.myapplication;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kerwinzhou.myapplication.models.Todo;

/**
 * Created by kerwinzhou on 1/2/18.
 */

public class TodoListViewHolder extends ViewHolder {
     TextView textView;
     ImageView imageView;

     public TodoListViewHolder(View itemView) {
         super(itemView);
         textView = (TextView) itemView.findViewById(R.id.main_list_item_text);
         imageView = (ImageView) itemView.findViewById(R.id.main_list_height_placeholder);
     }
}
