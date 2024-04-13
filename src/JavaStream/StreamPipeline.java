package JavaStream;

import java.util.List;

public class StreamPipeline {
    public static void main(String[] args) {
        List<String> name = List.of("Mikhael","Wellman","Sitorus");

        name.stream()
                .map(nama -> nama.toUpperCase())
                .map(newName -> "mr " + newName )
                .forEach(names -> System.out.println(names));
    }
}
