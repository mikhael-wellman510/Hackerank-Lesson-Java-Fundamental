package HackerRank;

import java.util.Arrays;

public class Kata {
    public static void main(String[] args) {
        String word = "I     Love     You    And    I  Miss    You";

        String  cek = word.replaceAll("\\s+"," ");
        String [] arr = cek.split(" ");
        System.out.println(word);

        String result = "";
        for (Integer i = 0 ; i < arr.length ; i++){
            result = result + arr[i] + " ";
        }
        System.out.println(result);
    }
}
