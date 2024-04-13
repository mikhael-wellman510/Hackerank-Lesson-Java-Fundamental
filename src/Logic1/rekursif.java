package Logic1;

public class rekursif {
    public static void main(String[] args) {
        int result = hitungRekursif(4);
        System.out.println(result);
    }
    public  static int hitungRekursif(int n){
        if(n > 0){
            return n + hitungRekursif(n-1);//4 / 3 / 2 / 1
        }else {
            return 0;
        }
    }
}
