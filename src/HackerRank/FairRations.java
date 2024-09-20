package HackerRank;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FairRations {


    public static String fairRations(List<Integer> data){

        Integer res = 0;
        Integer count = 0;

           for (Integer i = 0 ; i <  data.size() ; i++){

               if (data.get(i) % 2 != 0 && data.size() != (i + 1)){
                   data.set(i , (data.get(i) + 1));
                   data.set(i + 1 , data.get(i+1) + 1);
                   res = res + 2 ;
                   count++;
               }
           }


       if (count % 2 != 0){
           return "NO";
       }

       return String.valueOf(res);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer val = sc.nextInt();

        List<Integer> data =  IntStream.range(0,val).mapToObj(item -> {

            return sc.nextInt();
        }).collect(Collectors.toList());

        System.out.println(fairRations(data));
    }
}
