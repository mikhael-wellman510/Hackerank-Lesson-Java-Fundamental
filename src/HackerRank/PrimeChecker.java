package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeChecker {

    public static void resultPrime(Integer n){
        List<Integer> result = new ArrayList<>();
        for (Integer i = 1 ; i < n ; i++){

            Integer temp = 0;
            for (Integer j = 1 ; j<= i ;j++){
                if (i % j == 0){
                    temp++;
                }
            }
            System.out.println(temp);
            if (temp == 2){
                result.add(i);
            }
        }

        System.out.println(result);
    }


    public static void checkPrime(Integer n){

        Integer temp = 0;
        List<Integer> data = new ArrayList<>();
        for (Integer i = 1 ; i <= n ; i++){


            if (n % i == 0){
                data.add(i);
                temp++;
            }
        }

        if (temp ==2){
            PrimeChecker.resultPrime(n);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);



        for (Integer i = 0 ; i < 5 ; i++){
            Integer loop = in.nextInt();
            PrimeChecker.checkPrime(loop);
        }
    }
}
