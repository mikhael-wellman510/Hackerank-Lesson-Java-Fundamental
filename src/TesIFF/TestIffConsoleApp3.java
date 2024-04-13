package TesIFF;

public class TestIffConsoleApp3 {
    public static void main(String[] args) {
        Integer x = 5;
        Integer y = 4;

        System.out.println("Hasil X awal : " + x);
        System.out.println("Hasil X akhir : " + y);

        x = x + y;
        y = x - y ;
        x = x - y ;

        System.out.println("Hasil x : " + x);
        System.out.println("Hasil y : " + y);
    }
}
