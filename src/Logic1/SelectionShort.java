package Logic1;

import java.util.*;
public class SelectionShort {
    public static void main(String[] args) {
        int [] angkaRandom =  {3,1,4,6,22,44,12,67,9};

        System.out.println(" ---- Ascending -----");

        for (int i = 0 ; i < angkaRandom.length ; i++){
            for (int j= i+1 ; j< angkaRandom.length ; j++){
                // Dia akan cek sampai ujung
                if(angkaRandom[i] > angkaRandom[j]){
                    int tampung = angkaRandom[i];
                    angkaRandom[j]= angkaRandom[i];
                    angkaRandom[i] = tampung;
                }
            }
        }
        System.out.println("Hasil Ascending : " + Arrays.toString(angkaRandom));

        System.out.println("----- Descending ------");

        int [] deretRandom = {3,7,1,8,9,2};

        for (int a = 0 ; a < deretRandom.length ; a++){
            for (int b = a + 1 ; b < deretRandom.length ; b++ ){
                if(deretRandom[a] < deretRandom[b] ){
                    int temp = deretRandom[a];
                    deretRandom[a] = deretRandom[b];
                    deretRandom[b]= temp;
                }
            }
        }

        System.out.println("Hasil Descending : " + Arrays.toString(deretRandom));
    }

}
