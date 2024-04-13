package Logic1;

import java.util.ArrayList;

public class exArray {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<String>();

        // Ini untuk menambahkan ke array
        nama.add("Mikhael");
        nama.add("Andre");
        nama.add("Julian");

        // Untuk mengambil
        String cari = nama.get(0);

        // Ganti Item
        nama.set(1,"Prabowo");

        // Hapus Item
        nama.remove(2);

        //LEngth atau panjang nya
        System.out.println(nama);
        System.out.println(nama.size());
    }
}
