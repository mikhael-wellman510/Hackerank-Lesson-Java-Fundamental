package JavaStream;

import java.util.Arrays;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {

        Stream<String> emptyStream = Stream.empty();

        String data = null;
        Stream<String> streamNull = Stream.ofNullable(data);

        Stream<String> streamString = Stream.of("Mikhel" , "Wellman" , "Sitorus");

        Stream<Integer> streamInteger = Stream.of(1,2,3,4,5,6,7);

        Stream<String> streamArrays = Arrays.stream(new String[]{"Mikhael" , "Wellman" , "Sitorus"});

    }
}
