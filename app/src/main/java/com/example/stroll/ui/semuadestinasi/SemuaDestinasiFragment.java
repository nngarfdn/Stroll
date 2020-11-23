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


import com.example.stroll.R;
import com.example.stroll.model.Kategori;
import com.example.stroll.ui.favorite.FavoriteActivity;
import com.example.stroll.utils.DataKategori;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;


public class SemuaDestinasiFragment extends Fragment {

    RecyclerView rvKategori;
    FloatingActionButton fab;
    private ArrayList<Kategori> list = new ArrayList<>();

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

        fab.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), FavoriteActivity.class);
            startActivity(intent);
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=  inflater.inflate(R.layout.fragment_semua_destinasi, container, false);

        rvKategori = view.findViewById(R.id.rvKategori);
        showRecyclerList();
        return view;

    }

    private void showRecyclerList() {
        list.addAll(DataKategori.getListData());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL, false);
        rvKategori.setNestedScrollingEnabled(true);
        rvKategori.setLayoutManager(layoutManager);
        KategoriAdapter listPlayerAdapter = new KategoriAdapter();
        listPlayerAdapter.setCourses(list);
        rvKategori.setAdapter(listPlayerAdapter);
    }





}