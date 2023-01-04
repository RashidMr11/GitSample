package com.example.gitsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        //
        //
        Log.i("TAG", "onCreate: This is the Second Commit");
        //
        //
        //
        Log.i("TAG", "onCreate: This is the Third Commit");
    }
}