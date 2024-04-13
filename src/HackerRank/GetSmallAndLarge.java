package HackerRank;

import java.util.Scanner;

public class GetSmallAndLarge {

    public static String getSmallAndLarge(String word , Integer length){


        String small = word.substring(0,length);

        String large = word.substring(0,length);



        for (Integer i = 1 ; i <= word.length() - length ; i ++){
            String substr = word.substring(i , i+length);
            if (substr.compareTo(small) < 0){
                small=substr;
            }

            if (substr.compareTo(large) > 0){
                large=substr;
            }
            System.out.println("cek : " + substr);
        }

        return small + "\n" +large;
    }

    public static void main(String[] args) {

        String s = "welcometojava";
        Integer length = 3;

        System.out.println(GetSmallAndLarge.getSmallAndLarge(s,length));
    }
}
