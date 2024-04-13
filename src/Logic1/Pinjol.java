package Logic1;

import java.util.Scanner;

public class Pinjol {
    public static void main(String[] args) {
        // data
        float pinjaman =  10000000 ;
        float bunga = 1.25f;
        float tenor = 24 ;
        float potonganAdmin = 2.5f;

        // menghitung bunga bulanan
        float bulanan= ((bunga/100))*pinjaman;
        // Menghitung Aslinya bulanan
        float asliBulanan = pinjaman / tenor;
        // Total Hitungan ;
        float cicilanBulanan = bulanan + asliBulanan ;
        System.out.println("Hasil Cicilan Bulanan adalah : " + cicilanBulanan);

        // rumus Administrasi
        float potongan = (potonganAdmin/100)* pinjaman;

        float totalHasilDiterima = pinjaman - potongan;

        System.out.println("Total Admin Diterima : " +totalHasilDiterima);



//        float hasil = bulanan + asliBulanan;
//        System.out.println(bulanan);
//        System.out.println(hasil);
//        int cicilanBulanan = (int)bulanan;















    }
}
