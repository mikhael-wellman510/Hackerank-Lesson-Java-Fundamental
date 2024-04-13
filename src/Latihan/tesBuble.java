package Latihan;

import java.util.Arrays;

public class tesBuble {
    public static void main(String[] args) {
        int [] angka = {50,10,40,23,3,14,546,23,5351,199};

        for (int i = 0 ; i < angka.length ; i++){
            for (int j = 0 ; j < angka.length - 1 ; j++){
                if(angka[j] > angka[j+1]){
                    int temp = angka[j+1];
                    angka[j+1] = angka[j];
                    angka[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(angka));
    }
}
