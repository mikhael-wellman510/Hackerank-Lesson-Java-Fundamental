package HackerRank;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FindDigits {

    public static Integer findDigits(Integer n){

        String [] data = String.valueOf(n).split("");

        Integer total = 0;

        for (Integer i = 0 ; i < data.length ; i++){
            if (Integer.parseInt(data[i]) == 0){
                    continue;
            } else if (n % Integer.parseInt(data[i]) == 0){
                total++;
            }
        }

        return total;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer init = sc.nextInt();

        IntStream.range(0,init).forEach(val->{
            System.out.println(findDigits(sc.nextInt()));
        });

    }
}
