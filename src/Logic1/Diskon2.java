package Logic1;

public class Diskon2 {
    public static void main(String[] args) {
        double hargaSepatu = 165000;
        double diskon = 15;
        double uang = 150000;

        double totalDiskon = (diskon/100) * hargaSepatu ;
        double totalHarga = hargaSepatu - totalDiskon ;
        int kembalian =(int) (uang - totalHarga) ;


        System.out.println(kembalian);
    }
}
