package com.Nisrina.Modul3.Komposisi;

public class Mouse {//method
    private String merk;//tipe data
    private String dpi;

    //Constructor
    public Mouse(String merk, String dpi) {
        this.merk = merk;
        this.dpi = dpi;
    }

    //output
    public void PrintSpec(){
        System.out.println("- Merk\t: " + merk);
        System.out.println("- DPI\t: " + dpi);
        System.out.println();
    }

}

