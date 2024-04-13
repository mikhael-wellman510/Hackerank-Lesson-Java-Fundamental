package Logic3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HackerRank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Column : ");
        Integer n = scanner.nextInt();
        scanner.nextLine(); // Membuang newline setelah angka

        ArrayList<ArrayList<Integer>> data = new ArrayList<>();
        for (Integer i = 0 ; i < n ; i++){
            ArrayList<Integer> datas = new ArrayList<>();
            System.out.println("Masukan angka : " );
            String baris = scanner.nextLine();
            String [] arrData =baris.split("");
            for (String a : arrData){
                datas.add(Integer.parseInt(a));

            }
            data.add(datas);
        }

        for (Integer j = 0 ; j < n ; j++){

            System.out.print("masukan x : ");
            Integer x = scanner.nextInt();
            System.out.println("Masukan y : ");
            Integer y = scanner.nextInt();

            if (data.size() >=  x  && x >= 1){
                ArrayList<Integer> hasil = data.get(x -1);
                System.out.println(hasil);
                System.out.println("ini" + hasil.size());
                if (hasil.size() > y-1){
                    System.out.println(hasil.get(y-1));
                }else {
                    System.out.println("ERROR");
                }
            }else {
                System.out.println("ERRORBOs");
            }
        }

        System.out.println(data);


    }
}
