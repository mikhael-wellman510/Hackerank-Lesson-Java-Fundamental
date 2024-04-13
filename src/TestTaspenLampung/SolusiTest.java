package TestTaspenLampung;

public class SolusiTest {

    public SolusiTest() {
    }

    void hasil(Integer sisi ){
        System.out.println("--- Panjang ---");
        for (Integer i = 0 ; i < sisi ; i++){

            for (Integer j = 0 ; j < sisi ; j++){
                if (i != 2){
                    if (j==0 || j==4){
                        System.out.print("* ");
                    }else {
                        System.out.print("= ");
                    }
                }else {
                    System.out.print("* ");
                }


            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        SolusiTest solusi = new SolusiTest();
        solusi.hasil(5);
    }
}
