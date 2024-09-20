package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class LibraryFine {

    public static Integer libraryFine(String pinjam , String pengembalian){
        System.out.println(" pengembnalian : " + pengembalian);
        System.out.println("pinjam : " + pinjam);
        String [] arrPinjam = pinjam.split(" ");
        String [] arrPengembalian = pengembalian.split(" ");
        // Todo -> pinjam,
        Integer d1 = Integer.parseInt(arrPinjam[0]);
        Integer m1 = Integer.parseInt(arrPinjam[1]);
        Integer y1 = Integer.parseInt(arrPinjam[2]);

        // todo -> Pengembalian
        Integer d2 = Integer.parseInt(arrPengembalian[0]);
        Integer m2 = Integer.parseInt(arrPengembalian[1]);
        Integer y2 = Integer.parseInt(arrPengembalian[2]);

        Integer denda = 0 ;



        if (y2 >= y1 ){
            if (y2 <= y1){
                if (m2 <= m1 ){
                    // Todo -> Cek Hari
                    if (d2 <= d1 ){
                        denda = 0;

                    } else if (m2 < m1 && d2>d1) {
                        denda = 0;
                    } else {
                        denda = (d2-d1) *15;
                    }

                }else {
                    // Todo cek Bulan
                    if (y2 > y1){
                        denda = (y2-y1) * 10000;
                    }else {
                        denda = (m2 - m1) * 500;
                    }


                }
            }else {
                denda = (y2-y1) * 10000;
            }


        }else {
            denda = 0;
        }



        return denda;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pengembalian = sc.nextLine();
        String pinjam = sc.nextLine();
        System.out.println( libraryFine(pinjam, pengembalian));



    }
}
