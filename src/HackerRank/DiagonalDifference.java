package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiagonalDifference {

    public static Integer diagonalDifference(List<List<Integer>> arr){
        Integer resA = 0;
        Integer resB = 0;
        for (Integer i = 0 ; i < arr.size(); i++){


            if (i == 0){
                resA =resA + arr.get(i).get(0);
                resB = resB +  arr.get(i).get(arr.size()-1);
            }else {
                resA =resA + arr.get(i).get(i);
                resB = resB +  arr.get(i).get(arr.size()-(i+1));
            }
        }

        if (resA > resB){
            return resA - resB;
        }
        return resB - resA;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer total = sc.nextInt();
        sc.nextLine();

        List<List<Integer>> datas = new ArrayList<>();
        for (Integer i = 0 ; i < total ; i++){

           String a = sc.nextLine();
           String [] arrA = a.split(" ");
           List<Integer> tempData = new ArrayList<>();
           for (String loop : arrA){
                tempData.add(Integer.parseInt(loop));
           }
           datas.add(tempData);
        }

        System.out.println(DiagonalDifference.diagonalDifference(datas));;
    }
}
