package com.leyley.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.skydoves.elasticviews.ElasticLayout;

public class Login extends AppCompatActivity {
    TextView signup;
    ElasticLayout login;
    ImageView backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Initialize();

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Login.this,Signup.class);
                startActivity(intent);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Login.this,HomeScreen.class);
                startActivity(intent);
            }
        });

    }

    private void Initialize() {

        signup=findViewById(R.id.signup);
        login=findViewById(R.id.login);
        backbtn=findViewById(R.id.backbtn);

    }
}