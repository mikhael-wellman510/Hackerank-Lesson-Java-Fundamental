package HackerRank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;




public class JavaComparator {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer length = sc.nextInt();



        Integer [] num = new Integer[length];
        String [] hasil = new String[length];

        sc.nextLine();
        for (Integer i = 0 ; i < length ; i++){

            System.out.println("Masukan Nama : ");
            String names = sc.nextLine();

            String [] datas = names.split(" ");
            System.out.println(Arrays.toString(datas));


            Integer curr = 0 ;
            for (Integer j = 0 ; j < i ; j++){
                if (curr == 0){
                    num[0] = Integer.parseInt(datas[1]) ;
                    hasil[0] = names;
                    System.out.println("Nol");
                    curr++;
                }else {

                    if (num[j] < Integer.parseInt(datas[1]) ){
                        num[j]= Integer.parseInt(datas[1]);
                        hasil[j] = names;
                        num[i] = num[j];
                        hasil[i] = hasil[j];
                        System.out.println("hehe <");
                    }else {
                        num[i] = Integer.parseInt(datas[1]);
                        hasil[i] = names;
                        System.out.println("hehe >");
                    }
                }
            }



        }
        System.out.println("Tes : " + Arrays.toString(num));
        System.out.println("Tes : " + Arrays.toString(hasil));



    }
}
