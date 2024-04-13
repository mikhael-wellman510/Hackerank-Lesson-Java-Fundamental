package HackerRank;

import java.util.Scanner;

public class Array1d {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Integer total = sc.nextInt();
        Integer [] myArr = new Integer[total];


        for (Integer  i = 0 ; i < total ; i++ ){
            Integer num = sc.nextInt();
            myArr[i] = num;
        }

        for (Integer a = 0 ; a < myArr.length ; a++){
            System.out.println(myArr[a]);
        }
    }
}
