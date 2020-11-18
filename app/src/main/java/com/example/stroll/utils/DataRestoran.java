package com.example.stroll.utils;

import com.example.stroll.model.Destinasi;

import java.util.ArrayList;

public class DataRestoran {

    private static int[] id = {
            41,
            42,
            43,
            44,
            45
    };

    private static String[] photoRestoran = {
            "https://media-cdn.tripadvisor.com/media/photo-s/12/be/ac/cd/photo1jpg.jpg",
            "https://www.mymagz.net/wp-content/uploads/sites/8/2019/09/Kebon-Ndalem.jpg",
            "https://ik.imagekit.io/tvlk/cul-asset/guys1L+Yyer9kzI3sp-pb0CG1j2bhflZGFUZOoIf1YOBAm37kEUOKR41ieUZm7ZJ/tvlk-prod-cul-assets/culinary/asset/REST_IMG-982x720-FIT_AND_TRIM-077248575e971591cc2be96c830195c1.jpeg?tr=q-40,c-at_max,w-1080,h-1920&_src=imagekit",
            "https://www.dakatour.com/wp-content/uploads/2019/12/daftar-harga-menu-cafe-brick-jogja.jpg",
            "https://golfplusonemedia.com/wp-content/uploads/2019/10/abaya.jpg"
    };

    private static String[] namaRestoran = {
            "Silol",
            "Kebon Ndalem",
            "Lotek & Gado-Gado Bu Bagyo Colombo",
            "Cafe Brick",
            "Abhayagiri"
    };

    private static String[] deskripsiRestoran = {
            "Sebuah tempat nongkrong seru di tengah kota Yogyakarta",
            "Kebon Ndalem Coffee & Eatery merupakan tempat untuk melihat dan menikmati pemandangan Tugu Yogya secara dekat",
            "Merupakan salah satu penjual lotek yang sudah sangat melegenda sejak 1980-an",
            "Cafe Brick adalah cafe dengan konsep bangunan Pedestrian Cafe dengan interior British Vintage",
            "Abhayagiri Restaurant adalah salah satu restoran di Jogja yang tidak hanya menyuguhkan hidangan lezat tetapi pemandangan yang sangat memukau juga"
    };

    private static String[] alamatRestoran = {
            "Jalan Suroto no. 7 Kotabaru, Gondokusuman, Yogyakarta",
            "Jl. Pangeran Diponegoro No.2, Gowongan, Kec. Jetis, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55233",
            "Jl. Prof. Herman Yohanes No.1, Terban, Kec. Gondokusuman, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55223",
            "Jl. Damai No.8, Tambakan, Sinduharjo, Kec. Ngaglik, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55581",
            "Heritage Resort, RT.02/RW.01, Sumberwatu, Sambirejo, Kec. Prambanan, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55571"
    };




    public static ArrayList<Destinasi> getListDataRestoran() {
        ArrayList<Destinasi> list = new ArrayList<>();
        for (int position = 0; position< namaRestoran.length; position++){
            Destinasi destinasi = new Destinasi();
            destinasi.setId(id[position]);
            destinasi.setDeskripsiDestinasi(deskripsiRestoran[position]);
            destinasi.setNamaDestinasi(namaRestoran[position]);
            destinasi.setAlamatDestinasi(alamatRestoran[position]);
            destinasi.setPhotoDestinasi(photoRestoran[position]);
            list.add(destinasi);
        }
        return list;
    }
}
