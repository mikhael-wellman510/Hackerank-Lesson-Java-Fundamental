package InterfaceHackerank;

import java.util.Scanner;



class MyCalculator implements AdvanceArithmetic{


    @Override
    public Integer divisor_sum(Integer n) {

        Integer total = 0;
        for (Integer i = 1 ; i <= n ; i++){
            if (n % i == 0){
                total = total + i;
            }
        }

        return total;
    }
}
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("I implemented: AdvanceArithmetic");
        MyCalculator myCalculator = new MyCalculator();
        System.out.println( myCalculator.divisor_sum(sc.nextInt()));

    }
}
