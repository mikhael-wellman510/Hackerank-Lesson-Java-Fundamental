package HashMap;

import java.util.HashMap;

public class ReplaceHasMap {
    public static void main(String[] args) {
        HashMap<Integer ,String> month = new HashMap<>();
        month.put(1, "Januari");
        month.put(2, "februari");

        System.out.println(month);
        // Todo -> Mengubah / Mengedit

        month.replace(2,"mei");
        System.out.println(month);
        month.replace(3,"desember");
        System.out.println(month);


    }
}
