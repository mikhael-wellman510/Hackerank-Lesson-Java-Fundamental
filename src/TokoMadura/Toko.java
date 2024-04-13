package TokoMadura;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Toko {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();
        Product product = new Product();


        product.addProduct(new Barang("Sabun" , 2000 , 20));
        product.addProduct(new Barang("Mie" , 3000 , 10 ));


        Boolean run = true;

        while (run){
            System.out.print("Selamat datang di toko Madura \n");
            System.out.print("1. Lihat Daftar Barang \n");
            System.out.print("2. Exit \n");
            Integer a = scanner.nextInt();


            if (a == 1){
                Boolean runA = true;
                while (runA){
                    product.cekProduct();

                    System.out.print("1. Kembali");
                    System.out.print("2. Exit");
                    Integer b = scanner.nextInt();
                    if (b == 1 ){
                        runA = false;
                    }else {
                        runA = false;

                    }

                }
            }else {
                run = false;
            }
        }

    }
}
