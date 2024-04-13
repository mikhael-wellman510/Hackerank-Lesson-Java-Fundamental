package Logic1;

public class Gross {
    public static void main(String[] args) {
        int gross = 144;
        int lusin = 12;
        int sewaPiring = 6 * gross;
        int tioPinjam = 4 * lusin;
        int david = 2 * gross;
        int hasil =  sewaPiring - tioPinjam - david;
        System.out.println("Sisa Piring : " + hasil);
    }
}
