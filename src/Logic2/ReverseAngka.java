package Logic2;

import java.util.Scanner;

public class ReverseAngka {
    public static void main(String[] args) {
        int angka = 15 ; // 1

        int reserved = 0 ; // 5 || 51
        while (angka != 0){
            int digit = angka % 10; // 5 || 51

            reserved = reserved * 10 + digit; // 5 || 51||
            // 1 % 10 == 0
            angka = angka / 10;  // 1 // 5/ 10 = 0 // 55 / 10 = 5 ; apapun yang di bagi 0 , jawan nya adalah 0

        }
        System.out.println(1 /10);
        System.out.println("HAsil:" + reserved);
    }
}
