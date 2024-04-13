package TesNutrifood;

import java.util.Arrays;

public class Solution5 {

    public Solution5() {
    }

    void cekPalindrome(String kata){

        String [] arrKata = kata.split("");

        for (Integer i = 0 ; i < arrKata.length ; i++){
            for (Integer j = i+1 ; j < arrKata.length ; j++){
                String temp = arrKata[i];
                arrKata[i]= arrKata[j];
                arrKata[j] = temp;
            }
        }

        if (kata.equals(String.join("",arrKata))){
            System.out.println("Palindrome");
        }else {
            System.out.println("Bukan Palindrome");
        }
    }

    public static void main(String[] args) {
        Solution5 tes = new Solution5();
        tes.cekPalindrome("katak");
    }
}
