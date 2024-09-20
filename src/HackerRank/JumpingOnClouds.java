package HackerRank;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class JumpingOnClouds {

    public static Integer jumpingOnClouds(Integer[] arr , Integer k){

        Integer e = 100;
        Integer temp = 0;
        for (Integer i = 0 ; i < arr.length  ; i++){

            Integer res = (temp + k) % arr.length;
            temp = temp + k; ;
            if (res == 0 ){
                if (arr[res] == 0){
                    e = e - 1;
                    break;
                }else {
                    e = e - 3;
                    break;
                }
            }else {
                if (arr[res] == 1){
                    e = e -3 ;

                }else {
                    e= e-1;
                }
            }
        }



        return e;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] init = sc.nextLine().split(" ");
        Integer n = Integer.parseInt(init[0]);
        Integer k = Integer.parseInt(init[1]);



        String [] data = sc.nextLine().split(" ");
        Integer [] dataArr = new Integer[n];


        for (Integer i = 0 ; i < n ; i++ ){
            dataArr[i] = Integer.parseInt(data[i])  ;
        }
        System.out.println(jumpingOnClouds(dataArr,k));
    }
}
