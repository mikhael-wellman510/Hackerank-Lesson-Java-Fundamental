package Logic1;

import java.util.Arrays;

public class cekDataDuplikat {
    public static void main(String[] args) {
        int [] number = {11,45,23,57,88,45,23,57};
        Arrays.sort(number);
        System.out.print("Ditemukan : ");
        for (int i = 0 ; i < number.length -1 ; i++){
            if (number[i] == number[i+1]){
                System.out.print(number[i] + " ");
            }
        }



    }
}
