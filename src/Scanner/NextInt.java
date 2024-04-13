package Scanner;

import java.util.Scanner;

public class NextInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer a = scanner.nextInt();
        Integer b = scanner.nextInt();
        // Todo - > setelah memasukan Integer dan ingin merubah ke String maka harus di bersihkan
        scanner.nextLine();
        System.out.print("Masukan ");
        String c = scanner.nextLine();

        System.out.println("Msukan angka : ");
        Integer e = scanner.nextInt();
        Integer f = scanner.nextInt();

        scanner.nextLine();
        String ha =  scanner.nextLine();


        System.out.println("Hasil A : " + a);
        System.out.println("Hasil B : " + b);
        System.out.println("Hasil C : " + c);
        System.out.println("Hasil E : " + e);
        System.out.println("Hasil F : " + f);
        System.out.println("Hasil Ha : " + ha);
    }
}
