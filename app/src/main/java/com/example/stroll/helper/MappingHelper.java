package com.example.stroll.helper;

import android.database.Cursor;

import com.example.stroll.model.Destinasi;
import java.util.ArrayList;
public class MappingHelper {

    static String TITLE = "title";
    static String DESCRIPTION = "description";
    static String ADDRESS = "address";
    static String PHOTO = "photo";
    static String ID = "id";

    public static ArrayList<Destinasi> mapCursorToArrayList(Cursor notesCursor) {
        ArrayList<Destinasi> notesList = new ArrayList<>();

        while (notesCursor.moveToNext()) {
            int id = notesCursor.getInt(notesCursor.getColumnIndexOrThrow(ID));
            String title = notesCursor.getString(notesCursor.getColumnIndexOrThrow(TITLE));
            String description = notesCursor.getString(notesCursor.getColumnIndexOrThrow(DESCRIPTION));
            String address = notesCursor.getString(notesCursor.getColumnIndexOrThrow(ADDRESS));
            String photo = notesCursor.getString(notesCursor.getColumnIndexOrThrow(PHOTO));
            notesList.add(new Destinasi(id, title, description, address, photo));
        }

        return notesList;
    }
}
