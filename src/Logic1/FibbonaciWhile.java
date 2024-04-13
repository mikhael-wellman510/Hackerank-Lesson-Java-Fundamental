package Logic1;

import java.util.Scanner;

public class FibbonaciWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Angka : ");
        int angka = input.nextInt();


        int a = 0 ;
        int b = 1 ;

        int temp = 0 ;

        while (temp  <  angka){
            int hasil = a + b ;
            System.out.print(hasil + " , ");
            a = b ;
            b = hasil;
            temp++;
        }
    }
}
