package HashMap;

import java.util.HashMap;
import java.util.Map;

public class GetHashMap {
    public static void main(String[] args) {
        Map<Integer , String> days = new HashMap<>();
        days.put(1, "Senin");
        days.put(2, "selasa");
        days.put(3,"rabu");
        days.put(4,"kamis");

        System.out.println(days.get(1));
        System.out.println("Mengambil hari ke dua " +  days.get(2));
    }
}
