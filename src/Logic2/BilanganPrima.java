package Logic2;

import java.util.ArrayList;
import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan berapa jumlah yg mau di cari : " );
        int jumlah = input.nextInt();

        ArrayList<Integer> hasil = new ArrayList<Integer>();
        for (int i = 1 ; i < jumlah ; i++){
            int temp = 0;
            for (int j = 1 ; j <= i ; j++){
                if (i % j == 0){
                    temp++;
                }
            }
            if (temp == 2){
                hasil.add(i);
            }
        }

        System.out.println(hasil);
    }
}
