package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String hasil = sc.nextLine();


     String [] data = hasil.trim().split("[^A-Za-z]+");
     if (hasil.isEmpty()){
         System.out.println("0");

     }else {
         System.out.println(data.length);
     }

    for (Integer i = 0 ; i < data.length ; i++){
         System.out.println(data[i]);
        }



    }
}
