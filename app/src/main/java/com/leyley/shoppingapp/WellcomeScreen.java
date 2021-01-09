package com.leyley.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.leyley.shoppingapp.Activites.Login;
import com.leyley.shoppingapp.Activites.Signup;
import com.skydoves.elasticviews.ElasticLayout;

public class WellcomeScreen extends AppCompatActivity {
    ElasticLayout login,signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wellcome_screen);

        Initialize();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(WellcomeScreen.this, Login.class);
                startActivity(intent);
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(WellcomeScreen.this, Signup.class);
                startActivity(intent);
            }
        });
    }

    private void Initialize() {

        login=findViewById(R.id.login);
        signup=findViewById(R.id.signup);

    }
}