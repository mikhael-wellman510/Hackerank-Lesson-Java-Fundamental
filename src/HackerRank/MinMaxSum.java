package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinMaxSum {
    public static void minMaxSum(List<Long>arr){


        Long total = 0L;
        Long max = 0L;
        Long min = Long.MAX_VALUE;
        for (Integer i = 0 ; i < arr.size() ; i++){
            total = total +arr.get(i);
            if (max < arr.get(i)){
                max = arr.get(i);
            }


            if ( arr.get(i) < min){
                min = arr.get(i);
            }
        }

        System.out.println((total - max) + " " + (total - min));
        System.out.println(min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();

        String [] dataArr = data.split(" ");
        List<Long> datas = new ArrayList<>();

        for (Integer i = 0 ; i < dataArr.length; i++){
            datas.add(Long.parseLong(dataArr[i]));
        }
        MinMaxSum.minMaxSum(datas);
    }
}
