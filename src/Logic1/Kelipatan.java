package Logic1;

import java.util.Scanner;

public class Kelipatan {
    public static void main(String[] args) {
        // membuat kelipatan 3
        Scanner batas = new Scanner(System.in);
        int i = 1 ;
        System.out.print("Masukan batas : ");
        int batasAngka = batas.nextInt();
        while (i <= batasAngka){
            System.out.println(i * 3);
            i++;
        }
    }
}
