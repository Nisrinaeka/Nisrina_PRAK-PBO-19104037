package com.nisrina.tugas2.nomor2;

// Class Burung yang mewarisi Class Binatang
public class Burung extends Binatang {

    // Inisiasi variabel
    public String nama;
    public String terbang;
    public ava.lang.String makan;

    // Method getName untuk mencetak nama binatangnya
    public void getNama(){
        System.out.println("Nama Binatang\t: " + nama);
    }
    // Method terbang untuk mencetak aktivitas hewan burung
    public void terbang(){
        System.out.println("Aktivitas\t\t: " + terbang);
    }
}
// Class DemoBinatang
public class DemoBinatang {
    public static void main(String[] args) {

        // Objek Burung
        Burung burung = new Burung();
        burung.nama = "Burung Merpatih";
        burung.makan = "jagung";
        burung.tidur = "Burung MERPATIH tidur pada malam hari";
        burung.terbang = "Burung merpatihTerbang Menggunakan Sayap";

        // Memanggil Method Burung
        System.out.println("\t\t\t*** BURUNG ***");
        burung.getNama();
        burung.binatang();
        burung.terbang();

        System.out.println();

        // Objek Ikan
        Ikan ikan = new Ikan();
        ikan.nama = "Ikan Mujair";
        ikan.makan = "Ikan Mujair Makan lumut";
        ikan.tidur = "Ikan mujair Tidur Pada Malam Hari";
        ikan.berenang = "Ikan mujair Berenang Menggunakan Sirip";

        System.out.println();

        // Memanggil Method IKAN
        System.out.println("\t\t\t*** IKAN ***");
        ikan.getNama();
        ikan.binatang();
        ikan.berenang();

        System.out.println();

        // Objek Kucing
        Kucing kucing = new Kucing();
        kucing.nama = "Kucing Anggora";
        kucing.makan = "Kucing Anggora Makanan Whiskas";
        kucing.tidur = "Kucing Anggora Pada Malam Hari";
        kucing.meong = "Kucing Anggora Meong Saat Lapar";

        // Memanggil Method Kucing
        System.out.println("\t\t\t*** KUCING ***");
        kucing.getNama();
        kucing.binatang();
        kucing.meong();
    }
} 