package Logic1;

import java.util.Scanner;

public class SegitigaPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Angka : ");
        int angka = input.nextInt();

        for (int i = 1 ; i<= angka ; i++){
            //Buat untuk ke kanan
            for (int j = 1 ; j <= i ; j++){
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
}
