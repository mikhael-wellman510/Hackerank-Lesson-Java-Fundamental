package JavaStream;

import java.util.List;
import java.util.stream.Stream;

public class LazyValuationStream {
    public static void main(String[] args) {

        // Todo -> Ini tidak akan di eksekusi karena intermediate
        // Todo -> tetap harus ada triger untuk mengeksekusi nya

        List<String> nama = List.of("Mikhael","Wellman","Sitorus");

        // Todo -> menggunakan terminal operation
        // Todo -> yaitu forEach

        nama.stream()
                .map(names -> {
                    System.out.println("Change " + names + " To Upercase");
                    return names.toUpperCase();
                })
                .map(names -> {
                    System.out.println("Change " + names + " to City");
                    return "Kota " + names;
                })
                .forEach(val -> {
                    System.out.println("Result : " + val);
                });


        List<String> city = List.of("Bogor" , "Jakarta" , "Depok");

        city.stream()
                .map(kota -> {
                    System.out.println("Kota : " + kota + " To Upper");
                    return kota.toUpperCase();
                    })
                .map(newKota -> {
                    System.out.println("add kota");
                    return "Kota " + newKota;
                }).forEach(val -> {
                    System.out.println(val);
                });





    }
}
