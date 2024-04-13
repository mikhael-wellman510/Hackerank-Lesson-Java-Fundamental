package Logic1;

public class BelahKetupat {
    public static void main(String[] args) {
        int lebar = 5;

        for (int i = 1 ; i <= lebar ; i++){
            for (int j = 1 ; j <= lebar - i ; j++){
                System.out.print(" ");
            }
            for (int k = 1 ; k <= i ; k++){
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int a = 1 ; a < lebar ;a++){
            for (int b = 1 ; b <= a ; b++ ){
                System.out.print(" ");
            }
            for (int c = 1 ; c<= lebar-a ; c++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
