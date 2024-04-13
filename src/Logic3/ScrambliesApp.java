package Logic3;

import java.util.*;

public class ScrambliesApp {

    public static Boolean scramble(String str1 , String str2){
        Map<Character, Integer> countStr1 = new HashMap<>();
        Map<Character, Integer> countStr2 = new HashMap<>();

        // Menghitung frekuensi karakter dalam str1
        for (char c : str1.toCharArray()) {
            countStr1.put(c, countStr1.getOrDefault(c, 0) + 1);
        }

        // Menghitung frekuensi karakter dalam str2
        for (char c : str2.toCharArray()) {
            countStr2.put(c, countStr2.getOrDefault(c, 0) + 1);
        }

        // Membandingkan frekuensi karakter dalam str1 dan str2
        for (Map.Entry<Character, Integer> entry : countStr2.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            if (countStr1.getOrDefault(c, 0) < count) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println( ScrambliesApp.scramble("rkqodlw", "world"));;
    }
}
