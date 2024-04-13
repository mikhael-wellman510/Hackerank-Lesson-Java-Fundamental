package TesDelphi;

import java.util.ArrayList;
import java.util.List;

public class SoalNo2 {

    public static void bilanganGanjil(Integer in){


        List<Integer> data = new ArrayList<>();
        for (Integer i = 1 ; i < in  ; i++){
            if (i % 2 != 0){
                data.add(i);
            }
        }
        System.out.println(data);

    }

    public static void main(String[] args) {

        SoalNo2.bilanganGanjil(100);
    }
}
