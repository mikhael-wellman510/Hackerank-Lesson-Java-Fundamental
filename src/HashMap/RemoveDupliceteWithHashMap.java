package HashMap;

import java.util.HashMap;
import java.util.Map;

public class RemoveDupliceteWithHashMap {
    public static void main(String[] args) {

        String data = "arrrrrronnramsseyyy";

        Map<String,Integer> cek = new HashMap<>();

        for (char a : data.toCharArray()){
            cek.put(String.valueOf(a), cek.getOrDefault(String.valueOf(a), 0)+1);
        }

        for (Map.Entry<String,Integer> res : cek.entrySet()){
            System.out.println(res.getKey());
        }

    }
}
