package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class ArrayAngka {
    public static void main(String[] args) {
        Integer [] arr = {1,4,5,3,2,5,3,4,8,5,4,3,6,0,4,3,2,1,5,9,9,4,3,1,3,0,2,2,4,6,2,4,7,4};

        // Todo -> Jadikan angka menjadi tunggal

        List<Integer> data = new ArrayList<>();

        for (Integer i = 0 ; i < arr.length ; i++){

            if (data.isEmpty()){
                data.add(arr[i]);
            } else if (!data.contains(arr[i])) {
                data.add(arr[i]);
            }

        }
        List<Integer> cek = new ArrayList<>();
        for (Integer j = 0 ; j < arr.length ; j++){
            Integer temp = 0;
            for (Integer a = j ; a < arr.length ;a++){
                if (arr[j] == arr[a]){
                    temp++;
                }
            }

            if (cek.isEmpty()){
                System.out.println("Anggka " + arr[j] + " mempunyai total : " + temp);
                cek.add(arr[j]);
            } else if (!cek.contains(arr[j])) {
                System.out.println("Anggka " + arr[j] + " mempunyai total : " + temp);
                cek.add(arr[j]);
            }


        }



    }
}
