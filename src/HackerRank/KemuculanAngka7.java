package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KemuculanAngka7 {

    public static void total(Integer n ){


        List<Integer> result = new ArrayList<>();
        for (Integer i = 0 ; i < n ; i++){
            if (i < 10){
                if (i == 7){
                    result.add(i);
                }
            } else if (i< 100) {
                String angka = String.valueOf(i);
                String [] data = angka.split("");
                if (Integer.parseInt(data[0]) == 7 || Integer.parseInt(data[1]) == 7){
                    result.add(i);
                }
            }
        }

        System.out.println(result);

    }


    public static void main(String[] args) {
            KemuculanAngka7.total(100);
    }
}
