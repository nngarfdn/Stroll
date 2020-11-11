package com.example.stroll.model;

public class Destinasi {

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
