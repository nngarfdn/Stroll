package com.example.stroll.utils;

import com.example.stroll.model.Destinasi;

import java.util.ArrayList;

public class DataCandi {

    private static int[] id = {
            21,
            22,
            23,
            24,
            25
    };

    private static String[] photoCandi = {
            "https://gotripina.com/wp-content/uploads/2019/01/Keraton-Ratu-Boko-sumber-ig-@al.pirmanpasundan.jpg",
            "https://www.propertyinside.id/wp-content/uploads/2018/03/prambanan-property-inside.jpg",
            "https://piknikasik.com/wp-content/uploads/2018/08/sunset-candi-ijo-jogja.jpg",
            "https://www.kartanesia.com/wp-content/uploads/2019/04/Candi-Simbasari-Yogyakarta.jpg",
            "https://www.alodiatour.com/wp-content/uploads/2018/12/Fasilitas-Candi-Gebang.jpg"
    };

    private static String[] namaCandi = {
            "Situs Ratu Boko",
            "Candi Prambanan",
            "Candi Ijo",
            "Candi Sambisari",
            "Candi Gebang"
    };

    private static String[] deskripsiCandi = {
            "Situs Ratu Boko merupakan jenis candi dengan corak hindu dan memiliki letak yang tidak jauh dengan candi candi Hindu lainnya",
            "Candi Prambanan adalah kompleks candi Hindu terbesar di Indonesia yang dibangun pada abad ke-9 masehi",
            "Candi Ijo adalah candi yang letaknya paling tinggi di Yogyakarta yang menyuguhkan pesona alam dan budaya serta pesawat yang tengah landing",
            "Candi Sambisari merupakan candi yang berada di kedalaman 6,5 meter dari atas permukaan tanah setempat",
            "Candi Gebang adalah salah satu candi yang tersebar di lereng Gunung Merapi"
    };

    private static String[] alamatCandi = {
            "Jl. Raya Piyungan - Prambanan No.KM.2, Gatak, Bokoharjo, Kec. Prambanan, Kabupaten Sleman, Daerah Istimewa Yogyakarta",
            "Jl. Raya Solo – Yogyakarta No.16, Kranggan, Bokoharjo, Prambanan, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55571",
            "Bukit Ijo, Desa Sambirejo, Prambanan, Sleman, Yogyakarta",
            "Jl. Candi Sambisari, Sambisari, Purwomartani, Kec. Kalasan, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55571",
            "Dusun Gebang, Kelurahan Widomartani, Kecamatan Ngemplak, Kabupaten Sleman, Daerah Istimewa Yogyakarta"
    };




    public static ArrayList<Destinasi> getListDataCandi() {
        ArrayList<Destinasi> list = new ArrayList<>();
        for (int position = 0; position< namaCandi.length; position++){
            Destinasi destinasi = new Destinasi();
            destinasi.setId(id[position]);
            destinasi.setDeskripsiDestinasi(deskripsiCandi[position]);
            destinasi.setNamaDestinasi(namaCandi[position]);
            destinasi.setAlamatDestinasi(alamatCandi[position]);
            destinasi.setPhotoDestinasi(photoCandi[position]);
            list.add(destinasi);
        }
        return list;
    }
}
