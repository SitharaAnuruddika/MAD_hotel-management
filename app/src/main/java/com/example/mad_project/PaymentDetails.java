package com.example.mad_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PaymentDetails extends AppCompatActivity {

    Button butt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_details);

        butt = findViewById(R.id.button1);


    }
    public void setbutt(View v)
    {
        Intent intent3 = new Intent(PaymentDetails.this,PaymentAccount.class);
        startActivity(intent3);
    }
}
