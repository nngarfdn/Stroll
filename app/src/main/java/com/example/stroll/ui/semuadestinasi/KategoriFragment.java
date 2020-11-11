package com.example.stroll.ui.semuadestinasi;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.example.stroll.R;
import com.example.stroll.model.Destinasi;
import com.example.stroll.utils.DataPantai;

import java.util.ArrayList;

public class KategoriFragment extends Fragment {

    RecyclerView rvSemuaDestinasi;
    private ArrayList<Destinasi> list = new ArrayList<>();
    public KategoriFragment() {
        // Required empty public constructor
    }

    public static KategoriFragment newInstance(String param1, String param2) {
        KategoriFragment fragment = new KategoriFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kategori, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle mBundle = getArguments();
        final String nameDet = mBundle.getString("name");
        TextView tvTest ;
        tvTest = view.findViewById(R.id.txtTest);
        rvSemuaDestinasi = view.findViewById(R.id.rvSemuaDestinasi);

        tvTest.setText(nameDet);

        if (nameDet.equals("Pantai")) {
            showRecyclerList();
        }else {
            Toast.makeText(getContext(), "Data tidak ada", Toast.LENGTH_SHORT).show();
        }


    }

    private void showRecyclerList() {
        list.addAll(DataPantai.getListDataPantai());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        rvSemuaDestinasi.setNestedScrollingEnabled(true);
        rvSemuaDestinasi.setLayoutManager(layoutManager);
        DestinasiAdapter listPlayerAdapter = new DestinasiAdapter();
        listPlayerAdapter.setCourses(list);
        rvSemuaDestinasi.setAdapter(listPlayerAdapter);
    }

}