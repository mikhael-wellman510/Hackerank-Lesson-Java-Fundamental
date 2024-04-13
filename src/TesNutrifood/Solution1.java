package TesNutrifood;

import java.util.Arrays;

public class Solution1 {
    public Solution1() {
    }

    public void hitungPanjang(){
        String word = "Halo,nama saya Jhon Dhoe";
        String replace = word.replaceAll("[^A-Za-z]+"," ");
        String [] result = replace.split(" ");

        // Todo -> Hasil nya
        System.out.println("total panjang : "  + result.length);
    }
    public static void main(String[] args) {
        Solution1 cek = new Solution1();
        cek.hitungPanjang();
    }
}
