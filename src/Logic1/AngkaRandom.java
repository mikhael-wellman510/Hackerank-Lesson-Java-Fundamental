package Logic1;

import java.util.Random;

public class AngkaRandom {
    public static void main(String[] args) {
        Random  angkaRandom = new Random();

        // Membuat angka random maksimal 100 ;
        int kelipatan = (angkaRandom.nextInt(20) + 1) * 5;
        System.out.println(kelipatan);
        for (int i = 0 ; i < 5 ; i++){
            int random = (angkaRandom.nextInt(20) +1 ) * 5;
            if (random <= 60 ){
                System.out.println(random + " : Kurang");
            } else if (random > 60 && random <=70) {
                System.out.println(random + " : Cukup");
            } else if (random >70 && random <=80) {
                System.out.println(random + " : Baik");
            }else if (random > 80){
                System.out.println(random + " : Luar Biasa");
            }

        }


    }
}
