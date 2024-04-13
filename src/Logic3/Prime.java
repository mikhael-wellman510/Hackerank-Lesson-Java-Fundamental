package Logic3;

public class Prime {

    static boolean isPrime(Integer angka){
        Integer temp = 0;
        for (Integer i = 1 ; i < angka ; i++){


            if (angka % i == 0) {
                temp++;
            }


        }
        if (temp >= 2){
            return false;

        }else {
            return true;
        }

    }

    public static void main(String[] args) {


        System.out.println(isPrime(3));

    }
}
