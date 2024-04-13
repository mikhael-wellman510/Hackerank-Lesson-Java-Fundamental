package Logic3;

import java.util.Arrays;
import java.util.List;

public class MeanSquareError {
    public  static  double solution(int [] arr1 , int[] arr2){


        double tampung = 0;
        for (int i = 0 ; i < arr1.length ; i++){
            double hasil = arr2[i] - arr1[i];
           tampung = tampung + (hasil * hasil) ;


        }




        return tampung / arr1.length;
    }

    public static void main(String[] args) {

        int [] a = {1,2,3};
        int [] b = {4,5,6};
        System.out.println(MeanSquareError.solution(a,b));
    }
}
