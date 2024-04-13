package Logic2;

import java.util.HashMap;

public class HitungWord {
    public static void main(String[] args) {
        String teks = "aku seorang bajak laut di tengah laut Somalia, sedang merompak kapal para penjajah Afrika. Namun aku takut dengan seorang penjajah dari Afrika keturunan India.";

        // Memproses teks dan mendapatkan kata-kata
        String[] kataKata = teks.toLowerCase().split("\\W+");

        // Menghitung jumlah kemunculan kata-kata menggunakan HashMap
        HashMap<String, Integer> jumlahKemunculan = new HashMap<>();
        for (String kata : kataKata) {
            jumlahKemunculan.put(kata, jumlahKemunculan.getOrDefault(kata, 0) + 1);
        }

        // Temukan kata dengan kemunculan terbanyak
        String kataTerbanyak = temukanKataTerbanyak(jumlahKemunculan);

        // Tampilkan hasil
        System.out.println("Jumlah kemunculan kata:");
        for (String kata : jumlahKemunculan.keySet()) {
            System.out.println(kata + " : " + jumlahKemunculan.get(kata));
        }

        System.out.println("\nKata terbanyak: " + kataTerbanyak);
    }
    public static String temukanKataTerbanyak(HashMap<String, Integer> map) {
        String kataTerbanyak = null;
        int maksKemunculan = 0;

        for (String kata : map.keySet()) {
            int kemunculan = map.get(kata);
            if (kemunculan > maksKemunculan) {
                maksKemunculan = kemunculan;
                kataTerbanyak = kata;
            }
        }

        return kataTerbanyak;
    }

}
