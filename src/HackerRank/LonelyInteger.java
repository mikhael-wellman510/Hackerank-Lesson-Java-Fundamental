package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LonelyInteger {

    public static int lonelyinteger(List<Integer> a){


        List<Integer> tmp = new ArrayList<>();
        Integer result = 0;
        for (Integer i = 0 ; i < a.size() ; i++){

            for (Integer j = i+1 ; j < a.size() ; j++){
                if (a.get(i).equals(a.get(j))){
                    tmp.add(a.get(i));
                }
            }

            if(!tmp.contains(a.get(i))){
             result = a.get(i);
            }
        }



        return  result;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Integer length= in.nextInt();

        List<Integer> a = new ArrayList<>();

        for (Integer i = 0 ; i < length ; i++){

            a.add(in.nextInt());
        }
        System.out.println( LonelyInteger.lonelyinteger(a));






    }
}
