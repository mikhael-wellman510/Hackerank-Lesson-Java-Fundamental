package Logic3;

public class SwapNumber {
    public static void main(String[] args) {

        Integer a = 8 ;
        Integer b = 5 ;

      a = a-b; //3
        b= b+a;
        a= b-a;
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
}
