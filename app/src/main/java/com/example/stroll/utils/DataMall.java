package com.example.stroll.utils;

import com.example.stroll.model.Destinasi;

import java.util.ArrayList;

public class DataMall {

    private static int[] id = {
            61,
            62,
            63,
            64,
            65
    };

    private static String[] photoMall = {
            "https://lh5.googleusercontent.com/_NRz4H9l73hQ/TYuXtlwfB2I/AAAAAAAAFJ0/msPObx4n4-A/s900/IMG_2448.JPG",
            "https://jejakpiknik.com/wp-content/uploads/2018/10/mall-di-jogja.jpg",
            "https://eci.id/documents/store/Jogja%20City%20Mall/best/Jogja%20City%20Mall1.jpg",
            "https://cdn-2.tstatic.net/jogja/foto/bank/images/hartono-mall-yogyakarta.jpg",
            "https://www.jogjasuper.co.id/wp-content/uploads/2018/02/lippo-plaza-jogja.jpg"
    };

    private static String[] namaMall = {
            "Mal Malioboro",
            "Plaza Ambarrukmo",
            "Jogja City Mall",
            "Hartono Mall Yogyakarta",
            "Lippo Plaza Jogja"
    };

    private static String[] deskripsiMall = {
            "Mal Malioboro adalah sebuah mal yang terletak di pusat kota Yogyakarta",
            "Plaza Ambarrukmo adalah pusat perbelanjaan keluarga di Yogyakarta dengan perpaduan konsep arsitektur Jawa klasik dan desain interior modern yang mewah",
            "Jogja City Mall atau biasa disingkat JCM merupakan sebuah pusat perbelanjaan yang berada dalam satu kawasan dengan The Sahid Rich Hotel Yogyakarta dengan arsitektur Romawi",
            "Hartono Mall merupakan salah satu pusat perbelanjaan terbaru di Yogyakarta yang digadang-gadang sebagai terbesar di Yogyakarta dan Jawa Tengah",
            "Lippo Plaza Jogja merupakan sebuah plaza yang dibangun di bekas lahan Mall Saphir Square, yang berada di wilayah Demangan"
    };

    private static String[] alamatMall = {
            "Jl. Malioboro No.52-58, Suryatmajan, Kec. Danurejan, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55213",
            "Jl. Laksda Adisucipto No.3, Ambarukmo, Caturtunggal, Kec. Depok, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55281",
            "Jl. Magelang Km. 06 No.18 Sinduadi, Sleman Yogyakarta",
            "Jl. Ring Road Utara, Kaliwaru, Condongcatur, Kec. Depok, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55281",
            "Jl. Laksda Adisucipto No.32-34, Demangan, Kec. Gondokusuman, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55221"
    };




    public static ArrayList<Destinasi> getListDataMall() {
        ArrayList<Destinasi> list = new ArrayList<>();
        for (int position = 0; position< namaMall.length; position++){
            Destinasi destinasi = new Destinasi();
            destinasi.setId(id[position]);
            destinasi.setDeskripsiDestinasi(deskripsiMall[position]);
            destinasi.setNamaDestinasi(namaMall[position]);
            destinasi.setAlamatDestinasi(alamatMall[position]);
            destinasi.setPhotoDestinasi(photoMall[position]);
            list.add(destinasi);
        }
        return list;
    }
}
