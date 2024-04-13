package TesIFF;

public class TesIFFConsoleApp2 {

    public static void buatBintang(Integer in){

        for (Integer i = 0 ; i < in ; i++){
            for (Integer k = 0 ; k < i; k++){
                System.out.print(" ");
            }
            for (Integer j = 0 ; j < in - i ; j++){
                System.out.print(i+1);
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {

        TesIFFConsoleApp2.buatBintang(7);
    }
}
