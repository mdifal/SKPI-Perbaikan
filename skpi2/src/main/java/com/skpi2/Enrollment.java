package com.skpi2;

import java.util.ArrayList;
import java.util.List;

public class Enrollment {
    private Student Student;
    private List<Course> daftarCourse;
    private String tanggal_daftar;

    public Enrollment(Student Student) {
        this.Student = Student;
        this.daftarCourse = new ArrayList<>();
        this.tanggal_daftar = java.time.LocalDate.now().toString();
    }

    public void tambahCourse(Course course) {
        
        if (!daftarCourse.contains(course)) {
            daftarCourse.add(course);
            System.out.println("Course ditambahkan.");
        } else {
            System.out.println("Siswa telah daftar Course ini");
        }
    }

    public void tampilkanEnrollment() {
        System.out.println(
                "Siswa " + Student.getNama() + " dengan email " + Student.getemail() + " telah mendaftar pada kursus:");
        for (Course mk : daftarCourse) {
            System.out.println("- " + mk + " (Tanggal Daftar: " + tanggal_daftar + ")");
        }
        System.out.println();
    }

}
