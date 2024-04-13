package Logic3;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Scramblies {

    public static boolean scramble(String str1 , String str2){

        HashMap<Character,Integer> data1 = new HashMap<>();
        HashMap<Character,Integer> data2 = new HashMap<>();

        for (char a : str1.toCharArray()){
            data1.put(a , data1.getOrDefault(a,0)+1);
        }

        for (char b : str2.toCharArray()){
            data2.put(b, data2.getOrDefault(b,0)+1);
        }
        System.out.println(data1);
        System.out.println(data2);

        for (Map.Entry<Character,Integer> entry : data2.entrySet()){
            char c = entry.getKey();
            Integer a = entry.getValue();
            // Todo -> jika nilai tidak ada maka jadi 0
            // Tdod -> Jadi konteks nya , jika ada data 2 lebih banyak , maka langsung false
            if (data1.getOrDefault(c,0) < a){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

        System.out.println(scramble("cedewaraaossoqqyt","codewars"));  ;

    }
}
