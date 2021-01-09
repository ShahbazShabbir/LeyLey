package com.leyley.shoppingapp.Activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.leyley.shoppingapp.HomeScreen;
import com.leyley.shoppingapp.R;
import com.skydoves.elasticviews.ElasticLayout;

public class OrderSubmited extends AppCompatActivity {
    ElasticLayout backtohome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_submited);

        backtohome=findViewById(R.id.backtohome);
        backtohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OrderSubmited.this, HomeScreen.class);
                startActivity(intent);
                finish();
            }
        });
    }
}