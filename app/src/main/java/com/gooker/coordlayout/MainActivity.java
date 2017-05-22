package com.gooker.coordlayout;

import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolBar;
    private RecyclerView rcyContent;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolBar = (Toolbar) findViewById(R.id.tool_bar);
        rcyContent = (RecyclerView) findViewById(R.id.rcy_content);
        fab = (FloatingActionButton) findViewById(R.id.fab);


        setSupportActionBar(toolBar);

        toolBar.setTitleTextColor(Color.BLUE);


    }
}
