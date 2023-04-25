package com.chatenya.todoapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class splash_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {         //here parallel threading goes on, one for
            @Override                                      //time delayed for splash screen and one for compiler
            public void run() {
                Intent iHome = new Intent(splash_activity.this, MainActivity.class);
                startActivity(iHome);
                finish();
            }
        },3000);
    }
}