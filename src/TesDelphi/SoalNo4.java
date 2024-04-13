package TesDelphi;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class SoalNo4 {

    public static  void bilanganFibonaci(Integer in){

        BigInteger a = BigInteger.valueOf(1);
        BigInteger b = BigInteger.valueOf(0);

        List<BigInteger> hasil = new ArrayList<>();
        for (Integer i = 1 ; i < in ; i++){
         BigInteger c = a.add(b);
            hasil.add(c);
            b = a;
            a = c ;

        }

        System.out.println(hasil);
    }

    public static void main(String[] args) {

        SoalNo4.bilanganFibonaci(100);
    }
}
