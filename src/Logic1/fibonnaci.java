package Logic1;

import java.util.Scanner;

public class fibonnaci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Nilai : ");
        int angka = input.nextInt();

        int a = 0;
        int b = 1;


        for (int i = 0 ; i < angka ; i++){
            int c = a + b ;
            System.out.print(c + " ");
            a = b ;
            b = c;
        }
    }
}
