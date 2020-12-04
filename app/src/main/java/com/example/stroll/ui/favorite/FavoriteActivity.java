package com.example.stroll.ui.favorite;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.stroll.R;
import com.example.stroll.database.DestinasiHelper;
import com.example.stroll.helper.MappingHelper;
import com.example.stroll.model.Destinasi;
import com.example.stroll.ui.semuadestinasi.DestinasiAdapter;

import java.util.ArrayList;

public class FavoriteActivity extends AppCompatActivity {

    private RecyclerView rvFavorite;
    ImageView imgKosong;
    Cursor dataCursor;
    DestinasiHelper destinasiHelper;
    ArrayList<Destinasi> listDestinasi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);

        rvFavorite = findViewById(R.id.rvfavorite);
        imgKosong = findViewById(R.id.imgKosong);
        destinasiHelper = DestinasiHelper.getInstance(this);

        loadData();
    }

    @Override
    protected void onResume() {
        super.onResume();
        loadData();
    }


    private void loadData() {
        destinasiHelper.open();
        dataCursor = destinasiHelper.queryAll();
        listDestinasi = MappingHelper.mapCursorToArrayList(dataCursor);
        if (listDestinasi.isEmpty()) {
            imgKosong.setVisibility(View.VISIBLE);
            showRecyclerList(listDestinasi);
        } else {
            imgKosong.setVisibility(View.INVISIBLE);
            showRecyclerList(listDestinasi);
        }
    }


    private void showRecyclerList(ArrayList<Destinasi> list) {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rvFavorite.setNestedScrollingEnabled(true);
        rvFavorite.setLayoutManager(layoutManager);
        DestinasiAdapter listPlayerAdapter = new DestinasiAdapter();
        listPlayerAdapter.setCourses(list);
        rvFavorite.setAdapter(listPlayerAdapter);
    }

}