package Scanner;

import java.util.Scanner;

public class Next {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Todo - >  Kalo next hanya 1 kata saja
        // Exe - > Saya Cinta Java
        // Output nya -> Saya Cinta
        // Karena dia hanya membaca 1 kata saja
        String a = scanner.next();
        String b = scanner.next();

        System.out.println("Hasil a : " + a);
        System.out.println("Hasil b : " + b);


    }
}
