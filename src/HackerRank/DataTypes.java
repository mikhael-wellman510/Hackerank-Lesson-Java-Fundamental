package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class DataTypes {

    public static void cek(String datas){

        try{
            Long data = Long.parseLong(datas);

            if (data < Short.MAX_VALUE && data > Short.MIN_VALUE){
                System.out.println(data + " can be fitted in:");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            } else if (data < Integer.MAX_VALUE && data > Integer.MIN_VALUE) {
                System.out.println(data + " can be fitted in:");
                System.out.println("* int");
                System.out.println("* long");
            } else if (data < Long.MAX_VALUE && data > Long.MIN_VALUE) {
                System.out.println(data + " can be fitted in:");
                System.out.println("long");
            }
        }catch (Exception e){
            System.out.println(datas + " can't be fitted anywhere.");
        }


    }

    public static void main(String[] args) {



            Scanner in = new Scanner(System.in);

            System.out.println("Masukan total : ");
            Integer a = in.nextInt();
            in.nextLine();
            for (Integer i = 0 ; i < a ; i++){
                String data = in.nextLine();
                DataTypes.cek(data);

            }






    }
}
