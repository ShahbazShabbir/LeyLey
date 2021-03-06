package com.leyley.shoppingapp.Activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.leyley.shoppingapp.HomeScreen;
import com.leyley.shoppingapp.R;
import com.skydoves.elasticviews.ElasticLayout;

public class Payment extends AppCompatActivity {
    LinearLayout backbtn;
    ElasticLayout submitorder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        backbtn=findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        submitorder=findViewById(R.id.submitorder);
        submitorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Payment.this,OrderSubmited.class);
                startActivity(intent);
            }
        });
    }
}