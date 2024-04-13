package Logic1;

public class SegitigaKebalik1 {
    public static void main(String[] args) {
        int tinggi = 5 ;

        for(int i =0 ; i < tinggi ; i++){
            for (int j = 5 ; j > i ; j-- ){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
