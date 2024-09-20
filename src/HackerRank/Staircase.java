package HackerRank;

import java.util.Scanner;

public class Staircase {

    public static void staircase(Integer n){

        for (Integer i = 0 ; i < n ; i++){


            for (Integer k = 0 ; k < (n-i) - 1  ; k++){
                System.out.print(" ");
            }

            for (Integer j = 0 ; j < i+1 ; j++){
                System.out.print("#");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();

        Staircase.staircase(n);

    }
}
