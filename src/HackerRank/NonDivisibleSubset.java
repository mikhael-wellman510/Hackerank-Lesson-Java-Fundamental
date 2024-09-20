package HackerRank;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NonDivisibleSubset {

    public static Integer nonDivisibleSubset(Integer k , List<Integer>s){
        Set<Integer> cek = new HashSet<>();
        for (Integer i = 0 ; i <  s.size() ; i++){

            for (Integer j = i + 1 ; j <  s.size() ; j++){

                Integer res = s.get(i) + s.get(j);

                if (res % k != 0 ){
                    if (!cek.contains(s.get(i))){
                        cek.add(s.get(i));

                    }
                }

            }

            if (i == s.size() - 1){
                cek.add(s.get(i));
            }
        }


        return cek.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] init = sc.nextLine().split(" ");
        Integer size = Integer.parseInt(init[0]);
        Integer bagi = Integer.parseInt(init[1]);

       List<Integer> data =  IntStream.range(0,size).mapToObj(val -> {
            Integer n = sc.nextInt();

           return n;
       }).collect(Collectors.toList());

        System.out.println(nonDivisibleSubset(bagi , data));

    }
}
