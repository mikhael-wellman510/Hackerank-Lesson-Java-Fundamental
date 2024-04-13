package Logic2;

import java.util.ArrayList;
import java.util.Arrays;

public class CekDataDuplikat {
    public static void main(String[] args) {
        int [] data = {2,6,8,4,7,3,0,7,1,2, 4, 4};
        ArrayList<Integer> hasil = new ArrayList<Integer>();

        for (int i = 0 ; i < data.length  ; i++){
            int temp =0;
            for (int j = 0; j < data.length ; j++){
                if (data[i] == data[j]){
                    temp++;
                }
            }
            if (temp >= 2){
                // Contains method arrayList untuk mengetahui apakah ada
                if (hasil.contains(data[i])){
                    continue;
                }else {
                    hasil.add(data[i]);
                }

            }


        }
        System.out.println(hasil);
    }
}
