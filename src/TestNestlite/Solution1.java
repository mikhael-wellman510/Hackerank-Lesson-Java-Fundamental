package TestNestlite;

public class Solution1 {

    public static String convertToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();


        while (decimal > 0) {
            int remainder = decimal % 2; // Sisa pembagian dengan 2
            binary.insert(0, remainder); // Sisipkan sisa ke depan string biner
            decimal /= 2; // Bagi bilangan desimal dengan 2
        }

        // Mengembalikan string biner
        return binary.toString();
    }
    public static void main(String[] args) {
        int decimal = 222; // Bilangan desimal yang akan dikonversi
        String binary = Solution1.convertToBinary(decimal);
        System.out.println("Bilangan biner untuk " + decimal + " adalah: " + binary);
    }
}
