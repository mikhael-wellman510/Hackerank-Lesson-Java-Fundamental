package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DiagonalDifrence {

    public static Integer solution(List<List<Integer>> arr){

        // Todo -> Primary Diagonal
        Integer temp = 0 ;
        Integer curr = 0;
        for (Integer i = 0 ; i < arr.size() ; i++){
            for (Integer  j = 0 ; j < arr.size() ; j++){
                if (i == curr){
                    temp = temp + arr.get(i).get(i);
                    curr++;

                  break;
                }
            }

        }

        // Todo -> Secondary Diagonal
        Integer temp2 = 0;
        Integer curr2 = arr.size()- 1;
        for (Integer a = 0; a < arr.size() ; a++){

            for (Integer b = arr.size()-1 ; b >= 0 ; b--){
                if ( b == curr2){
                    temp2 =temp2+ arr.get(a).get(b);
                    curr2--;
                    break;
                }

            }
        }



        Integer total = temp - temp2 ;

        Integer finalResult ;

        if (total < 0){
            finalResult = temp2 - temp;
        }else {
            finalResult = temp - temp2;
        }


        return finalResult;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Masukan length : " );
        Integer length = in.nextInt();



        List<List<Integer>> data =  new ArrayList<>();

        for (Integer i = 0 ; i < length ; i++ ){
            List<Integer> arr = new ArrayList<>();
            for (Integer j = 0 ; j < length ; j++){
                System.out.println("Masukan data : ");
                arr.add(in.nextInt());
            }

            data.add(arr);
        }


        System.out.println( DiagonalDifrence.solution(data));

    }
}
