package Logic1;

import java.util.ArrayList;
import java.util.Scanner;

public class LatihanArrayList {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        System.out.print("Berapa yang mau di tembahkan : ");
        int total = input.nextInt();

        System.out.println("Masukan nama : ");
        for (int i = 0 ; i < total ; i++){
            nama.add(input.next());
        }



        // Untuk Mengeluarkan nya dari Array list
        System.out.print("Berhasil Di tambahkan : ");
        for (String kumpulan : nama){
            System.out.print(kumpulan + " ");
        }
    }
}
