package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MainActivity4 extends AppCompatActivity {
    private String[] arr = {"0"};
    static final Date date= Calendar.getInstance().getTime();;
    static final String s1 = date.toString().substring(11, 16);
    static String s = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main4);


        /*TextView tv = findViewById(R.id.textView10);
        TextView tv1 = findViewById(R.id.textView11);
        //String[] arr = {"0"};
        List<String> l = new ArrayList<String>(Arrays.asList(arr));

        s =getIntent().getStringExtra(MainActivity5.EXTRA_NAME);
        l.add(s1);

        tv.setText(s);
        tv1.setText(l.get(1));*/
    }
}