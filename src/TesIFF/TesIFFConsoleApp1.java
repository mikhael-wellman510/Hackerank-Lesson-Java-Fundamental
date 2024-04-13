package TesIFF;

import java.util.ArrayList;
import java.util.List;

public class TesIFFConsoleApp1 {

    public static void  bilanganPrima(Integer in){



        List<Integer> hasil = new ArrayList<>();
        for (Integer i = 2 ; i <= in ; i++){

            Integer temp = 0;

                for (Integer j = 1 ; j < i ;j++){
                    if (i %  j  == 0){
                        temp++;
                    }

                }
                if (temp < 2){
                    hasil.add(i);
                }

        }

        System.out.println(hasil);
    }


    public static void main(String[] args) {

        TesIFFConsoleApp1.bilanganPrima(17);

    }
}
