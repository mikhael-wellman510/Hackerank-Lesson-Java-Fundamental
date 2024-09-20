package HackerRank;

import java.util.*;

public class Lcs {
    public static String lcs(String a , String b){


        String [] arrA = a.split("");
        String [] arrB = b.split("");
        System.out.println(a.length());
        System.out.println(b.length());
        List<String> result = new ArrayList<>();


        if (a.length() != b.length()){
            for (Integer i = 0 ; i < a.length() ; i++){

                for (Integer j = i ; j < b.length() ; j++){
                    if (arrA[i].equals(arrB[j])){
                        result.add(arrA[i]);
                        break;
                    }else {
                        break;
                    }
                }
            }

        }else {
            for (Integer i = 0 ; i < b.length() ; i++){

                for (Integer j = i ; j < a.length() ; j++){
                    if (arrB[i].equals(arrA[j])){
                        result.add(arrB[i]);
                        break;
                    }
                }
            }
        }



        System.out.println(result);


        return null;
    }
    public static void main(String[] args) {
        Lcs.lcs("132535365", "123456789");
    }
}
