package Logic1;

import java.util.Scanner;

public class SegitigaPattern2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Angka : ");
        int angka = input.nextInt();

        for (int i = 1 ; i <= angka ; i++){
            for (int j =1 ; j <= i ; j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
