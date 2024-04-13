package Logic1;

import java.util.Arrays;

public class UrutkanHuruf {
    public static void main(String[] args) {
        String [] buah = {"Pisang" ,"Apel" , "Nangka" , "Durian" , "Semangka"};

        // Gunakan Logic1.Method short
        Arrays.sort(buah);
        System.out.println(buah);
        // Untuk mengambil dari array
        System.out.println(Arrays.toString(buah));
        // untuk mengeluarkan
        for (String hasil : buah){
            System.out.println( hasil);

        }
    }
}
