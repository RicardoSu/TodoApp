package com.example.simpletodo;

import android.content.Intent;
import android.os.Handler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getSupportActionBar().hide();

        // This uses the HomeActivity Splash Screen and transfer to the MainActivity screen
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i= new Intent(HomeActivity.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        }, 2000);

    }
}
