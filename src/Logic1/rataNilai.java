package Logic1;

public class rataNilai {
    public static void main(String[] args) {
       int [] a = {70,80,79,99};

       int total = 0 ;
        for (int i = 0 ; i < a.length ; i++ ){
                total = a[i] + total;
        }
        int hasil = total / a.length;
        System.out.println(hasil);
    }
}
