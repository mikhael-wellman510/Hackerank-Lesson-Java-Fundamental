package Logic3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class CountingDuplicates {
    public static void main(String[] args) {
        String kata = "indivisibilItyn";
        String [] arrKata = kata.toUpperCase().split("");
        Integer count = 0;
        List<String> countingWords = new ArrayList<>();
        for (Integer i = 0 ; i <  arrKata.length ; i++){

            for (Integer j = i ; j < arrKata.length-1; j++){
                if (arrKata[i].equals(arrKata[j+1]) &&!countingWords.contains(arrKata[i])){
                 countingWords.add(arrKata[i]);
                 count++;
                }
            }


        }

        System.out.println(count);
        System.out.println(countingWords);
    }
}
