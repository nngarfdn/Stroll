package com.example.stroll.ui.kuis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.stroll.R;
import com.example.stroll.ui.home.HomeActivity;
import com.example.stroll.ui.saran.SaranFragment;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class KuisDestinasiActivity extends AppCompatActivity {

    private final SoalDestinasi mQuestionLibrary = new SoalDestinasi();

    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private ImageView imgIlustrasiKuis;

    private int mQuestionNumber = 0;
    private ArrayList<String> pilihan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis_destinasi);

        mQuestionView = findViewById(R.id.question);
        mButtonChoice1 = findViewById(R.id.choice1);
        mButtonChoice2 = findViewById(R.id.choice2);
        mButtonChoice3 = findViewById(R.id.choice3);
        imgIlustrasiKuis = findViewById(R.id.imgIlustrasiKuis);

        pilihan.clear();
        updateQuestion();

        mButtonChoice1.setOnClickListener(view -> {
            if (mQuestionNumber < SoalDestinasi.mQuestions.length) {
                pilihan.add(mButtonChoice1.getText().toString());
                updateQuestion();
            } else {
                pilihan.add(mButtonChoice1.getText().toString());
                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                intent.putStringArrayListExtra("pilihan", pilihan);
                startActivity(intent);
            }
        });

        mButtonChoice2.setOnClickListener(view -> {
            if (mQuestionNumber < SoalDestinasi.mQuestions.length) {
                pilihan.add(mButtonChoice2.getText().toString());
                updateQuestion();
            } else {
                pilihan.add(mButtonChoice1.getText().toString());
                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                intent.putStringArrayListExtra("pilihan", pilihan);
                startActivity(intent);
            }
        });

        mButtonChoice3.setOnClickListener(view -> {
            if (mQuestionNumber < SoalDestinasi.mQuestions.length) {
                pilihan.add(mButtonChoice3.getText().toString());
                updateQuestion();
            } else {
                pilihan.add(mButtonChoice1.getText().toString());
                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                intent.putStringArrayListExtra("pilihan", pilihan);
                startActivity(intent);
            }
        });



    }

    private void updateQuestion() {
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));

        Glide.with(this).asBitmap()
                .load(mQuestionLibrary.getImage(mQuestionNumber))
                .override(300, 150)
                .into(imgIlustrasiKuis);

        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
        if (mQuestionNumber < SoalDestinasi.mQuestions.length) mQuestionNumber++;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Selesaikan dulu :)", Toast.LENGTH_SHORT).show();
    }
}