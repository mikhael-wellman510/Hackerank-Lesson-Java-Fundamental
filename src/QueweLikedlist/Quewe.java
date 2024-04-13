package QueweLikedlist;

import java.util.LinkedList;
import java.util.Queue;

public class Quewe {
    public static void main(String[] args) {
        LinkedList<String> antrian = new LinkedList<>();
        antrian.add("Apel");
        antrian.add("Melon");
        antrian.add("Jeruk");
        antrian.add("Semangka");

        // Todo -> Menghapus index paling depan
        antrian.removeFirst();
        System.out.println(antrian);

        // Todo -> Meenghapus index paling belakang
        antrian.removeLast();
        System.out.println(antrian);

        // Todo -> Menambahkan di paling depan
        antrian.addFirst("Rambutan First");

        // Todo -> Menambahkan dari paling belakang
        antrian.addLast("Kelapa Last");

        //Todo -> Data Terdepan
        System.out.println("data terdepan : " + antrian.getFirst());

        //Todo -> Data Terbelakang
        System.out.println("Data Terbelakang : " +  antrian.getLast());

        // Todo -> Mengambil berdasarkan index
        System.out.println("Data  " + antrian.get(2));

        System.out.println(antrian);
        // Todo -> Ukuran
        System.out.println(antrian.size());

        // Todo -> Mencari data;
        if (antrian.contains("Jeruk")){
            System.out.println("Barang ada");
        }else {
            System.out.println("Barang tidak ada");
        }


    }
}
