package JavaStream;

import java.util.Arrays;
import java.util.stream.Stream;

public class forEachStream {
    public static void main(String[] args) {

        Stream<String> data = Stream.of("Mikhael" , "Wellman" , "Sitorus");
        data.forEach(item -> System.out.println(item));

        Stream<Integer> angka = Stream.of(1,2,3,4,5,6);
        angka.forEach(datas -> System.out.println(datas));

        String [] nama = {"Deni","Hargo","Santoso"};
        Stream<String> arr = Arrays.stream(nama);
        arr.forEach(arrs-> System.out.println(arrs));

    }
}
