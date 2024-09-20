package HackerRank;

import java.util.Scanner;

public class ViralAdvertising {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();

        Integer temp = 0;
        Integer init = 5;
        for (Integer i = n ; i > 0 ; i--){

            Integer res = init / 2 ;
            temp = temp + res;
            init = res * 3;


        }

        System.out.println(temp);

    }
}
