package Logic1;

public class Diskon {
    public static void main(String[] args) {
        double bunga = 5;
        double simpanan = 850000;

        int hasil =(int) ((bunga / 100) * simpanan);

        System.out.println("Bunga per-tahun adalah " + hasil);
    }
}
