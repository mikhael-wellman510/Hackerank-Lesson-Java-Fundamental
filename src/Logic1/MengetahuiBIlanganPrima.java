package Logic1;

import java.util.Scanner;

public class MengetahuiBIlanganPrima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("MAsukan yang mau kamu cek : ");
        int cek = input.nextInt();
        int temp = 0;

        for (int i = 2 ; i <= cek ; i++){
            if(cek % i == 0 ){
                temp++;
            }
        }

        if(temp <=2){
            System.out.println(" Ini adalah Prima");
        }else{
            System.out.println("Bukan prima");
        }


    }
}
