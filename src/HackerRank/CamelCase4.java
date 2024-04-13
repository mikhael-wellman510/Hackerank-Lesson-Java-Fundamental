package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class CamelCase4 {

    public static void solution(String word){
        String [] kata = word.split(";" );

        String cek = kata[0].concat(kata[1]);
        if (cek.equals("SM")){
           String words = kata[kata.length -1];

           String result = "";
           for (Integer i = 0 ; i < words.length() ; i++){
               char ch = words.charAt(i);

               if (!Character.isAlphabetic(ch)){
                   continue;
               } else if (!Character.isUpperCase(ch)){
                result = result + ch;
               }else if (Character.isUpperCase(ch)){
                   result = result + " " + Character.toLowerCase(ch);
               }


           }
            System.out.println(result);

        } else if (cek.equals("CV")) {
            String words = kata[kata.length-1];
            String result = "";
            for (Integer i = 0 ; i < words.length() ; i++){
                char ch = words.charAt(i);
                if (String.valueOf(ch).equals(" ")){

                    result =result + Character.toUpperCase(words.charAt(i+1));
                    i++;
                }else{
                    result =result +ch;
                }

            }
            System.out.println(result);
        } else if (cek.equals("CC")) {
            String words = kata[kata.length -1];
            String result = "";
            for (Integer i = 0 ; i < words.length() ; i++){
                char ch = words.charAt(i);

                if (i == 0){
                    result = result + Character.toUpperCase(ch);
                }
                else if (String.valueOf(ch).equals(" ")){
                    result = result + Character.toUpperCase(words.charAt(i+1));
                    i++;
                }else {
                    result = result +ch;
                }
            }
            System.out.println(result);
        }else if (cek.equals("SC")){
            String words = kata[kata.length -1];

            String result = "";

            for (Integer i = 0 ; i < words.length() ; i++){
                char ch = words.charAt(i);

                if (i == 0 ){
                    result = result + Character.toLowerCase(ch);
                } else if (Character.isUpperCase(ch)) {
                    result = result + " "  + Character.toLowerCase(ch);
                }else {
                    result = result + ch;
                }
            }
            System.out.println(result);
        }else if (cek.equals("CM")){
            String words = kata[kata.length -1];
            String result = "" ;

            for (Integer i = 0 ; i < words.length() ; i++){
                char ch = words.charAt(i);
                if (String.valueOf(ch).equals(" ")){
                    result = result + Character.toUpperCase(words.charAt(i+1));
                    i++;
                }else if (i  == words.length() - 1){
                    result = result + ch + "()";
                }else {
                    result =result +ch;
                }
            }
            System.out.println(result);
        }else {
            String words = kata[kata.length -1];
            String result = "";
            for (Integer i = 0 ; i < words.length(); i++){
                char ch = words.charAt(i);
                if (Character.isUpperCase(ch)){
                    result = result + " " + Character.toLowerCase(ch);
                }else {
                    result =result + ch;
                }
            }
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()){
            System.out.println("Input Word");
            String word = in.nextLine();
            if (word.isEmpty()){
                break;
            }
            CamelCase4.solution(word);
        }


        String kata = "Looping";
        for (Integer i = 0 ; i < kata.length() ; i++){
            char ch = kata.charAt(i);
            if (Character.isUpperCase(ch)){
                System.out.println(ch);
            } else if (Character.isLowerCase(ch)) {
                System.out.println(ch);
            }
        }


    }
}
