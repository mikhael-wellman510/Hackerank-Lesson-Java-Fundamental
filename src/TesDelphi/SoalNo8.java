package TesDelphi;

public class SoalNo8 {

    public static void weird(Integer in){

        for (Integer i = 0 ; i < in ; i++){

            if (i % 2 != 0){
                System.out.print("weird ");
            } else if (i % 2 == 0 && i >= 2 && i <= 5) {
                System.out.print("Not Weird ");
            } else if (i % 2 == 0 && i >= 6 && i <= 20) {
                System.out.print("weird ");
            }else {
                System.out.print("Not weird ");
            }
        }

    }

    public static void main(String[] args) {

        SoalNo8.weird(100);
    }
}
