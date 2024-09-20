package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BeetwenTwoSet {

    public static Integer getTotalX(List<Integer> a , List<Integer> b){

        // Todo - > length - 1
        Integer cek = a.size();
        Integer panjangNew = Collections.max(b);
        System.out.println("pp:" + panjangNew);
        Integer awal = a.get(0);



        List<Integer> data = new ArrayList<>();
        for (Integer i = awal ; i <=  panjangNew ; i++){
            Integer temp = 0;
            for (Integer j = 0 ; j < cek ; j++){
                if (i % a.get(j) == 0){
                    temp++;
                }
            }

            if (temp == a.size()){
                data.add(i);
            }
        }

        System.out.println("cek data : " + data);

        Integer total = 0 ;
        for (Integer i = 0 ; i < data.size() ; i++){
            Integer temp = 0;
            for (Integer j = 0 ; j < b.size() ; j++){
                if (b.get(j) % data.get(i) == 0){
                    temp++;
                }
            }

            if (temp == b.size()){
                total++;
            }
        }

        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String init = sc.nextLine();
        String [] arrInit = init.split(" ");

        List<Integer> dataA = new ArrayList<>();
        for (Integer i = 0 ; i < Integer.parseInt(arrInit[0]) ; i++){
            dataA.add(sc.nextInt());
        }
        List<Integer> dataB = new ArrayList<>();
        for (Integer j = 0 ; j < Integer.parseInt(arrInit[1]) ; j++){
            dataB.add(sc.nextInt());
        }
        System.out.println( BeetwenTwoSet.getTotalX(dataA,dataB));






    }
}
