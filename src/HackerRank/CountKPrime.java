package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class CountKPrime {

    public static List<Integer> counKPrimes(Integer k , Integer start ,Integer end){

        List<Integer> data = new ArrayList<>();

        for (Integer i = start ; i < end ; i++ ){
            Integer temp = 0;

            for (Integer j = start ; j < i ; i++){
                if (i % j == 0){

                }
            }

            if (data.isEmpty() && temp < k){

            }


        }


        return null;
    }

    public static void main(String[] args) {
        CountKPrime.counKPrimes(2,1,100);

    }
}
