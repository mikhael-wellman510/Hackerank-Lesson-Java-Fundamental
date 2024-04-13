package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class SubstringsComparation {

    public String smallest(String word ,Integer length ){

        String [] data = word.split("");

        Integer [] num = new Integer[data.length];
        for (Integer i = 0 ; i < word.length() ; i++){
            char a = word.charAt(i);
            num[i] = (int)a;
        }

        for (Integer j = 0 ; j < num.length ;j++){
            for (Integer a = j+1 ; a < num.length ; a++){
                if (num[j] >= num[a]){
                    Integer temp = num[j];
                    num[j] = num[a];
                    num[a] = temp;
                }
            }
        }

        Integer indexA = 0;

        for (Integer x = 0 ; x < num.length ; x++){
            char a = word.charAt(x);
            int idx = (int) a;
            if (num[0] == idx){

             indexA = x;

                break;
            }
        }

        String result = "" ;
        for (Integer i = 0 ;  i < length ; i++){
            result = result + data[indexA];
            indexA++;
        }



        return result;
    }

    public String largest(String word ,Integer length ){
        String [] data = word.split("");

        Integer [] num = new Integer[data.length];
        for (Integer i = 0 ; i < word.length() ; i++){
            char a = word.charAt(i);
            num[i] = (int)a;
        }

        for (Integer j = 0 ; j < num.length ;j++){
            for (Integer a = j+1 ; a < num.length ; a++){
                if (num[j] <= num[a]){
                    Integer temp = num[j];
                    num[j] = num[a];
                    num[a] = temp;
                }
            }
        }

        Integer indexA = 0;

        for (Integer x = 0 ; x < num.length ; x++){
            char a = word.charAt(x);
            int idx = (int) a;
            if (num[0] == idx){

                indexA = x;

                break;
            }
        }

        String result = "" ;
        for (Integer i = 0 ;  i < length ; i++){
            result = result + data[indexA];
            indexA++;
        }



        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        SubstringsComparation word = new SubstringsComparation();

        System.out.println("Masukan kata");
        String kata = in.nextLine();

        System.out.println("Masukan length : ");
        Integer length = in.nextInt();

        System.out.println(  word.largest(kata ,length));
        System.out.println( word.smallest(kata , length));


    }
}
