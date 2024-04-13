package Logic2;

public class Fibonacci {
    public static void main(String[] args) {
        int jumlah = 10 ;

        int a = 0 ;
        int b = 1 ;
        for (int i = 0 ; i < jumlah ; i++){
            if (i == 0){
                System.out.print(b + " ");
            }
            int hasil = a + b;
            System.out.print(hasil + " ");

            a= b ;
            b = hasil;
        }
    }
}
