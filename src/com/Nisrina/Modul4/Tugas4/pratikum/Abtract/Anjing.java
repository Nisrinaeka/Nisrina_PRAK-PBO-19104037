package com.Nisrina.Modul4.Tugas4.pratikum.Abtract;

public class Anjing extends  Binatang{
    private String nama;

    public Anjing(String nama) {
        super("Anjim");
        this.nama = nama;
    }
    @Override
    protected void suara() {
        System.out.println("Mengongong");
    }
    @Override
    public String toString(){
        return super.toString() + " " + nama;
    }
}

