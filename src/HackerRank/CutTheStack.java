package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CutTheStack {

    public static List<Integer> cutTheStick(List<Integer>data) {


//        Integer min = data.stream().min(Integer::compareTo).orElse(null);
//
//        Integer total = 0 ;
//        System.out.println(data);
//        while (!data.isEmpty()){
//
//            List<Integer> copy = new ArrayList<>();
//            for (Integer n : data){
//                if (n > min){
//                    copy.add(n-min);
//                }
//            }
//
//            data = copy;
//        }
//
//        System.out.println(data);


        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer total = sc.nextInt();

        List<Integer> test = IntStream.range(0,total).mapToObj((val)->{
            Integer n = sc.nextInt();
            return n;
        }).collect(Collectors.toList());
        System.out.println(test);
        System.out.println(cutTheStick(test));

    }
}
