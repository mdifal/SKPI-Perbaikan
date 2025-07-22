package com.skpi2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Simpan daftar Student dan Course di runtime
        List<Student> daftarStudent = new ArrayList<>();
        List<Course> daftarCourse = new ArrayList<>();
        List<Enrollment> daftarEnrollment = new ArrayList<>();

        // Tambah Student
        Student m1 = new Student("Raka", "raka@gmail.com");
        Student m2 = new Student("Dina", "dina@gmail.com");
        daftarStudent.add(m1);
        daftarStudent.add(m2);

        // Tambah Course
        Course cs1 = new Course(1, "Java", "Thomas Alfa");
        Course cs2 = new Course(2, "Python", "Rinaldi Munir");
        Course cs3 = new Course(3, "DB_Clustering", "Siti Nurhaliza");
        daftarCourse.add(cs1);
        daftarCourse.add(cs2);
        daftarCourse.add(cs3);

        // Buat Enrollment
        Enrollment Enrollment1 = new Enrollment(m1);
        Enrollment1.tambahCourse(cs1);
        Enrollment1.tambahCourse(cs2);
        // ini buat test assign ke course yang sama
        //Enrollment1.tambahCourse(cs2);

        Enrollment Enrollment2 = new Enrollment(m2);
        Enrollment2.tambahCourse(cs2);
        Enrollment2.tambahCourse(cs3);

        daftarEnrollment.add(Enrollment1);
        daftarEnrollment.add(Enrollment2);

        // Tampilkan semua Enrollment
        for (Enrollment Enrollment : daftarEnrollment) {
            Enrollment.tampilkanEnrollment();
        }
    }
}
