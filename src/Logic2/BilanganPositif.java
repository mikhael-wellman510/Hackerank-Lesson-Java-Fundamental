package Logic2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BilanganPositif {
    public static void main(String[] args) {
        System.out.print("Masukan Angka: ");
        Scanner input = new Scanner(System.in);

        int rentang = input.nextInt();
        ArrayList<Integer> hasilBilanganPositif = new ArrayList<Integer>();
        int jumlah =0;
        for (int i = 0 ; i <= rentang ; i++){
            if(i >= 1){
              hasilBilanganPositif.add(i);
              jumlah = jumlah + i;
            };
        }

        int rataRata = jumlah / hasilBilanganPositif.size();
        System.out.println(hasilBilanganPositif);
        System.out.println("Hasil Rata2 : " + rataRata);



    }
}
