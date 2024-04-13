package Logic1;

import java.util.ArrayList;

public class memisahAngka {
    public static void main(String[] args) {
        int [] data = {1,4,3,2,4,6,7,9,0,0,8,7,6,7,8,9,8,2,3,4,6,4,6,7,8,9,4};

        ArrayList<Integer> hasil = new ArrayList<Integer>();
        ArrayList<Integer> duplikasi = new ArrayList<Integer>();

        for (int i = 0 ; i < data.length ; i++){
            if (!duplikasi.contains(data[i])){
                // count akan kembali ke 0 jika iterasi kembali ke atas
                int count = 0 ;
                for (int j = 0; j < data.length - 1 ; j++){
                    if (data[i] == data[j]){
                        count++;
                    }
                }
                if (count > 1){
                    hasil.add(data[i]);
                    duplikasi.add(data[i]);
                }
            }

        }

        System.out.println("HAsil : " + hasil);
    }
}
