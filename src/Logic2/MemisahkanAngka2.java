package Logic2;

import java.util.ArrayList;
import java.util.List;

public class MemisahkanAngka2 {
    public static void main(String[] args) {
        System.out.println("tes");

        Integer []  angka = {2,4,7,5,1,5,3,2,9};


        List<Integer> result =  new ArrayList<>();
        for (Integer i = 0 ; i < angka.length ; i++){
            for (Integer j = i+1 ; j < angka.length -1; j++){
                if (angka[i] == angka[j]){
                    result.add(angka[i]);
                }
            }

        }

        System.out.println(result);


    }
}
