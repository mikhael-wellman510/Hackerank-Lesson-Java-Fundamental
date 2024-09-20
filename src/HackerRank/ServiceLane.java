package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ServiceLane {

    public static List<Integer>serviceLane(Integer n , List<List<Integer>> cases , List<Integer>width){

        List<Integer> hasil = new ArrayList<>();
        for (Integer i = 0 ; i < cases.size() ; i++){

            Integer start = cases.get(i).get(0);
            Integer finish = cases.get(i).get(1);
            Integer x = 0;
            for (Integer j = start ; j <= finish ; j++){
                if (x > width.get(j) || x == 0){
                    x= width.get(j);
                    System.out.println("cek : " + width.get(j));
                }
            }

            hasil.add(x);

        }




        return hasil;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] init = sc.nextLine().split(" ");

        Integer a = Integer.parseInt(init[0]); // 8
        Integer b = Integer.parseInt(init[1]); // 5

        List<Integer> width = IntStream.range(0, a).mapToObj(val -> {
            Integer x = sc.nextInt();
            return x;
        }).collect(Collectors.toList());

        List<List<Integer>> cases = new ArrayList<>();
        sc.nextLine();
        IntStream.range(0,b).forEach(val -> {
            List<Integer> datas = new ArrayList<>();
            String [] value = sc.nextLine().split(" ");
            Integer x = Integer.parseInt(value[0]);
            Integer y = Integer.parseInt(value[1]);
            datas.add(x);
            datas.add(y);
            cases.add(datas);

        });


        List<Integer> res = serviceLane(a,cases,width);
        for (Integer fix : res){
            System.out.println(fix);
        }

    }
}
