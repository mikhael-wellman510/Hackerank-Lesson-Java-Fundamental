package HackerRank.TesFibbo;

import java.util.*;

public class Anagram {
    public static List<List<String>> solution(String[] anagram) {
        Map<String, List<String>> map = new HashMap<>();

        // Membuat hashmap untuk mengelompokkan kata-kata yang merupakan anagram
        for (String word : anagram) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            map.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
        }

        // Mengembalikan nilai-nilai (grup kata yang merupakan anagram) dari hashmap
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] arrAnagram = {"kita", "atik", "tika", "aku", "kia", "makan", "kua"};
        List<List<String>> result = Anagram.solution(arrAnagram);
        System.out.println(result);
    }
}
