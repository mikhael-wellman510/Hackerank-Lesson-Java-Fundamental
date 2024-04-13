package Logic2;

import java.util.Random;

public class AngkaRandom {
    public static void main(String[] args) {
        // Buat bilangan random kelipatan 5 (Contoh 15, 10 , 5, 25, 30,45)
        // Buat 5x
        Random angka = new Random();


        int jumlahLoop = 5;

        for (int i = 0; i < jumlahLoop; i++) {

            int angkaRandom = ((angka.nextInt(20) + 1) * 5);
            if (angkaRandom < 60) {
                System.out.println("less then 60");
            } else if (angkaRandom >= 60 && angkaRandom < 80) {
                System.out.println("More than 60");
            } else if (angkaRandom >= 80 && angkaRandom < 90) {
                System.out.println("More than 80");
            } else {
                System.out.println("Nilai tertinggi");
            }

        }


    }
}
