package com.example.stroll.utils;

import com.example.stroll.model.Destinasi;

import java.util.ArrayList;

public class DataPantai {

    private static int[] id = {
            11,
            12,
            13,
            14
    };

    private static String[] photoPantai = {
            "https://cdn.rentalmobilbali.net/wp-content/uploads/2011/12/Pantai-Pasir-Putih-Di-Bali-1-692x376.jpg",
            "https://asset.kompas.com/crops/ktWS7GA9Ah0iGVq26DEgWIiZwBQ=/158x105:1418x945/750x500/data/photo/2019/09/08/5d75120e0290f.jpeg",
            "https://images.solopos.com/2019/12/pantai-kali-kencana-1200x675.jpg",
           "https://www.itrip.id/wp-content/uploads/2020/04/Wisata-Pantai-Pangandaran.jpg"
    };

    private static String[] namaPantai = {
            "Pantai parangtritis",
            "Pantai Kuwaru",
            "Pantai Baru",
            "Pantai Lama"
    };

    private static String[] deskripsiPantai = {
            "deskripsiPantai Pantai parangtritis",
            "deskripsiPantai Pantai Kuwaru",
            "deskripsiPantai Pantai Baru",
            "deskripsiPantai Pantai Lama"
    };

    private static String[] alamatPantai = {
            "alamat Pantai parangtritis",
            "alamat Pantai Kuwaru",
            "alamat deskripsiPantai Pantai Baru",
            "alamat deskripsiPantai Pantai Lama"
    };




    public static ArrayList<Destinasi> getListDataPantai() {
        ArrayList<Destinasi> list = new ArrayList<>();
        for (int position = 0; position< namaPantai.length; position++){
            Destinasi destinasi = new Destinasi();
            destinasi.setId(id[position]);
            destinasi.setDeskripsiDestinasi(deskripsiPantai[position]);
            destinasi.setNamaDestinasi(namaPantai[position]);
            destinasi.setAlamatDestinasi(alamatPantai[position]);
            destinasi.setPhotoDestinasi(photoPantai[position]);
            list.add(destinasi);
        }
        return list;
    }
}
