package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Braces {
    public static String isBalanced(String s){
        if (s.isBlank()){
            return null;
        }
        String [] nama = s.split("");



        Integer data1 = 0; // (
        Integer data2 = 0; // {
        Integer data3 = 0;  // )
        Integer data4 = 0; // }

        for (Integer i = 0 ; i < nama.length ; i++){
                if ("(".equals(nama[i])){
                    data1++;
                }else if ("{".equals(nama[i])){
                    data2++;
                } else if (")".equals(nama[i])) {
                    data3++;
                } else if ("}".equals(nama[i])) {
                    data4++;
                }
        }


        if (data1 == data3 && data2 == data4){
            return "true";
        }else {
            return "false";
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Braces.isBalanced("({){}()})(");

    }
}
