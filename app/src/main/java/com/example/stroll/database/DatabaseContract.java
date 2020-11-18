package com.example.stroll.database;

import android.provider.BaseColumns;

public class DatabaseContract {

    static String TABLE_NAME = "destinasi";
    static final class DestinasiColumns implements BaseColumns {
        static String ID = "id";
        static String TITLE = "title";
        static String DESCRIPTION = "description";
        static String ADDRESS = "address";
        static String PHOTO = "photo";
    }

}
