package Logic1;

import java.util.ArrayList;
import java.util.*;
public class MemisahkanAngka2 {
    public static void main(String[] args) {
        int [] data = {1,4,3,2,4,6,7,9,0,0,8,7,6,7,8,9,8,2,3,4,6,4,6,7,8,9,4};

        ArrayList<Integer>hasil = new ArrayList<Integer>();

        for (int i = 0 ; i < data.length ; i++){
            if (!hasil.contains(data[i])){
                hasil.add(data[i]);
            }
        }


        //Untuk mengurutkan angka dengan method Short
        Collections.sort(hasil);

        System.out.println("Hasil pencarian angka double : " + hasil);


    }
}
