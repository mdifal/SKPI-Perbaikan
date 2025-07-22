package com.skpi2;

public class Student {
    private int id_siswa;
    private String nama;
    private String email;

    public Student(String nama, String email) {
        this.nama = nama;
        this.email = email;
    }

    public int getIdSiswa() {
        return id_siswa;
    }

    public String getNama() {
        return nama;
    }

    public String getemail() {
        return email;
    }

    @Override
    public String toString() {
        return email + " - " + nama;
    }
}
