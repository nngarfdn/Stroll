package com.example.stroll.utils;

import com.example.stroll.model.Destinasi;

import java.util.ArrayList;

public class DataInternetCafe {

    private static int[] id = {
            31,
            32,
            33,
            34,
            35
    };

    private static String[] photoInternetCafe = {
            "https://cdn-2.tstatic.net/jogja/foto/bank/images/superhotspot-net-city-internet-learning-cafe_20180117_205405.jpg",
            "https://xplorejogjayuk.files.wordpress.com/2018/09/luxury-jogja.jpg",
            "https://www.sobatjogja.com/wp-content/uploads/2015/05/JagoNet-Jogja-Internet-Center-Warnet-di-Jogja-Yang-Istimewa.jpg",
            "https://2.bp.blogspot.com/-_cqN50516A8/WQTbY-Zl7LI/AAAAAAAAOI0/t5FN1UushNA-nYPQtPDQTEd83-BPVHzdgCLcB/s1600/P_20170429_153831.jpg",
            "https://gamebrott.com/wp-content/uploads/2019/10/46065158_553787905095438_556053404042606532_n.jpg"
    };

    private static String[] namaInternetCafe = {
            "NetCity",
            "Luxury",
            "Jago Net",
            "Merapi Online",
            "Skyland"
    };

    private static String[] deskripsiInternetCafe = {
            "Netcity adalah warnet terbesar di Yogyakarta",
            "Cafe 24 jam ini adalah perpaduan antara cafe dengan warnet",
            "Jago Net merupakan salah satu dari beberapa warnet yang mengusung model bisnis warnet eksklusif",
            "Internet cafe yang masih eksis dan menjadi tempat idola kalangan muda di Jogja",
            "Warnet gaming yang memiliki PC dengan spesifikasi High-End"
    };

    private static String[] alamatInternetCafe = {
            "Jl. Ipda Tut Harsono, Muja Muju, Kec. Umbulharjo, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55165",
            "Caturtunggal, Kecamatan Depok, Karang Wuni, Caturtunggal, Kec. Depok, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55284",
            "Jl. Ngapak - Kentheng No.16, Kwarasan, Nogotirto, Kec. Gamping, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55592",
            "Jl. Laksda Adisucipto No.26, Ambarukmo, Caturtunggal, Kec. Depok, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55281",
            "Bhayangkara no No.66, Ngupasan, Gondomanan, Yogyakarta City, Special Region of Yogyakarta 55261"
    };




    public static ArrayList<Destinasi> getListDataInternetCafe() {
        ArrayList<Destinasi> list = new ArrayList<>();
        for (int position = 0; position< namaInternetCafe.length; position++){
            Destinasi destinasi = new Destinasi();
            destinasi.setId(id[position]);
            destinasi.setDeskripsiDestinasi(deskripsiInternetCafe[position]);
            destinasi.setNamaDestinasi(namaInternetCafe[position]);
            destinasi.setAlamatDestinasi(alamatInternetCafe[position]);
            destinasi.setPhotoDestinasi(photoInternetCafe[position]);
            list.add(destinasi);
        }
        return list;
    }
}
