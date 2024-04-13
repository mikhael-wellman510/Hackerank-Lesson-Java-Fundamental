package Logic3;

import java.util.Arrays;

public class SpinWords {
    public static void main(String[] args) {
        String word = "This is a test";
        String [] arrWords = word.split(" ");
        System.out.println(Arrays.toString(arrWords));
        System.out.println(arrWords[0].length());

        for (Integer i = 0 ; i < arrWords.length ; i++){
            if (arrWords[i].length() > 5){
                String [] kata = arrWords[i].split("");
                for (Integer j = 0 ; j < kata.length /2 ; j++){
                    String temp = kata[j];
                    kata[j] = kata[kata.length -1 -j];
                    kata[kata.length -1 -j] = temp;
                }
              String convert = String.join("" ,kata);
                arrWords[i] =convert;

            }

        }

        String result = String.join(" ",arrWords);
        System.out.println(result);
    }
}
