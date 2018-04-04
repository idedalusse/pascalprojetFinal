package com.example.bensnedalus.myapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class HomeActivity extends AppCompatActivity
{


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        GridView gridView = (GridView) findViewById(R.id.dynamic);
        gridView.setAdapter(new ImageAdapter(this));

    }
}
