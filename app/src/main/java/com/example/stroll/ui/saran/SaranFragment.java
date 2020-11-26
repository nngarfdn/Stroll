package com.example.stroll.ui.saran;

import android.content.Intent;
import android.os.Bundle;
import java.util.Collections;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.stroll.R;
import com.example.stroll.model.Destinasi;
import com.example.stroll.ui.favorite.FavoriteActivity;
import com.example.stroll.ui.home.HomeActivity;
import com.example.stroll.ui.semuadestinasi.DestinasiAdapter;
import com.example.stroll.ui.semuadestinasi.SemuaDestinasiFragment;
import com.example.stroll.utils.DataBioskop;
import com.example.stroll.utils.DataCandi;
import com.example.stroll.utils.DataInternetCafe;
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
import java.util.Collection;

public class SaranFragment extends Fragment {
    FloatingActionButton fab;
    RecyclerView rvSemuaDestinasi;
    private ArrayList<Destinasi> list = new ArrayList<>();

    public SaranFragment() {
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
        rvSemuaDestinasi = view.findViewById(R.id.rvSemuaDestinasi);
        list.clear();
        list.addAll(DataPantai.getListDataPantai());
        showRecyclerList();

        fab = view.findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), FavoriteActivity.class);
            startActivity(intent);
        });


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=  inflater.inflate(R.layout.fragment_saran, container, false);
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