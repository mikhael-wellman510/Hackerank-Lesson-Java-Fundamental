package Logic3;

import java.util.ArrayList;
import java.util.List;

public class WhichAreIn {
    public static List<String> datas(String [] arr1 , String [] arr2){

        List<String>hasil = new ArrayList<>();

        for (Integer i = 0; i < arr2.length ; i++){
            String result = "";
            for (Integer j = 0 ; j < arr1.length ; j++){
                if (arr2[i].contains(arr1[j])){
                    result = arr1[j];

                }
            }

            if (!hasil.contains(result)){
                hasil.add(result);
            }
        }

        System.out.println(arr2[0].contains(arr1[3]));



        return hasil;
    }

    public static void main(String[] args) {
        String [] a = {"andi","yuzi" , "arp" ,"live" ,"strong" ,"deni"};
        String [] b = {"lively", "alive", "harp", "sharp", "armstrong"};
        System.out.println(datas(a,b));
    }
}
