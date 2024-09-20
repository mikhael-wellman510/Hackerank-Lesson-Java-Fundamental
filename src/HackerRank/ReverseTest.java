package HackerRank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseTest {
    public static void main(String[] args) {

        Integer [] arr = {1,2,3,4,5,6};

        for (Integer i = 0 ; i < (arr.length / 2); i++){
            Integer temp = arr[i];
            arr[i] = arr[arr.length -1 - i];
            arr[arr.length -1 - i] = temp;
        }

        System.out.println(Arrays.toString(arr));


    }
}
