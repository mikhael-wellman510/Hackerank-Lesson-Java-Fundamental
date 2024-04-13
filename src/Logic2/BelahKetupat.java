package Logic2;

public class BelahKetupat {
    public static void main(String[] args) {

        // Membuat belah ketupat menggunakan 2 segitiga sama kaki
        int tinggiAtas = 4;
        int tinggiBawah = 5;

        // Segitiga
        for (int i = 1 ; i <= tinggiAtas ; i++ ){

            for (int j = 4 ; j >= i ; j--){
                System.out.print(" ");
            }
            for (int k = 1 ; k <= i ; k++){
                System.out.print("*");
            }
            for (int l = 1 ; l <= i-1 ;l++){
                System.out.print("*");
            }
            System.out.println();

        }

        // Segitiga kebalik
        for (int a = 1 ; a <= tinggiBawah ; a++){
            // Jangan pakai <= , karena dia tidak mentok
            for (int d = 1 ; d < a ; d++){
                System.out.print(" ");
            }
            for (int b = tinggiBawah ; b >= a ; b--){
                System.out.print("*");
            }
            for (int c = tinggiBawah ; c >= a+1; c-- ){
                System.out.print("*");
            }

            System.out.print("\n");

        }

    }
}
