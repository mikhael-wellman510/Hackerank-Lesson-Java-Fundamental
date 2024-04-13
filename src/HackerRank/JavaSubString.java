package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class JavaSubString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.nextLine();
        Integer a = in.nextInt();
        Integer b = in.nextInt();

        String [] arrWord = word.split("");
        String result = "";
        for (Integer i = a ; i < b ; i++){
            result += arrWord[i];
        }

        System.out.println(result);
    }
}
