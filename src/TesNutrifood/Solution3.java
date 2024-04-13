package TesNutrifood;

import java.util.Arrays;

public class Solution3 {

    public Solution3() {
    }

    // ==== Todo - > Menguunakan Sort Method ===
    public Integer [] withShort(Integer [] arr){


        Arrays.sort(arr);
        return arr;
    }

    // ==== Todo - > Menguunakan Sort Manual===
    public Integer []manualShort(Integer [] arr2){
        for (Integer i = 0 ; i < arr2.length ; i++){
            for (Integer j = i+1 ; j < arr2.length; j++){
                if (arr2[i] > arr2[j]){
                    Integer temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        return arr2;
    }


    public static void main(String[] args) {
        Solution3 sort = new Solution3();

        Integer [] arr = {3,1,5,2,4};
        System.out.println("Hasil menggunakan Method short : " +Arrays.toString(sort.withShort(arr)));

        Integer [] arr2 = {3,1,5,2,4};
        System.out.println("Hasil Manual : " + Arrays.toString(sort.manualShort(arr2)));
    }
}
