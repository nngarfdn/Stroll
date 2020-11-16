package com.example.stroll.ui.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.stroll.R;
import com.example.stroll.ui.home.HomeActivity;

public class SplashActivity extends AppCompatActivity {
    private int waktu_loading=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke home activity
                Intent home=new Intent(SplashActivity.this, HomeActivity.class);
                startActivity(home);
                finish();

            }
        },waktu_loading);

    }
}