package JavaStream;

import java.util.List;

public class TransformationOperationStream {
    public static void main(String[] args) {

        // Todo -> jadi ini bisa mengubah tipe data sesuai apa yang kita inginkam

        List<String> data = List.of("Mikhael","Wellman", "Sitorus");

        data.stream()
                .map(nama -> {
                    return nama.toUpperCase();
                })
                .map(nama ->{
                    return nama + " " + nama.length();
                })
                .forEach(val -> System.out.println("Total panjang nama : " +val));

        // Todo -> dari string , bisa juga menjadi integer
    }
}
