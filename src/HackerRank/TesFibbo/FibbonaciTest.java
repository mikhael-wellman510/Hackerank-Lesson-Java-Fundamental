package HackerRank.TesFibbo;

public class FibbonaciTest {

    public static void main(String[] args) {
        Integer a = 1225441;



        while (a > 0){
            if (a > 1000000){
                Integer floor = (a / 1000000) * 1000000;
                System.out.println(floor);
                a = a - floor;
            } else if (a > 200000) {
                Integer floor = (a/100000) * 100000;
                System.out.println(floor);
                a = a -floor;
            } else if (a >20000) {
                Integer floor = (a/10000) * 10000;
                System.out.println(floor);
                a = a - floor;
            } else if (a > 5000) {
                Integer floor = (a/1000) * 1000;
                System.out.println(floor);
                a = a - floor;
            } else if (a> 400) {
                Integer floor = (a/100) * 100;
                System.out.println(floor);
                a = a - floor;
            } else if (a>40) {
                Integer floor = (a/10) * 10;
                System.out.println(floor);
                a = a -floor;
            }else {
                Integer floor = (a/1) * 1;
                System.out.println(floor);
                a = a - floor;

            }
        }
    }
}
