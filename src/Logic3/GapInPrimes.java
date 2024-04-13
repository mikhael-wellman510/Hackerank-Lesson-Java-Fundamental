package Logic3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GapInPrimes {
    public static long[] gap(int g , long m , long n){


        int length = 0;
        long [] resultPrime = new long[length];

        for (long i = m ; i <= n ; i++){
            long temp = 0;

            for (long j = 1 ; j <= m ; j++){
                if (i %  j == 0){
                    temp++;
                }
            }

            if (temp < 2){
                // Todo -> Coppy Arrays
                long [] copyArr = Arrays.copyOf(resultPrime,length+1);
                copyArr[length] = i;
                resultPrime =copyArr;
                length++;

            }
        }

        // Todo -> Cek rentang
        int lengtResult = 0;

        long [] hasil = new long[lengtResult];
        for (int i = 0 ; i < resultPrime.length - 1 ; i++){
            if (resultPrime[i+1] - resultPrime[i] == g ){
                long [] copyArr = Arrays.copyOf(hasil ,lengtResult+2);
                copyArr[lengtResult] = resultPrime[i];
                copyArr[lengtResult +1] = resultPrime[i+1];
                  hasil=copyArr;
                break;

            }

        }
        if (hasil.length == 0){
            return null;
        }

        return hasil;


    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(GapInPrimes.gap(2,10,30 )));

    }
}
