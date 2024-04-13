package Logic1;

import java.util.Scanner;

public class BungaPinjaman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //declare bobot
        float absen = 0.1f ;
        float tugas = 0.2f;
        float uts = 0.3f;
        float uas = 0.4f ;


        System.out.print("Masukan skor absen : ");
        float skorAbsen = input.nextFloat();
        System.out.print("Masukan skor tugas : ");
        float skorTugas = input.nextFloat();
        System.out.print("Masukan skor UTS : ");
        float skorUts = input.nextFloat();
        System.out.print("Masukan skor Uas : ");
        float skorUas = input.nextFloat();


        float hasilAbsen = skorAbsen*absen;
        float hasilTugas = skorTugas*tugas;
        float hasilUts = skorUts*uts;
        float hasilUas = skorUas*uas;
        System.out.println("hasil absen" + hasilAbsen);


        System.out.println("Hasil nya cok : " + hasilAbsen+hasilTugas+hasilUts+hasilUas);
    }
}
