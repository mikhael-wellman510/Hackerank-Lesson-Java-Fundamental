package Logic3;

import java.util.Arrays;
import java.util.Collections;

public class ReverseString {
    public static void main(String[] args) {
        String [] a = {"a","b" ,"c" ,"d" , "e"};

        for (Integer i = 0 ; i < a.length/2 ; i++){
            String temp = a[i];
            a[i] = a[a.length -1 -i];
            a[a.length -1 -i]= temp;
        }

        System.out.println(Arrays.toString(a));

        String [] b = {"a","b" ,"c" ,"d" , "e"};

        // Todo ->  menggunakan String Builder
        Collections.reverse(Arrays.asList(b));
        System.out.println(Arrays.toString(b));


    }
}
