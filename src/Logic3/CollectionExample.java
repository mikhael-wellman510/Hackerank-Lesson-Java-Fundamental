package Logic3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        List<String> name =  new ArrayList<>();
        name.add("Andre");
        name.add("ikhsan");
        name.add("barry");
        name.add("dedi");
        System.out.println(name);

        Collections.sort(name);
        System.out.println(name);
    }
}
