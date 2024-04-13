package Logic1;

public class SegitigaKebalik2 {
    public static void main(String[] args) {
        int batas = 5 ;

        for (int i = batas; i > 0 ; i--){
            for (int j = i ; j > 0 ; j-- ){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
