package com.example.stroll.ui.detail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.stroll.R;
import com.example.stroll.model.Destinasi;
import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_DESTINASI = "extra_destinasi" ;

    Destinasi destinasi;

    ImageView imgDetailDestinasi;
    TextView txtNamaDestinasiDetail, txtDeskripsiDestinasiDetail, txtAlamatDestinasiDetail ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        destinasi = getIntent().getParcelableExtra(EXTRA_DESTINASI);

        initView();
        changeView(destinasi);
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
        txtNamaDestinasiDetail = findViewById(R.id.txtNamaDestinasiDetail);
        txtAlamatDestinasiDetail = findViewById(R.id.txtAlamatDestinasiDetail);
        txtDeskripsiDestinasiDetail = findViewById(R.id.txtDeskripsiDestinasiDetail);
    }
}