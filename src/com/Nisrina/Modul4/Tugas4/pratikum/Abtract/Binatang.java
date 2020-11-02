package com.Nisrina.Modul4.Tugas4.pratikum.Abtract;

public abstract class Binatang {
    private String jenis;

    public Binatang(String jenis) {
        this.jenis = jenis;
    }

    //Method abstract
    protected  abstract  void  suara();

    @Override
    public String toString() {
        return "Seekor" + jenis ;
    }
}
