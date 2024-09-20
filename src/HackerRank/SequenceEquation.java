package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class SequenceEquation {

    public static List<Integer> permutationEquation(List<Integer>p){

        List<Integer> result = new ArrayList<>();
        for (Integer i = 1 ; i <=  p.size() ; i++){
            Integer find = p.indexOf(i) + 1 ;// 4

            Integer fix = p.indexOf(find)+1;

            result.add(fix);
        }


        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer len = sc.nextInt();

        List<Integer> data = new ArrayList<>();

        IntStream.range(0,len).mapToObj(val -> {
            Integer a = sc.nextInt();
            data.add(a);
            return null;
        }).forEach(val -> {

        });

        permutationEquation(data).stream().forEach(val->{
            System.out.println(val);
        });


    }
}
