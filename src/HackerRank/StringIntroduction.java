package HackerRank;

import java.util.Scanner;

public class StringIntroduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        String [] arrA = a.split("");
        String [] arrB = b.split("");
        String resA = "";
        String wordA ="";
        for (Integer i = 0 ; i < arrA.length ; i++){
            if (i == 0){
                resA += arrA[i].toUpperCase();
                wordA += arrA[i];
            }else {
                resA += arrA[i];
            }

        }

        String resB = "";
        String wordB = "";

        for (Integer i = 0 ; i < arrB.length ; i++){
            if (i == 0){
                resB += arrB[i].toUpperCase();
                wordB += arrB[i];
            }else {
                resB += arrB[i];
            }

        }
        char valB = wordA.charAt(0);
        char valA = wordB.charAt(0);

        int aa = (int)valA;
        int bb = (int)valB;

        System.out.println(resA.length()+resB.length());
        if (aa < bb){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        System.out.print(resA  + " " +  resB);

    }
}
