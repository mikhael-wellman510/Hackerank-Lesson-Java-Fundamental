package Logic2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleShort {
    public static void main(String[] args) {
        int [] angka = {3,6,5,1,8,9,2,7,4};

        for (int i = 0 ; i < angka.length ; i++){
            for (int j = 0 ; j < angka.length -1 ; j++){
                if(angka[j] > angka[j+1]){
                    int temp = angka[j]; // 3
                    angka[j] = angka[j+1]; // 6
                    angka[j+1] = temp; // 3
                }
            }
        }

        System.out.println(Arrays.toString(angka));
    }
}
