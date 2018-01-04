package com.example.kerwinzhou.myapplication;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kerwinzhou.myapplication.models.Todo;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by kerwinzhou on 1/2/18.
 */

public class TodoListViewHolder extends ViewHolder {
     @BindView (R.id.main_list_item_text)TextView textView;
     @BindView (R.id.main_list_height_placeholder)ImageView imageView;

     public TodoListViewHolder(View itemView) {
         super(itemView);
         ButterKnife.bind(this, itemView);
     }
}
