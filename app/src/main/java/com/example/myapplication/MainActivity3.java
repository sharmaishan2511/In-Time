package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class MainActivity3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main3);

        TextView tv = findViewById(R.id.textView2);
        TextView tv1 = findViewById(R.id.textView5);

        Intent intent1 = getIntent();
        String s = intent1.getStringExtra(MainActivity2.EXTRA_NAME);

        String[] spl = s.split(":",2);

        int min = Integer.parseInt(spl[0]);
        int um = 119-min;

        int sec = Integer.parseInt(spl[1]);
        int us = 60-sec;

        String s2 = um + ":" + us;

        tv.setText(s2);
        tv1.setText(s);

    }
}