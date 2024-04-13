package Logic1;

import java.util.Arrays;

public class cariBilanganGanjil {
    public static void main(String[] args) {
        int[] angka = {123,40,33,124,266,657,345,11,14};

        //Cari bilangan ganjil

        for (int i = 0 ; i < angka.length ; i++){
            if(angka[i] % 2 == 1 && angka[i] > 100){
                System.out.print(angka[i]+ " ");
            }
        }


        System.out.println("------ Pakai While ------");

        int[] angkaRandom = {23,122,347,433,234,12,199,34,134};
        int [] tampung = new int[angkaRandom.length];
        int batas = 0 ;
        while (batas < angkaRandom.length){
            if(angkaRandom[batas] % 2 == 1 && angkaRandom[batas] > 100){
                tampung[batas] = angkaRandom[batas];
            }
            batas++;
        }

        System.out.println(Arrays.toString(tampung));

    }
}
