package HashMap;

import java.util.HashMap;
import java.util.Map;

public class RemoveHashMap {
    public static void main(String[] args) {
        Map<Integer , String> days = new HashMap<>();
        days.put(1, "Senin");
        days.put(2, "selasa");
        days.put(3,"rabu");
        days.put(4,"kamis");

        days.remove("hapus hari selasa : " + days.remove(2));

        System.out.println(days);
    }
}
