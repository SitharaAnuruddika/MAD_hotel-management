package com.example.mad_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.butt);
    }

    public void setButton(View v)
    {
        Intent intent01 = new Intent(MainActivity.this,MainActivity2.class);
        intent01.putExtra("first", 0);
        startActivity(intent01);
    }





        {
    }

}
