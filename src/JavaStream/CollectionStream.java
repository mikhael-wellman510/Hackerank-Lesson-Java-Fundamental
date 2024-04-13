package JavaStream;

import java.util.List;

public class CollectionStream {
    public static void main(String[] args) {
        List<String> name = List.of("Mikhael" ,"Wellman" ,"Sitorus");
        name.stream().forEach(nama -> System.out.println(nama));
    }
}
