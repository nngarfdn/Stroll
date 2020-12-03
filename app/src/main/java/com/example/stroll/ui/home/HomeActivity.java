package com.example.stroll.ui.home;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.example.stroll.R;
import com.example.stroll.ui.welcome.WelcomeActivity;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    private Toast exitToast;
    private FragmentManager fragmentManager;
    public static ArrayList<String> pilihan = new ArrayList<>();

    @SuppressLint("ShowToast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setElevation(0);
        }

        fragmentManager = getSupportFragmentManager();
        exitToast = Toast.makeText(this, "Tekan lagi untuk kembali ke kuis", Toast.LENGTH_SHORT);

        Intent intent = getIntent();
        pilihan.addAll(intent.getStringArrayListExtra("pilihan"));
    }

    @Override
    public void onBackPressed() {
        if (fragmentManager.getBackStackEntryCount() > 0) fragmentManager.popBackStack();
        else {
            if (exitToast.getView().isShown()) {
                Intent intent = new Intent(this, WelcomeActivity.class);
                startActivity(intent);
                pilihan.clear();
            }
            else exitToast.show();
        }
    }
}