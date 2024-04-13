package Logic1;

import java.util.Arrays;
import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan angka : " );
        int faktorial = input.nextInt();



        for (int i = 1; i <= faktorial  ; i++){
            if(faktorial % i == 0 ){
                System.out.print(i + " ");

            }
        }

    }
}
