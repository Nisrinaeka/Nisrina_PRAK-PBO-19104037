package com.nisrina.modul2.Polimorfisme;

public class DemoOverriding {
    public static void main (String[] args) {
        x supperclass = new x();
        y subclass = new y();

        supperclass.getValue("mati lampu");
        subclass.getValue("mati listrik");
    }
}
