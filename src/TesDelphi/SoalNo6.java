package TesDelphi;

public class SoalNo6 {
    public static void main(String[] args) {
        double a = 165000;
        double b = 15;
        double bayar =150000;

        double discon = (a / 100 ) * b;

        double hasil = bayar - (a - discon)   ;
        System.out.println(hasil);
    }
}
