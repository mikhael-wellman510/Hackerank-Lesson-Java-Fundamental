package Logic3;

import java.util.Arrays;

public class StripComments {
    public static String stripComments(String text ,String[] commentSymbol){

        String [] arr = text.split("\n");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[2]);
        return "";
    }

    public static void main(String[] args) {
        System.out.println( StripComments.stripComments("apples, pears # and bananas\ngrapes\nbananas !apples", new String[] { "#", "!" }));


    }
}
