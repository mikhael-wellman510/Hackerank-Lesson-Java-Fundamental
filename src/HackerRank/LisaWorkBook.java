package HackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LisaWorkBook {


    public static Integer workBook(Integer n , Integer k , List<Integer>arr){

        Integer curr = 1;
        Integer res = 0;

        for (Integer i = 0 ; i < n ; i++){

            for (Integer j = 1 ; j <= arr.get(i) ; j++){
                if (curr == j){
                    res++;
                }
               if (j % k == 0 || j == arr.get(i)){
                    curr++;
               }
            }
        }




        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] init = sc.nextLine().split(" ");
        Integer chapter = Integer.parseInt(init[0]);
        Integer max = Integer.parseInt(init[1]);

        List<Integer> arr = IntStream.range(0,chapter).mapToObj(val ->{
            return sc.nextInt();
        }).collect(Collectors.toList());

        System.out.println(workBook(chapter,max,arr));
    }
}
