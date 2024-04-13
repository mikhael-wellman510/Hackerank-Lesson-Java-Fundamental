package Logic1;

import java.util.Scanner;

public class angkaPositif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan rentang : ");
        int angka = input.nextInt();

        int jumlah = 0;
        for (int i = 0; i < angka; i++) {
            jumlah = jumlah + i;
        }

        // Anda harus membagi jumlah dengan bukan angka
        // untuk mendapatkan rata-rata yang benar.
        // Selain itu, Anda perlu menangani kasus di mana angka = 0
        int rata2 = (angka != 0) ? jumlah / angka : 0;

        System.out.println("Jumlah : " + jumlah);
        System.out.println("Rata2 : " + rata2);

    }
}
