package com.example.kerwinzhou.myapplication;

import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.Toast;
import com.example.kerwinzhou.myapplication.models.*;
import com.example.kerwinzhou.myapplication.Utils.*;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(R.id.fab);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hello Awesometodo", Toast.LENGTH_LONG).show();
            }
        });

        setupUI(mockData());
    }

    public void setupUI(List<Todo> list) {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.main_recycler_view);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        recyclerView.setAdapter(new TodoListAdapter(list));
    }

    private List<Todo> mockData() {
        List<Todo> list = new ArrayList<>();

        for (int i = 1; i < 1000; i++) {
            list.add(new Todo("Todo: " + i, DateUtils.stringToDate("2018 1 02 12:20")));
        }

        return list;
    }
}
