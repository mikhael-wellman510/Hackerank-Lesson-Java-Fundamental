package Logic2;

public class Diskon {
    public static void main(String[] args) {
        double diskon = 5d;
        double harga = 100000;

        double potongan = (diskon / 100) * harga;
        int hasil = (int) (harga - potongan);
        System.out.println(hasil);
    }
}
