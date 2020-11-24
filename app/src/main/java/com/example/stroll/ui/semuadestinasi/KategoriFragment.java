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
import android.widget.Toast;
import com.example.stroll.R;
import com.example.stroll.model.Destinasi;
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
    public void onStart() {
        super.onStart();
        list.addAll(DataPantai.getListDataPantai());
        showRecyclerList();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle mBundle = getArguments();
        final String nameDet = mBundle.getString("name");

        rvSemuaDestinasi = view.findViewById(R.id.rvSemuaDestinasi);

        if (nameDet.equals("Pantai")) {
            list.clear();
            list.addAll(DataPantai.getListDataPantai());
            showRecyclerList();
        }
        if (nameDet.equals("Museum")) {
            list.clear();
            list.addAll(DataMuseum.getListDataMuseum());
            showRecyclerList();
        }
        if (nameDet.equals("Candi")) {
            list.clear();
            list.addAll(DataCandi.getListDataCandi());
            showRecyclerList();
        }
        if (nameDet.equals("Internet Cafe")) {
            list.clear();
            list.addAll(DataInternetCafe.getListDataInternetCafe());
            showRecyclerList();
        }
        if (nameDet.equals("Restoran")) {
            list.clear();
            list.addAll(DataRestoran.getListDataRestoran());
            showRecyclerList();
        }
        if (nameDet.equals("Kolam Renang")) {
            list.clear();
            list.addAll(DataKolamRenang.getListDataKolamRenang());
            showRecyclerList();
        }
        if (nameDet.equals("Mall")) {
            list.clear();
            list.addAll(DataMall.getListDataMall());
            showRecyclerList();
        }
        if (nameDet.equals("Bioskop")) {
            list.clear();
            list.addAll(DataBioskop.getListDataBioskop());
            showRecyclerList();
        }
        if (nameDet.equals("Publik Places")) {
            list.clear();
            list.addAll(DataPublicPlaces.getListDataPublicPlaces());
            showRecyclerList();
        }
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