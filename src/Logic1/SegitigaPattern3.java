package Logic1;

import java.util.Scanner;

public class SegitigaPattern3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukan angka : ");
        int angka= input.nextInt();

        int counter = 1;

        for (int i = 1 ; i <= angka ; i++){
            for (int j = 1 ; j <= i ; j++){
                System.out.print(counter+ "  " );
                counter++;
            }
            System.out.print("\n");
        }
    }
}
