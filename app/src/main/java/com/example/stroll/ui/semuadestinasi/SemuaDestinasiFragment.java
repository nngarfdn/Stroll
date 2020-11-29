package com.example.stroll.ui.semuadestinasi;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Toast;


import com.example.stroll.R;
import com.example.stroll.model.Destinasi;
import com.example.stroll.model.Kategori;
import com.example.stroll.ui.favorite.FavoriteActivity;
import com.example.stroll.utils.DataBioskop;
import com.example.stroll.utils.DataCandi;
import com.example.stroll.utils.DataInternetCafe;
import com.example.stroll.utils.DataKategori;
import com.example.stroll.utils.DataKolamRenang;
import com.example.stroll.utils.DataMall;
import com.example.stroll.utils.DataMuseum;
import com.example.stroll.utils.DataPantai;
import com.example.stroll.utils.DataPublicPlaces;
import com.example.stroll.utils.DataRestoran;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;


public class SemuaDestinasiFragment extends Fragment {

    RecyclerView rvSemuaDestinasi;
    FloatingActionButton fab;
    Chip cPantai, cBioskop, cCandi, cInternetCafe, cKolamRenang, cMall, cMuseum, cPublicPlaces, cRestoran;
    ChipGroup chipGroup;
    private ArrayList<Destinasi> list = new ArrayList<>();

    public SemuaDestinasiFragment() {
        // Required empty public constructor
    }

    public static SemuaDestinasiFragment newInstance(String param1, String param2) {
        SemuaDestinasiFragment fragment = new SemuaDestinasiFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        fab = view.findViewById(R.id.floatingActionButton);
        chipGroup = view.findViewById(R.id.chipgroup);
        cBioskop = view.findViewById(R.id.cbioskop);
        cCandi = view.findViewById(R.id.ccandi);
        cInternetCafe = view.findViewById(R.id.cInternetCafe);
        cKolamRenang = view.findViewById(R.id.ckolamrenang);
        cMall = view.findViewById(R.id.cmall);
        cMuseum = view.findViewById(R.id.cmuseum);
        cPantai = view.findViewById(R.id.cpantai);
        cPublicPlaces = view.findViewById(R.id.cpublicplaces);
        cRestoran = view.findViewById(R.id.crestoran);

        fab.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), FavoriteActivity.class);
            startActivity(intent);
        });

        cBioskop.setOnClickListener(v-> {
            list.clear();
            list.addAll(DataBioskop.getListDataBioskop());
            showRecyclerList();
        });

        cCandi.setOnClickListener(v -> {
            list.clear();
            list.addAll(DataCandi.getListDataCandi());
            showRecyclerList();
        });

        cInternetCafe.setOnClickListener(v -> {
            list.clear();
            list.addAll(DataInternetCafe.getListDataInternetCafe());
            showRecyclerList();
        });

        cKolamRenang.setOnClickListener(v-> {
            list.clear();
            list.addAll(DataKolamRenang.getListDataKolamRenang());
            showRecyclerList();
        });

        cMall.setOnClickListener(v -> {
            list.clear();
            list.addAll(DataMall.getListDataMall());
            showRecyclerList();
        });

        cMuseum.setOnClickListener(v-> {
            list.clear();
            list.addAll(DataMuseum.getListDataMuseum());
            showRecyclerList();
        });

        cPantai.setOnClickListener(v-> {
            list.clear();
            list.addAll(DataPantai.getListDataPantai());
            showRecyclerList();
        });

        cPublicPlaces.setOnClickListener(v -> {
            list.clear();
            list.addAll(DataPublicPlaces.getListDataPublicPlaces());
            showRecyclerList();
        });

        cRestoran.setOnClickListener(v-> {
            list.clear();
            list.addAll(DataRestoran.getListDataRestoran());
            showRecyclerList();
        });

        rvSemuaDestinasi = view.findViewById(R.id.rvSemuaDestinasi);
        list.clear();
        list.addAll(DataPantai.getListDataPantai());
        showRecyclerList();


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=  inflater.inflate(R.layout.fragment_semua_destinasi, container, false);
        return view;

    }

    private void showRecyclerList() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        rvSemuaDestinasi.setNestedScrollingEnabled(true);
        rvSemuaDestinasi.setLayoutManager(layoutManager);
        DestinasiAdapter listPlayerAdapter = new DestinasiAdapter();
        listPlayerAdapter.setCourses(list);
        rvSemuaDestinasi.setAdapter(listPlayerAdapter);
    }




}