package com.example.stroll.utils;

import com.example.stroll.model.Destinasi;

import java.util.ArrayList;

public class DataMuseum {

    private static int[] id = {
            11,
            12,
            13,
            14,
            15
    };

    private static String[] photoMuseum = {
            "https://myeatandtravelstory.files.wordpress.com/2015/12/dscf8737-800x533.jpg",
            "https://paketwisata.id/wp-content/uploads/2018/10/benteng-vredeburg-yogyakarta.jpg",
            "https://raskitatrans.com/wp-content/uploads/2019/09/Museum-Dirgantara-TNI-AU.jpg",
            "https://www.gudeg.net/cni-content/uploads/modules/direktori/logo/20150811023411.jpg",
            "https://www.alodiatour.com/wp-content/uploads/2018/11/museum-affandi.jpg"
    };

    private static String[] namaMuseum = {
            "Museum Sonobudoyo Yogyakarta",
            "Museum Benteng Vredeburg",
            "Museum Dirgantara Mandala",
            "Museum Sandi",
            "Museum Affandi"
    };

    private static String[] deskripsiMuseum = {
            "Sonobudoyo merupakan museum yang berisi sejarah dan kebudayaan Jawa",
            "Benteng Vredeburg merupakan salah satu museum peninggalan Belanda yang sangat terkenal di Jogja",
            "Dirgantara Mandala adalah museum yang digagas oleh TNI AU untuk mengabadikan peristiwa bersejarah dalam lingkungan TNI AU",
            "Museum Sandi merupakan museum kriptologi satu-satunya di Indonesia",
            "Museum Affandi merupakan sebuah museum yang memiliki berbagai koleksi lukisan dari para maestro seni lukis Indonesia khususnya Affandi"
    };

    private static String[] alamatMuseum = {
            "Jl. Pangurakan No.6, Ngupasan, Gondomanan, Yogyakarta, DI Yogyakarta, Indonesia 55122",
            "Jalan Margo Mulyo No. 6 Yogyakarta 55121",
            "Komplek Pangkalan TNI AU Lanud Adisutjipto, Yogyakarta",
            "Jalan Faridan Muridan Noto 21 Kotabaru, Yogyakarta",
            "Jl. Laksda Adisucipto 167 Yogyakarta 55281"
    };




    public static ArrayList<Destinasi> getListDataMuseum() {
        ArrayList<Destinasi> list = new ArrayList<>();
        for (int position = 0; position< namaMuseum.length; position++){
            Destinasi destinasi = new Destinasi();
            destinasi.setId(id[position]);
            destinasi.setDeskripsiDestinasi(deskripsiMuseum[position]);
            destinasi.setNamaDestinasi(namaMuseum[position]);
            destinasi.setAlamatDestinasi(alamatMuseum[position]);
            destinasi.setPhotoDestinasi(photoMuseum[position]);
            list.add(destinasi);
        }
        return list;
    }
}
