package com.example.stroll.utils;

import com.example.stroll.model.Destinasi;

import java.util.ArrayList;

public class DataKolamRenang {

    private static final int[] id = {
            51,
            52,
            53,
            54,
            55
    };

    private static final String[] photoKolamRenang = {
            "https://eksotisjogja.com/wp-content/uploads/2016/09/Kolam-Renang-UNY.jpg",
            "https://ik.imagekit.io/tvlk/apr-asset/guys1L+Yyer9kzI3sp-pb0CG1j2bhflZGFUZOoIf1YOBAm37kEUOKR41ieUZm7ZJ/traveloka/hotel/asset/10043222-2d486834eec1feace11e47467cbd5ea4.jpeg?tr=q-40,c-at_max,w-740,h-500&_src=imagekit",
            "https://tempatwisataseru.com/wp-content/uploads/2019/10/Tirta-Tamansari-Bantul-via-baligolivecom.jpg",
            "https://1.bp.blogspot.com/-uJJWKciBoFE/XlYN55J1_uI/AAAAAAAADl0/L3AWsBjN8EwkUFG3XyUEQSb0Q8L-XJRMgCLcBGAsYHQ/s640/Kolam%2BRenang%2BUmbang%2BTirto.JPG",
            "https://www.nativeindonesia.com/wp-content/uploads/2018/11/Jogja-Bay-Sky-View.jpg"
    };

    private static final String[] namaKolamRenang = {
            "Kolam Renang FIK UNY",
            "Kolam Renang Hotel Matahari",
            "Tirta Tamansari",
            "Umbang Tirto",
            "Jogja Bay"
    };

    private static final String[] deskripsiKolamRenang = {
            "Kolam renang FIK UNY merupakan kolam renang yang dimiliki oleh UNY, namun masyarakat umum pun bisa berenang di tempat ini",
            "Hotel Matahari menawarkan kolam renang luar ruangan yang sangat besar dan restoran di sampingnya",
            "Taman Wisata Tirta Tamansari (Waterbyur Bantul) adalah sebuah komplek kolam renang yang kawasannya lumayan luas mencapai 1.5 Ha",
            "Kolam renang outdoor ini merupakan tempat pelatihan renang untuk anak anak dan orang dewasa serta juga bisa sebagai tempat rekreasi keluarga",
            "Jogja Bay adalah salah satu taman wisata air atau waterpark terbesar di Asia Tenggara yang berlokasi di Yogyakarta"
    };

    private static final String[] alamatKolamRenang = {
            "Jl. Kuningan No.1, Karang Malang, Caturtunggal, Kec. Depok, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55281",
            "Jl. Parangtritis No.123, Brontokusuman, Kec. Mergangsan, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55153",
            "Jl. Pramuka No.30, Area Sawah, Trirenggo, Kec. Bantul, Bantul, Daerah Istimewa Yogyakarta 55714",
            "Jl. Yos Sudarso No.2, Kotabaru, Gondokusuman, Yogyakarta City, Special Region of Yogyakarta 55224",
            "Jl. Utara Stadion, Jenengan, Maguwoharjo, Kec. Depok, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55281"
    };




    public static ArrayList<Destinasi> getListDataKolamRenang() {
        ArrayList<Destinasi> list = new ArrayList<>();
        for (int position = 0; position< namaKolamRenang.length; position++){
            Destinasi destinasi = new Destinasi();
            destinasi.setId(id[position]);
            destinasi.setDeskripsiDestinasi(deskripsiKolamRenang[position]);
            destinasi.setNamaDestinasi(namaKolamRenang[position]);
            destinasi.setAlamatDestinasi(alamatKolamRenang[position]);
            destinasi.setPhotoDestinasi(photoKolamRenang[position]);
            list.add(destinasi);
        }
        return list;
    }
}
