package Logic1;

import java.util.ArrayList;
import java.util.Scanner;

public class BilanganPrimaArray {
    public static void main(String[] args) {
        ArrayList<Integer> prima = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Angka : ");
        int cari = input.nextInt();


        for (int i = 1 ; i < cari ; i++){
            int tampung = 0 ;
            for (int j = 1 ; j<= i; j++){
                if(i % j == 0 ){
                    tampung++;
                }
            }
            if (tampung == 2){
                prima.add(i);
            }
        }

        System.out.println(prima);

    }
}
