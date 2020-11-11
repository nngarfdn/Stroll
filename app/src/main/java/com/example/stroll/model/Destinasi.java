package com.example.stroll.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Destinasi implements Parcelable {

    private int id;
    private String namaDestinasi;
    private String deskripsiDestinasi;
    private String alamatDestinasi;
    private String photoDestinasi;

    public Destinasi() {
    }

    public Destinasi(int id, String namaDestinasi, String deskripsiDestinasi, String alamatDestinasi, String photoDestinasi) {
        this.id = id;
        this.namaDestinasi = namaDestinasi;
        this.deskripsiDestinasi = deskripsiDestinasi;
        this.alamatDestinasi = alamatDestinasi;
        this.photoDestinasi = photoDestinasi;
    }

    protected Destinasi(Parcel in) {
        id = in.readInt();
        namaDestinasi = in.readString();
        deskripsiDestinasi = in.readString();
        alamatDestinasi = in.readString();
        photoDestinasi = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(namaDestinasi);
        dest.writeString(deskripsiDestinasi);
        dest.writeString(alamatDestinasi);
        dest.writeString(photoDestinasi);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Destinasi> CREATOR = new Creator<Destinasi>() {
        @Override
        public Destinasi createFromParcel(Parcel in) {
            return new Destinasi(in);
        }

        @Override
        public Destinasi[] newArray(int size) {
            return new Destinasi[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaDestinasi() {
        return namaDestinasi;
    }

    public void setNamaDestinasi(String namaDestinasi) {
        this.namaDestinasi = namaDestinasi;
    }

    public String getDeskripsiDestinasi() {
        return deskripsiDestinasi;
    }

    public void setDeskripsiDestinasi(String deskripsiDestinasi) {
        this.deskripsiDestinasi = deskripsiDestinasi;
    }

    public String getAlamatDestinasi() {
        return alamatDestinasi;
    }

    public void setAlamatDestinasi(String alamatDestinasi) {
        this.alamatDestinasi = alamatDestinasi;
    }

    public String getPhotoDestinasi() {
        return photoDestinasi;
    }

    public void setPhotoDestinasi(String photoDestinasi) {
        this.photoDestinasi = photoDestinasi;
    }
}
