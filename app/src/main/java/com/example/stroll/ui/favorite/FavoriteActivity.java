package com.example.stroll.ui.favorite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.Toast;

import com.example.stroll.R;
import com.example.stroll.database.DestinasiHelper;
import com.example.stroll.helper.MappingHelper;
import com.example.stroll.model.Destinasi;
import com.example.stroll.ui.semuadestinasi.DestinasiAdapter;
import com.example.stroll.utils.DataPantai;

import java.util.ArrayList;

public class FavoriteActivity extends AppCompatActivity {

    private RecyclerView rvFavorite;
    private DestinasiHelper destinasiHelper;
    private DestinasiAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);

        rvFavorite = findViewById(R.id.rvfavorite);
        destinasiHelper = DestinasiHelper.getInstance(this);
        destinasiHelper.open();

        Cursor dataCursor = destinasiHelper.queryAll();
        ArrayList<Destinasi> listDestinasi = MappingHelper.mapCursorToArrayList(dataCursor);

        if (listDestinasi != null) {
            showRecyclerList(listDestinasi);
        } else{
            Toast.makeText(this, "Tidak ada favorite", Toast.LENGTH_SHORT).show();
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