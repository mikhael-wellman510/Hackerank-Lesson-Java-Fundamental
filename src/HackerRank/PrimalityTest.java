package HackerRank;

import java.util.Scanner;

public class PrimalityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer num = scanner.nextInt();
        Integer total  = 0;
        for (Integer i = 1 ; i < num ; i++){

            if (num % i == 0){
                total = total + 1;
            }


        }
        if (total > 3){
            System.out.println("Not Prime");
        }else {
            System.out.println("prime");
        }

    }
}
