package com.example.stroll.utils;

import com.example.stroll.model.Destinasi;

import java.util.ArrayList;

public class DataPantai {

    private static final int[] id = {
            1,
            2,
            3,
            4,
            5
    };

    private static final String[] photoPantai = {
            "https://www.1001malam.com/travel/wp-content/uploads/2016/09/Sumber-zonalibur.jpg",
            "https://www.alodiatour.com/wp-content/uploads/2018/01/wisata-pantai-kuwaru.jpg",
            "https://www.pantainesia.com/wp-content/uploads/2018/03/Pantai-Baru-1248x703.jpg",
            "https://jarwadi.files.wordpress.com/2016/05/tebing-laut-pecislaut-begah-gunungkidul.jpg?w=660",
            "https://piknikasik.com/wp-content/uploads/2016/07/pantai-timang-gunungkidul-jogja1.jpg"
    };

    private static final String[] namaPantai = {
            "Pantai Parangtritis",
            "Pantai Kuwaru",
            "Pantai Baru",
            "Laut Bekah",
            "Pantai Timang"
    };

    private static final String[] deskripsiPantai = {
            "Pantai Parangtritis adalah pantai yang paling populer yang terletak di Desa Parangtritis, Kecamatan Kretek, Kabupaten Bantul Yogyakarta",
            "Pantai Kuwaru merupakan sebuah pantai yang di sekitarnya tumbuh banyak pohon cemara yang cukup rindang",
            "Pantai Baru merupakan salah satu pantai di Jogja yang masih perawan sehingga relatif bersih, nyaman, dan terbebas dari polusi udara",
            "Destinasi alam terpencil di Gunung Kidul yang menyuguhkan laut dan tebing",
            "Pantai Timang Yogyakarta menawarkan aktvitas wisata yang menantang tidak seperti kebanyakan pantai"
    };

    private static final String[] alamatPantai = {
            "Jl. Parangtritis Km. 28 Parangtritis Yogyakarta 55188",
            "Dusun Poncosari, Srandakan, Kab. Bantul, Yogyakarta 55762",
            "Ngentak, Poncosari, Srandakan, Bantul, daerah Istimewa Yogyakarta",
            "Dusun Temon, Desa Giripurwo. Kecamatan Purwosari, Kabupaten Gunungkidul, DI Yogyakarta",
            "Padukuhan Danggolo, Desa Purwodadi, Kecamatan Tepus, Kabupaten Gunung Kidul, Daerah Istimewa Yogyakarta"
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
