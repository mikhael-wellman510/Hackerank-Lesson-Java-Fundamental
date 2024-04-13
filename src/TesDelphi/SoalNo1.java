package TesDelphi;

import java.util.ArrayList;
import java.util.List;

public class SoalNo1 {


    public static void bilanganPrima(Integer in) {

        List<Integer> result = new ArrayList<>();
        for (Integer i = 2; i <= in; i++) {

            Integer temp = 0;
            for (Integer j = 1; j < in; j++) {

                if (i % j == 0) {
                    temp++;
                }
            }

            if (temp < 3) {
                result.add(i);
            }

        }
        System.out.println(result);

    }

    public static void main(String[] args) {

        SoalNo1.bilanganPrima(100);

    }
}
