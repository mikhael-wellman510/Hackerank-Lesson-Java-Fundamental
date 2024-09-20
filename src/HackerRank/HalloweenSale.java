package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HalloweenSale {


    public static Integer howManyGames(Integer p , Integer d , Integer m , Integer s){

        int totalGames = 0;
        int currentPrice = p;

        while (s >= currentPrice) {
            s -= currentPrice;
            totalGames++;
            currentPrice = Math.max(currentPrice - d, m);
        }

        return totalGames;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] biaya = sc.nextLine().split(" ");
        Integer p = Integer.parseInt(biaya[0]) ;
        Integer d = Integer.parseInt(biaya[1]) ;
        Integer m = Integer.parseInt(biaya[2]) ;
        Integer s = Integer.parseInt(biaya[3]);


        howManyGames(p,d,m,s);





    }
}
