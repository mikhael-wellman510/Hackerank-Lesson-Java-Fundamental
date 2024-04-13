package Logic2;

public class SegitigaKebalik {
    public static void main(String[] args) {
        int tinggi = 10 ;

        for (int i = 0 ; i < tinggi ; i++){
            for (int j = 0 ; j <  i ; j++){
                System.out.print(" ");
            }
            for (int k = 0 ; k <= tinggi - (i * 2)  ; k++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
