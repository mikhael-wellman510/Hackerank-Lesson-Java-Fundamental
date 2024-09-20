package JavaStream;

import java.util.List;

public class FilteringOperation {
    public static void main(String[] args) {
     List<String> name = List.of("Eko","Wellman","Kael","Khaneddy","Sitorus");

     name.stream()
             .filter(names -> names.length() > 4)
             .forEach(val -> System.out.println(val));

     List<String> angka = List.of("1","2","3","4");

     angka.stream()
             .map(num -> {

                return Integer.parseInt(num);
            })
             .filter(num -> num % 2 == 0)
             .forEach(num -> System.out.println(num));
    }
}
