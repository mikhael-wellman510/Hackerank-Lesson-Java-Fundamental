package Logic1;

import java.util.Arrays;
public class BublleShort {
    public static void main(String[] args) {
        // Buat Variable
        int [] angkaRandom = {7,4,8,4,1,6,8,11,67,56,22,0};

        // buat iterasi
        System.out.println("---- Ascending-----");

        // buat For untuk mengecek seluruh Angka Random
        for(int i = 0 ; i < angkaRandom.length ; i++){
            for(int j = 0 ; j < angkaRandom.length -1 ; j++){
                //
                if(angkaRandom[j] > angkaRandom[j+1]){
                    int temp = angkaRandom[j];
                    angkaRandom[j] = angkaRandom[j+1];
                    angkaRandom[j+1]= temp;
                }
            }
        }

        System.out.println("Hasil Ascending Bubble Short " + Arrays.toString(angkaRandom));

        int [] deretRandom = {10,2,4,55,78,3,5,67};
        for (int a = 0 ; a < deretRandom.length ; a++){
            for (int b = 0 ; b < deretRandom.length-1 ; b++){
                if(deretRandom[b] < deretRandom[b+1]){
                    int temp = deretRandom[b];
                    deretRandom[b]= deretRandom[b+1];
                    deretRandom[b+1]= temp;
                }
            }
        }
        System.out.println("Hasil Descending Bubble Short " + Arrays.toString(deretRandom));
    }
}
