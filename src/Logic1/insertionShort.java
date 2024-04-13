package Logic1;

import java.util.Arrays;

public class insertionShort {
    public static void main(String[] args) {
        int []a = {3,5,4,1,2};

        for (int j = 1 ; j< a.length ; j++){
            int temp = a[j]; // nampung 3
            int i = j - 1 ; // 0 buat index 1


            //Dia akan berhenti jika fals
            while(i >= 0 && a[i] > temp){ // (0)true && 3 > 5 ? // 1(true) && 5 > 1 (true) ?
                a[i+1] = a[i]; // 1 = 0 // index 2
                i--;
            }
            a[i+1] = temp; // 5
        }

        System.out.println(Arrays.toString(a));
    }
}
