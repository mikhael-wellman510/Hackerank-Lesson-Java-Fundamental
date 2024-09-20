package HackerRank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EqualizeTheArray {

    public static Integer equalizeArray(List<Integer>arr){




        return null;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        List<Integer> arr = IntStream.range(0 , n).mapToObj((val)->{
            Integer x = sc.nextInt();
            return x;
        }).collect(Collectors.toList());

        System.out.println(equalizeArray(arr));
    }
}
