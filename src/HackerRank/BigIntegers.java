package HackerRank;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        BigInteger bigInteger = sc.nextBigInteger();
        BigInteger bigInteger1 =sc.nextBigInteger();

        BigInteger b = bigInteger.add(bigInteger1);
        BigInteger a = bigInteger.multiply(bigInteger1);

        System.out.println(b);
        System.out.println(a);
    }
}
