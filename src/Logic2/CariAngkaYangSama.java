package Logic2;

import java.util.ArrayList;

public class CariAngkaYangSama {
    public static void main(String[] args) {
        int [] data = {2,6,3,8,9,2,6};
        ArrayList<Integer> hasil = new ArrayList<Integer>();
        for (int i = 0 ; i < data.length ; i++){
            int temp = 0;
            for (int j = 0 ; j < data.length ; j++){
                if (data[i] == data[j]){
                    temp++;

                }
            }
            if (temp >= 2){
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
