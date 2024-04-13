package HashMap;

import java.util.*;

public class Fibbonaci {



    public static void main(String[] args) {
        String[] arrAnagram = {"kita", "atik", "tika", "aku", "kia", "makan", "kua"};

        List<List<String>> data = new ArrayList<>();


        for (Integer i = 0 ; i < arrAnagram.length; i++){
            char[] arr1 = arrAnagram[i].toCharArray();
            Arrays.sort(arr1);
            String strArr1 = new String(arr1);

            List<String> arr = new ArrayList<>();
            for (Integer j = 0; j < arrAnagram.length; j++){
                char [] arr2 = arrAnagram[j].toCharArray();
                Arrays.sort(arr2);
                String strArr2 = new String(arr2);

                if (strArr1.equals(strArr2)){
                    arr.add(arrAnagram[j]);

                }
            }

            if (data.isEmpty()){

                data.add(arr);
                i = i + arr.size();

            }else {
                data.add(arr);
            }


        }
        System.out.println(data);
    }
}
