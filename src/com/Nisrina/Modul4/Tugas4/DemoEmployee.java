package com.Nisrina.Modul4.Tugas4;

import java.util.Random;

public class DemoEmployee {
    public static void main(String[] args) {
        Employee[] employee = {
                //Pemanggil Class dalam Method Array
                new Commision(
                        "Mang Oleh",
                        "1512515",
                        200000,
                        40000,
                        4,
                        (float) 0
                ),
                //Pemanggil Class dalam Method Array
                new Salaired(
                        "Munaroh",
                        "1912333",
                        300000,
                        50000,
                        4,
                        4
                ),
                //Pemanggil Class dalam Method Array
                new ProjectPlanner(
                        "Subekti",
                        "12444244",
                        400000,
                        40000,
                        3,
                        5
                )
        };

        //random index
        Random pilihan = new Random();
        Employee karyawan = employee[pilihan.nextInt(employee.length)];

        // Get gaji
        System.out.println("Semua gaji karyawan");
        karyawan.getGaji();
    }
}
