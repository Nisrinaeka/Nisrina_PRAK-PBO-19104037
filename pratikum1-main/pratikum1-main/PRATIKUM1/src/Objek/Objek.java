package Objek;

public class Objek {
    public static void main(String[] args) {

        //deklarasi object tanpa parameter
        Mahasiswa mahasiswaTanpa = new Mahasiswa();

        mahasiswaTanpa.setNama("Reva");
        mahasiswaTanpa.setNim(19104076);

        System.out.println("Mahasiswa 1 ");
        System.out.println("Nama\t: " + mahasiswaTanpa.getNama());
        System.out.println("Nim\t\t: " + mahasiswaTanpa.getNim());

        // Deklarasi object dengan 1 parameter
        Mahasiswa mahasiswa1Param = new Mahasiswa("Lisa");


        //Deklarasi objek dengan parameter
        Mahasiswa mahasiswa = new Mahasiswa( "Paimon",19104048);

        System.out.println("Mahasiswa 2 ");
        System.out.println("Nama\t: " + mahasiswaTanpa.getNama());
        System.out.println("Nim\t\t: " + mahasiswaTanpa.getNim());
    }
}
