package Logic1;

import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[] args) {
        // Tampilkan bilangan prima

        Scanner angka = new Scanner(System.in);
        System.out.print("Masukan Angka : ");

        int angkaMax = angka.nextInt();

       for (int i = 2 ; i <= angkaMax ; i++ ){
           int modulus = 0;
           for (int j = 1; j <= i ; j++){
               if(i % j == 0){
                modulus = modulus+1;
               }
           }
           if(modulus <= 2){
               System.out.print(i + " ");
           }
       }

    }
}
