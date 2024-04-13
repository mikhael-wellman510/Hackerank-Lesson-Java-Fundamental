package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DuplicateWords {



    public void cekDuplicate(String name){



        String [] word = name.split(" ");



        List<String> kata = new ArrayList<>();

        String result = "" ;
        for (Integer i = 0; i < word.length ; i++){

            if (kata.isEmpty()){
                kata.add(word[i].toLowerCase());
                result = result +  word[i] + " ";
            } else if (!kata.contains(word[i].toLowerCase())) {
                if (i < word.length){
                    kata.add(word[i].toLowerCase());
                    result =result +word[i] + " ";
                }else {
                    kata.add(word[i].toLowerCase());
                    result =result +word[i] ;
                }


            }
        }

        System.out.println(result);
        System.out.println(kata);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        DuplicateWords dw = new DuplicateWords();

        dw.cekDuplicate(word);
    }
}
