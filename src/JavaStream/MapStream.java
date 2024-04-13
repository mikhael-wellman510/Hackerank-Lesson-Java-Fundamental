package JavaStream;

import java.util.List;
import java.util.stream.Stream;

public class MapStream {
    public static void main(String[] args) {

        List<String> nama = List.of("Mikhael" ,"Wellman" ,"Sitorus");

        // Todo -> untuk melakukan suatu manipulasi dan membuat data baru tanpa merubah data aslinya
        Stream<String> data = nama.stream().map(name -> name.toUpperCase());
        data.forEach(datas -> System.out.println(datas));

        // Todo -> Map itu tidak menjalankan stream , hanya menjalankan aksi
        // Todo -> Cara mengalirkan stream nya harus menggunakan for each
        List<String>kota = List.of("Bogor","Jakarta","Depok");

        Stream<String> edit = kota.stream().map(city -> "kota : " + city.toUpperCase());
        edit.forEach(edits -> System.out.println(edits));

    }
}
