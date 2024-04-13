package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MiniMaxSum {

    public static void miniMaxSum(String angka){

        String [] arr = angka.split(" ");



        for (Integer i = 0 ; i < arr.length; i++){
            for (Integer j = i+1 ; j < arr.length ; j++){
                if (Long.parseLong(arr[i]) > Long.parseLong(arr[j])){
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        long max = 0;
        long min = 0;
        for (Integer i = 0 ; i < 2 ;i++){
           if (i==0){
               for (Integer a = 0 ; a < arr.length - 1 ; a++){
                   min = min + Integer.parseInt(arr[a]);
               }
           }else {
               for (Integer b = 1 ; b < arr.length ; b++){
                   max = max + Integer.parseInt(arr[b]);
               }
           }
        }

        System.out.println(min + " " + max);
    }

    public static void main(String[] args) throws IOException {
       Scanner in = new Scanner(System.in);

        String angka = in.nextLine();
        MiniMaxSum.miniMaxSum(angka);

    }
}
