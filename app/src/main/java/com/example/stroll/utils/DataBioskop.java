package com.example.stroll.utils;

import com.example.stroll.model.Destinasi;

import java.util.ArrayList;

public class DataBioskop {

    private static int[] id = {
            71,
            72,
            73,
            74,
            75
    };

    private static String[] photoBioskop = {
            "https://i2.wp.com/borobudurnews.com/wp-content/uploads/2020/10/Bioskopo-Empire-XXI-Jogja.jpg?fit=1028%2C573&ssl=1",
            "https://media.21cineplex.com/webcontent/gallery/pictures/154415151272453_1024x683.jpg",
            "https://promositoday.com/wp-content/uploads/2019/05/cgv-jwalk-mall.jpg",
            "https://www.jogjasuper.co.id/wp-content/uploads/2018/02/Jadwal-dan-Tiket-Bioskop-Ambarukmo-XXI.jpg",
            "https://jadwaldansinopsisfilm.files.wordpress.com/2019/02/1959936825p.jpg?w=675"
    };

    private static String[] namaBioskop = {
            "Empire XXI",
            "Sleman City Hall XXI",
            "CGV J-Walk Mall",
            "Ambarrukmo XXI",
            "CGV Hartono Mall"
    };

    private static String[] deskripsiBioskop = {
            "Empire XXI merupakan salah satu bioskop berjaringan yang ada di Indonesia",
            "Bioskop Theater XXI terbaru di Yogyakarta yang terletak di dalam Sleman City Hall",
            "Bioskop Theater yang terletak di dalam J-Walk Mall",
            "Bioskop Theater yang terletak di dalam Plaza Ambarrukmo",
            "Bioskop Theater yang terletak di dalam Hartono Mall"
    };

    private static String[] alamatBioskop = {
            "Jl. Urip Sumoharjo No.104, Klitren, Kec. Gondokusuman, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55221",
            "Jl. Gito Gati, Denggung, Tridadi, Kec. Sleman, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55511",
            "J-Walk Mall, Jl. Babarsari No.2, Janti, Caturtunggal, Kec. Depok, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55281",
            "Plaza Ambarrukmo Lantai 3, Jl. Laksda Adisucipto No.KM 6.5, Ambarukmo, Caturtunggal, Kec. Depok, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55281",
            "Hartono Mall, Jl. Ring Road Utara Jl. Kaliwaru, Kaliwaru, Condongcatur, Depok Sub-District, Sleman Regency, Special Region of Yogyakarta 55283"
    };




    public static ArrayList<Destinasi> getListDataBioskop() {
        ArrayList<Destinasi> list = new ArrayList<>();
        for (int position = 0; position< namaBioskop.length; position++){
            Destinasi destinasi = new Destinasi();
            destinasi.setId(id[position]);
            destinasi.setDeskripsiDestinasi(deskripsiBioskop[position]);
            destinasi.setNamaDestinasi(namaBioskop[position]);
            destinasi.setAlamatDestinasi(alamatBioskop[position]);
            destinasi.setPhotoDestinasi(photoBioskop[position]);
            list.add(destinasi);
        }
        return list;
    }
}
