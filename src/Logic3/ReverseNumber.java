package Logic3;

import java.util.Arrays;

public class ReverseNumber {
    public static void main(String[] args) {
        Integer [] a ={3,4,5,6};



               for (Integer j = 0 ; j < a.length/2 ; j++){
                   Integer temp = a[j];
                   a[j] = a[a.length -j-1];
                   a[a.length -j -1] = temp;
               }




        System.out.println(Arrays.toString(a));
        System.out.println("hasil");

    }
}
