package HackerRank.TesFibbo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Annagrams {

    public static void solution(String [] anagram){

        List<List<String>> result= new ArrayList<>();

      for (Integer i = 0 ; i < anagram.length ;i++){
          char[]char1 = anagram[i].toCharArray();
          Arrays.sort(char1);
            List<String> data = new ArrayList<>();


          for (Integer j = i ; j < anagram.length ; j++){
                char[] char2 = anagram[j].toCharArray();
                Arrays.sort(char2);
                if (Arrays.equals(char1,char2)){
                    data.add(anagram[j]);

                }
          }

          if (result.isEmpty()){
              result.add(data);
          } else if (!result.get(0).containsAll(data)) {
              result.add(data);
          }

      }
        System.out.println(result);
    }
    public static void main(String[] args) {
        String [] arrAnagram = {"kita","atik" ,"tika" , "aku","kia" ,"makan" ,"kua"};

        Annagrams.solution(arrAnagram);



    }
}
