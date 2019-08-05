package com.example.mad_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {

    CardView cv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        cv=findViewById(R.id.Jaffna);

        Intent intent02 = getIntent();
        String s2 = intent02.getStringExtra("first");
    }

    public void ImageButton(View v)
    {
        Intent intent02 = new Intent(MainActivity2.this,Location.class);
        intent02.putExtra("second",0);
        startActivity(intent02);


    }
}
