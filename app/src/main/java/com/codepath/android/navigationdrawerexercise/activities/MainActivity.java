package com.codepath.android.navigationdrawerexercise.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.codepath.android.navigationdrawerexercise.R;


public class MainActivity extends AppCompatActivity {

    Toolbar mTbMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
