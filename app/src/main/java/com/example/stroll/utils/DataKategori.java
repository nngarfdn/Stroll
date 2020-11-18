package com.example.stroll.utils;

import com.example.stroll.model.Kategori;

import java.util.ArrayList;

public class DataKategori {

    private static String[] kategoriName = {
            "Pantai",
            "Museum",
            "Candi",
            "Internet Cafe",
            "Restoran",
            "Kolam Renang",
            "Mall",
            "Bioskop",
            "Publik Places"
    };

    private static int[] id = {
            0,
            1,
            2,
            3,
            4,
            5,
            6,
            7,
            8,
    };

    public static ArrayList<Kategori> getListData() {
        ArrayList<Kategori> list = new ArrayList<>();
        for (int position = 0; position< kategoriName.length; position++){
            Kategori aktivitas = new Kategori();
            aktivitas.setId(id[position]);
            aktivitas.setNamaKategori(kategoriName[position]);
            list.add(aktivitas);
        }
        return list;
    }


}
