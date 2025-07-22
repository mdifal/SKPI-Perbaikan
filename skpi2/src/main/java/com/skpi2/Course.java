package com.skpi2;

public class Course {
    private int id_kursus;
    private String nama_kursus;
    private String nama_pengajar;

    public Course(int id_kursus, String nama_kursus, String nama_pengajar) {
        this.id_kursus = id_kursus;
        this.nama_kursus = nama_kursus;
        this.nama_pengajar = nama_pengajar;
    }

    public int getIdKursus() {
        return id_kursus;
    }

    public String getNamaKursus() {
        return nama_kursus;
    }

    public String getNamaPengajar() {
        return nama_pengajar;
    }

    @Override
    public String toString() {
        return id_kursus + " - " + nama_kursus + " - " + nama_pengajar;
    }


}
