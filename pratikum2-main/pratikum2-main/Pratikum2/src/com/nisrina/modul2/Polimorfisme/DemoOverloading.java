package com.nisrina.modul2.Polimorfisme;

public class DemoOverloading {
    public static void main(String[] args) {
        Lagu lagu1 = new Lagu("Perfect","Ed Sheeran");
        Lagu lagu2 = new Lagu("loro pikir","syahiba saufa");

        lagu1.getDataLagu();
        lagu2.getDataLagu();
    }
}