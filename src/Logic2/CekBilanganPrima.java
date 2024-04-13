package Logic2;

import java.util.Scanner;

public class CekBilanganPrima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan angka : ");
        int cek = input.nextInt();

        int temp = 0;
        for (int i = 1 ; i < cek ; i++){
            if (cek % i == 0){
                temp++;
            }
        }

        if (temp <= 2){
            System.out.println(cek + " adalah bilangan Prima");
        }else {
            System.out.println(cek + " Bukan bilangan Prima");
        }
    }
}
