package com.example.stroll.utils;

import com.example.stroll.model.Destinasi;

import java.util.ArrayList;

public class DataPublicPlaces {

    private static final int[] id = {
            81,
            82,
            83,
            84,
            85
    };

    private static final String[] photoPublicPlaces = {
            "https://tempatwisataindonesia.id/wp-content/uploads/2017/02/Taman-Sari-Jogja.jpg",
            "https://www.alodiatour.com/wp-content/uploads/2018/11/lokasi-taman.jpg",
            "https://antarejatour.com/wp-content/uploads/2019/07/Nol-Km-Jogja-sumber-ig-amoebarentalkamerajogja.jpg",
            "https://i2.wp.com/aliftourjogja.com/wp-content/uploads/2020/03/keraton-jogja-1.jpg?fit=700%2C500&ssl=1",
            "https://static.limakaki.com/2018/10/Alun-alun-Kidul-Yogyakarta.jpg"
    };

    private static final String[] namaPublicPlaces = {
            "Taman Sari",
            "Taman Pintar",
            "Titik 0 KM",
            "Keraton Ngayogyakarta Hadiningrat",
            "Alun-Alun Selatan"
    };

    private static final String[] deskripsiPublicPlaces = {
            "Taman Sari adalah situs bekas taman atau kebun istana Keraton Ngayogyakarta Hadiningrat",
            "Taman Pintar Yogyakarta (TPY ) adalah salah satu wisata pendidikan atau wisata edukasi paling banyak di kunjungi di Yogyakarta",
            "Titik nol kilometer Yogyakarta merupakan kawasan di pusat kota yang kerap dikunjungi wisatawan lantaran lokasinya dekat dengan beberapa tempat wisata",
            "Karaton Ngayogyakarta Hadiningrat merupakan istana resmi Kesultanan Ngayogyakarta Hadiningrat",
            "Alun-alun Selatan atau yang sekarang lebih dikenal sebagai Alun-alun Kidul (Alkid) yaitu alun-alun yang terletak di sebelah selatan karaton Yogyakarta"
    };

    private static final String[] alamatPublicPlaces = {
            "Patehan, Kraton, Yogyakarta City, Special Region of Yogyakarta 55133",
            "Jl. Panembahan Senopati No.1-3, Ngupasan, Kec. Gondomanan, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55122",
            "Jl. Pangurakan No.1, Ngupasan, Kec. Gondomanan, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55122",
            "Jl. Rotowijayan Blok No. 1, Panembahan, Kecamatan Kraton, Kota Yogyakarta, Daerah Istimewa Yogyakarta",
            "Jl. Alun-Alun Kidul, Patehan,Kraton,Yogyakarta,DI Yogyakarta,Indonesia,55133"
    };


    public static ArrayList<Destinasi> getListDataPublicPlaces() {
        ArrayList<Destinasi> list = new ArrayList<>();
        for (int position = 0; position< namaPublicPlaces.length; position++){
            Destinasi destinasi = new Destinasi();
            destinasi.setId(id[position]);
            destinasi.setDeskripsiDestinasi(deskripsiPublicPlaces[position]);
            destinasi.setNamaDestinasi(namaPublicPlaces[position]);
            destinasi.setAlamatDestinasi(alamatPublicPlaces[position]);
            destinasi.setPhotoDestinasi(photoPublicPlaces[position]);
            list.add(destinasi);
        }
        return list;
    }
}
