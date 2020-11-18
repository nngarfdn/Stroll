package com.example.stroll.ui.detail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.stroll.R;
import com.example.stroll.database.DatabaseContract;
import com.example.stroll.database.DatabaseHelper;
import com.example.stroll.database.DestinasiHelper;
import com.example.stroll.helper.MappingHelper;
import com.example.stroll.model.Destinasi;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {
    static String ID = "id";
    static String TITLE = "title";
    static String DESCRIPTION = "description";
    static String ADDRESS = "address";
    static String PHOTO = "photo";


    private DestinasiHelper destinasiHelper;
    public static final String EXTRA_DESTINASI = "extra_destinasi";

    Boolean isFavorite = false;
    Destinasi destinasi;
    ImageView imgDetailDestinasi, favorite;
    TextView txtNamaDestinasiDetail, txtDeskripsiDestinasiDetail, txtAlamatDestinasiDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        destinasi = getIntent().getParcelableExtra(EXTRA_DESTINASI);
        destinasiHelper = DestinasiHelper.getInstance(this);
        destinasiHelper.open();


        Cursor dataCursor = destinasiHelper.queryAll();
        ArrayList<Destinasi> listDestinasi = MappingHelper.mapCursorToArrayList(dataCursor);

        ArrayList<Integer> listId = new ArrayList<>();
        for (int i = 0; i < listDestinasi.size(); i++) {
            listId.add(listDestinasi.get(i).getId());
        }

        initView();
        changeView(destinasi);

        isFavorite = listId.contains(destinasi.getId());
        setFavorite(isFavorite);

        Log.d("status faforite", "onCreate: " + isFavorite);

        setFavorite(isFavorite);

        favorite.setOnClickListener(v -> {
            if (isFavorite) {
                isFavorite = false;
                setFavorite(isFavorite);
                int delete = destinasiHelper.deleteById(String.valueOf(destinasi.getId()));
                if (delete > 0) {
                    Toast.makeText(this, "Berhasil hapus Favorite", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Gagal hapus favorite", Toast.LENGTH_SHORT).show();

                }
            } else {
                isFavorite = true;
                setFavorite(isFavorite);
                ContentValues values = new ContentValues();
                values.put(ID, destinasi.getId());
                values.put(TITLE, destinasi.getNamaDestinasi());
                values.put(DESCRIPTION, destinasi.getDeskripsiDestinasi());
                values.put(ADDRESS, destinasi.getAlamatDestinasi());
                values.put(PHOTO, destinasi.getPhotoDestinasi());

                long result = destinasiHelper.insert(values);

                if (result > 0) {
                    Toast.makeText(this, "Success menambah", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Gagal Menambah favorite", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void setFavorite(Boolean isFavorite) {
        if (isFavorite) {
            favorite.setImageResource(R.drawable.ic_baseline_favorite_24);
        } else {
            favorite.setImageResource(R.drawable.ic_baseline_favorite_border_24);
        }
    }


    private void changeView(Destinasi destinasi) {

        Picasso.get()
                .load(destinasi.getPhotoDestinasi())
                .into(imgDetailDestinasi);

        txtNamaDestinasiDetail.setText(destinasi.getNamaDestinasi());
        txtDeskripsiDestinasiDetail.setText(destinasi.getDeskripsiDestinasi());
        txtAlamatDestinasiDetail.setText(destinasi.getAlamatDestinasi());

    }

    private void initView() {
        imgDetailDestinasi = findViewById(R.id.imgDetailDestinasi);
        favorite = findViewById(R.id.favorite);
        txtNamaDestinasiDetail = findViewById(R.id.txtNamaDestinasiDetail);
        txtAlamatDestinasiDetail = findViewById(R.id.txtAlamatDestinasiDetail);
        txtDeskripsiDestinasiDetail = findViewById(R.id.txtDeskripsiDestinasiDetail);
    }
}