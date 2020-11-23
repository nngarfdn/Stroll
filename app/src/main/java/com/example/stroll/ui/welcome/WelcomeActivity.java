package com.example.stroll.ui.welcome;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.stroll.R;
import com.example.stroll.ui.kuis.KuisDestinasiActivity;
import com.example.stroll.ui.kuis.KuisSatuActivity;

public class WelcomeActivity extends AppCompatActivity {
    private Button btnMulai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        btnMulai=findViewById(R.id.btn_mulai);
        btnMulai.setOnClickListener(v -> {
            Intent intent=new Intent(WelcomeActivity.this, KuisDestinasiActivity.class);
            startActivity(intent);
        });

    }
}