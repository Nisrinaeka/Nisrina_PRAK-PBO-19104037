package com.Nisrina.Modul4.Tugas4;


public class Commision extends Employee {

    //Method
    public Commision(
            String nama,
            String nip,
            float upah,
            float komisi,
            float total_penjualan,
            float total_proyek

    ) {
        //constructor
        super(
                nama,
                nip,
                upah,
                komisi,
                total_penjualan,
                total_proyek
        );
    }
    //Override Methods
    @Override
    public void getGaji() {
        float gaji = this.upah + (this.komisi * this.total_penjualan);
        System.out.println("Total gaji " + this.nama + " adalah " + gaji);
    }
}

