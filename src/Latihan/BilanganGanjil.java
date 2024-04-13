package Latihan;

import java.util.ArrayList;

public class BilanganGanjil {
    public static void main(String[] args) {

        int total = 40;

        ArrayList<Integer> hasil = new ArrayList<Integer>();
        int i = 0;

        while (total > i){

            if (total % 2 == 1){
                hasil.add(i);
            }
            i++;
        }


    }
}
