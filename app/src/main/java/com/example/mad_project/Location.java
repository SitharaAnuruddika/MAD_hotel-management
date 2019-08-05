package com.example.mad_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Location extends AppCompatActivity {

    CardView cardView,cardView2,cardView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        cardView = findViewById(R.id.minicar);
        cardView2 = findViewById(R.id.taxi);
        cardView3 = findViewById(R.id.car);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent03 = new Intent(Location.this,PaymentDetails.class);
                intent03.putExtra("third",0);
                startActivity(intent03);

            }

        });

        cardView2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent03 = new Intent(Location.this,PaymentDetails.class);
                        intent03.putExtra("third",0);
                        startActivity(intent03);

                    }

                });

                cardView3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent03 = new Intent(Location.this,PaymentDetails.class);
                        intent03.putExtra("third",0);
                        startActivity(intent03);

                    }

                });




    }
}
