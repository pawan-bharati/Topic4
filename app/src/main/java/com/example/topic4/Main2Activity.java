package com.example.topic4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
private TextView btngo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btngo=findViewById(R.id.btngo);

        Bundle bundle=getIntent().getExtras();
        if (bundle!=null)
        {
            String result=bundle.getString("Capital");
            btngo.setText(result);
        }
        }
    }

