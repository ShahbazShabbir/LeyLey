package com.leyley.shoppingapp.Activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.leyley.shoppingapp.HomeScreen;
import com.leyley.shoppingapp.R;
import com.skydoves.elasticviews.ElasticLayout;

public class Signup extends AppCompatActivity {
    TextView login;
    ElasticLayout signup;
    ImageView backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

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
                Intent intent=new Intent(Signup.this, HomeScreen.class);
                startActivity(intent);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Signup.this,Login.class);
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