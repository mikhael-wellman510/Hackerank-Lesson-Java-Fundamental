package JavaStream;

import java.util.List;

public class DistincStream {
    public static void main(String[] args) {


       // Todo -> Distinc untuk menghilangkan duplikat
       List<String> duplicate = List.of("Mike","Wellman","Sitorus","Siregar","Mike","Siregar","Sitorus");

       duplicate.stream()
               .distinct()
               .forEach(val -> System.out.println(val));

       duplicate.stream()
               .distinct()
               .map(val -> {
                   return val.toUpperCase();
               })
               .filter(val -> val.length() > 4)
               .forEach(val -> System.out.println(val));

    }
}
