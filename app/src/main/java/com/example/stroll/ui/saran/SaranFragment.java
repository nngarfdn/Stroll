package com.example.stroll.ui.saran;

import android.content.Intent;
import android.os.Bundle;
import java.util.Collections;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.stroll.R;
import com.example.stroll.model.Destinasi;
import com.example.stroll.ui.home.HomeActivity;
import com.example.stroll.utils.DataBioskop;
import com.example.stroll.utils.DataCandi;
import com.example.stroll.utils.DataInternetCafe;
import com.example.stroll.utils.DataKolamRenang;
import com.example.stroll.utils.DataMall;
import com.example.stroll.utils.DataMuseum;
import com.example.stroll.utils.DataPantai;
import com.example.stroll.utils.DataPublicPlaces;
import com.example.stroll.utils.DataRestoran;

import java.util.ArrayList;
import java.util.Collection;

public class SaranFragment extends Fragment {

    public SaranFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ArrayList<String> pilihan = HomeActivity.pilihan;
        ArrayList<Destinasi> list = new ArrayList<>();

        if (pilihan != null) {
            for (int i = 0; i < pilihan.size(); i++) {
                if (pilihan.get(i).equals("Pantai")) {
                    list.addAll(DataPantai.getListDataPantai());
                }
                if (pilihan.get(i).equals("Museum")) {
                    list.addAll(DataMuseum.getListDataMuseum());
                }
                if (pilihan.get(i).equals("Candi")) {
                    list.addAll(DataCandi.getListDataCandi());
                }
                if (pilihan.get(i).equals("Internet Cafe")) {
                    list.addAll(DataInternetCafe.getListDataInternetCafe());
                }
                if (pilihan.get(i).equals("Restoran")) {
                    list.addAll(DataRestoran.getListDataRestoran());
                }
                if (pilihan.get(i).equals("Kolam Renang")) {
                    list.addAll(DataKolamRenang.getListDataKolamRenang());
                }
                if (pilihan.get(i).equals("Mall")) {
                    list.addAll(DataMall.getListDataMall());
                }
                if (pilihan.get(i).equals("Bioskop")) {
                    list.addAll(DataBioskop.getListDataBioskop());
                }
                if (pilihan.get(i).equals("Publik Places")) {
                    list.addAll(DataPublicPlaces.getListDataPublicPlaces());
                }
            }
        }

        Collections.shuffle(list);

        Log.d("SaranFragment", "Data pilihan: " + pilihan);

        for (int i = 0; i < list.size(); i++) {
            Log.d("SaranFragment", "Data saran : " + list.get(i).getId() + ":" + list.get(i).getNamaDestinasi());
        }

        return inflater.inflate(R.layout.fragment_saran, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }
}