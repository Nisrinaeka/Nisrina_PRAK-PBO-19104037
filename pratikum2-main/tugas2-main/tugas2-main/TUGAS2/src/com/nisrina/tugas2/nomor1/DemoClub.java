package com.nisrina.tugas2.nomor1;

public class DemoClub {
    public static void main(String[] args) {

        // Objek Club
        Club club1 = new Club();
        Club club2 = new Club("Timnas");
        Club club3 = new Club("Timnas", " Timnas Football Club adalah sebuah klub sepak bola yang berasal dari Liga Indonesia");
        Club club4 = new Club("Timnas", 1930, " Soeratin Sosrosoegondo);
        Club club5 = new Club(timnas", 1930, " Soeratin Sosrosoegondo", 13, " Football Club adalah sebuah klub sepak bola yang berasal dari Liga Indonesia");

        // Memanggil Method dari class Club
        club1.getTeam();
        System.out.println();
        club2.getTeam();
        System.out.println();
        club3.getTeam();
        System.out.println();
        club4.getTeam();
        System.out.println();
        club5.getTeam();
    }
}
