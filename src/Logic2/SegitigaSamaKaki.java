package Logic2;

public class SegitigaSamaKaki {
    public static void main(String[] args) {
        int tinggi = 4;

        for (int i = 1 ; i <= tinggi ; i++){

            for (int j = tinggi ; j >= i ; j--){
                System.out.print(" ");
            }

            for (int k = 1 ; k <= i ; k++){
                System.out.print("*");
            }
            // Ini untuk tambah bintang ke kanan
            for (int l = 1 ; l <= i -1 ; l++){
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }
}
