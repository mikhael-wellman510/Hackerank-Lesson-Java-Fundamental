package Logic1;

import java.util.Scanner;

public class CariAngkaGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("rentang angka Genap : ");
        int rentang = input.nextInt();


        for (int i = 1 ; i <= rentang ; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
