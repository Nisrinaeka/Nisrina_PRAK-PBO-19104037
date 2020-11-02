package com.Nisrina.Modul4.Tugas4.pratikum.Abtract;

public class Kucing extends Binatang {
    private String nama;

    public Kucing( String nama) {
        super("Kucing");
        this.nama = nama;
    }
    @Override
    protected void suara() {
        System.out.println("mengeong");
    }
    @Override
    public String toString(){
        return super.toString() + " " + nama;
    }
}
