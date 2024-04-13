package Logic1;

import java.util.ArrayList;
import java.util.Scanner;

public class GanjiDanGenap {
    public static void main(String[] args) {
        ArrayList<Integer> genap = new ArrayList<Integer>();
        ArrayList<Integer> ganjil = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan angka : ");
        int angka = input.nextInt();
        for (int i = 0 ; i< angka ; i++){
            if (i % 2 == 0 ){
                genap.add(i);
            }else{
                ganjil.add(i);
            }
        }

        System.out.println("Bilangan Genap : " + genap);
        System.out.println("Bilangan Ganjil : " + ganjil);
    }
}
