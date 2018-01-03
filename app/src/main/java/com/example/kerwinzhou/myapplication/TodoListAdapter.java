package com.example.kerwinzhou.myapplication;

import com.example.kerwinzhou.myapplication.models.Todo;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/**
 * Created by kerwinzhou on 1/2/18.
 */

public class TodoListAdapter extends Adapter {
    private List<Todo> list;

    public TodoListAdapter(List<Todo> data) {
        list = data;
    }

    @Override
    public TodoListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
         View view =  LayoutInflater.from(parent.getContext()).inflate(R.layout.todo_item, parent, false);
         return new TodoListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
         Todo todo = list.get(position);
         TodoListViewHolder todoListViewHolder = (TodoListViewHolder) holder;
         todoListViewHolder.textView.setText(todo.text);

         if (position%2 == 0) {
             todoListViewHolder.itemView.setBackgroundResource(android.R.color.holo_purple);
             todoListViewHolder.imageView.setVisibility(View.VISIBLE);
         } else {
             todoListViewHolder.itemView.setBackgroundResource(android.R.color.holo_green_dark);
             todoListViewHolder.imageView.setVisibility(View.GONE);
         }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
