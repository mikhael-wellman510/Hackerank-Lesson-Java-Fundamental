package Logic2;

import java.util.Arrays;
import java.util.Scanner;

public class Bamboo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bamboo : ");
        String bambo = input.next();

        String [] bamboArr = bambo.split("");

        System.out.print("Cuts : " );
        int cuts = input.nextInt();

        System.out.println("Initials :");

        int temp = 0;
        while (cuts >= 0 ){

            for (int i = 0 ; i < bamboArr.length ; i++){
                System.out.print("|");
                for (int j = 0 ; j < Integer.parseInt(bamboArr[i] ) - temp ; j++){
                    System.out.print("-");

                }
                System.out.println();
            }
            System.out.println("Cycle cuts : " + cuts);
            temp++;
            cuts--;

        }
        System.out.println(Arrays.toString(bamboArr));
    }
}
