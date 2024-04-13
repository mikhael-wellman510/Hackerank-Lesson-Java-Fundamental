package Logic3;

import java.util.Arrays;

public class SortTheOdd {
    public static void main(String[] args) {
        Integer [] arr = {5, 8, 6, 3, 4};


        for (Integer i = 0 ; i < arr.length ; i++){
          for (Integer j = 0 ; j < arr.length ; j++){
              if (arr[i] % 2 == 1 && arr[i] < arr[j] && arr[j] % 2 ==1  ){
                  System.out.println("masuk : " + arr[i]);
                  System.out.println("masuk : " + arr[j]);
                   Integer temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
              }
          }
        }
        System.out.println(false && false);
        System.out.println(Arrays.toString(arr));

    }

}
