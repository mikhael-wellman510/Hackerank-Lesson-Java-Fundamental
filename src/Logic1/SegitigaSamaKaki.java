package Logic1;

public class SegitigaSamaKaki {
    public static void main(String[] args) {
        int batas = 5;

        for (int i = 0 ; i < batas ; i++){
            for (int j = 0 ; j < batas - i ; j++ ){
                System.out.print(" ");
            }
            for (int k = 0 ; k < i ; k++){
                System.out.print(" *");
            }
            System.out.print("\n");
        }

        for (int a = 0 ; a< batas ; a++){
            for (int c = 0 ; c < a ; c++ ){
                System.out.print(" ");
            }
            for(int b = batas ; b > a ; b--){
                System.out.print(" *");
            }

            System.out.print("\n");
        }
    }
}
