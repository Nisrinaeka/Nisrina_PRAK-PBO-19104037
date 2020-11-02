package com.nisrina.tugas2.nomor3;

// Class Mahasiswa
public class Mahasiswa {
    // Inisiasi variabel (nama, status, semester)
    public String nama = "Nisrina eka salsabila"  ;
    public String status = "jomblo";
    public int semester = 3;

    // Method getStatus
    public void getStatus(){
        System.out.println("Nama\t\t\t: " + nama);
        System.out.println("Status\t\t\t: " + status );
        System.out.println("Semester\t\t: " + semester);
    }
}