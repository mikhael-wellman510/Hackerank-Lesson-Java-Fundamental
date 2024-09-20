package HackerRank;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReapetedString {

    public static long reapetedString(String n , long repeat){


        long totalA  = 0 ; // 2
        for (char a : n.toCharArray()){
            if (a == 'a'){
                totalA++;
            }
        }
        long x = repeat / n.length() ;
        long cek = (x * totalA) ;

        long sisa = 0 ;
        for (int i = 0 ; i < repeat % n.length() ; i++ ){
            if (n.charAt(i) == 'a'){
                sisa++;
            }
        }
        return cek + sisa;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        String n = sc.nextLine();
        long repeat = sc.nextLong();

        System.out.println(reapetedString(n , repeat));

    }
}
