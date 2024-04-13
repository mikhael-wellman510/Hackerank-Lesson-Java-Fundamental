package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class JavaStringReverse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.nextLine();
        String [] kata = word.split("");

        for (Integer i = 0 ; i < kata.length ; i++){

            for (Integer j = i+1 ; j < kata.length  ; j++){
                String temp = kata[i];
                kata[i]=kata[j];
                kata[j] = temp;
            }
        }

      String hasil = String.join("" , kata);

        if (word.equals(hasil)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}

