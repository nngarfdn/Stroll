package com.example.stroll.ui.detail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.stroll.R;
import com.example.stroll.database.DatabaseContract;
import com.example.stroll.database.DatabaseHelper;
import com.example.stroll.database.DestinasiHelper;
import com.example.stroll.model.Destinasi;
import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {
    static String TITLE = "title";
    static String DESCRIPTION = "description";
    static String ADDRESS = "address";
    static String PHOTO = "photo";


    private DestinasiHelper destinasiHelper;
    public static final String EXTRA_DESTINASI = "extra_destinasi" ;

    Destinasi destinasi;
    ImageView imgDetailDestinasi, favorite;
    TextView txtNamaDestinasiDetail, txtDeskripsiDestinasiDetail, txtAlamatDestinasiDetail ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        destinasi = getIntent().getParcelableExtra(EXTRA_DESTINASI);
        destinasiHelper = DestinasiHelper.getInstance(this);
        destinasiHelper.open();


        initView();
        changeView(destinasi);

        favorite.setOnClickListener(v -> {
            ContentValues values = new ContentValues();
            values.put(TITLE,destinasi.getNamaDestinasi());
            values.put(DESCRIPTION, destinasi.getDeskripsiDestinasi());
            values.put(ADDRESS, destinasi.getAlamatDestinasi());
            values.put(PHOTO, destinasi.getPhotoDestinasi());

            long result = destinasiHelper.insert(values);

            if (result > 0) {
                Toast.makeText(this, "Success menambah", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Gagal Menambah favorite", Toast.LENGTH_SHORT).show();
            }
        } );

    }

    private void changeView(Destinasi destinasi) {

        Picasso.get()
                .load(destinasi.getPhotoDestinasi())
                .resize(100, 100)
                .centerCrop()// resizes the image to these dimensions (in pixel)
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