package HackerRank;

import java.util.*;

public class BreakingTheRecords {

    public static List<Integer> breakingRecords(List<Integer> scores){

        List<Integer> max =new ArrayList<>();
        List<Integer> min = new ArrayList<>();

        for (Integer i = 0 ; i < scores.size() ; i++){

            if (max.isEmpty() && min.isEmpty()){
                max.add(scores.get(i));
                min.add(scores.get(i));
            }else {
                // Todo -> Max
                for (Integer j = max.size() - 1; j < max.size() ; j++){

                    if (max.get(j) < scores.get(i)){
                        max.add(scores.get(i));

                    }
                }

                for (Integer k = min.size() - 1 ; k < min.size() ; k++){
                    if (min.get(k) > scores.get(i) ){
                        min.add(scores.get(i));
                    }
                }

            }

        }

       Integer maxTotal =  max.size() - 1;
        Integer minTotal = min.size() -1;

        List<Integer>  result = new ArrayList<>();
        result.add(maxTotal);
        result.add(minTotal);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer total = sc.nextInt();


        List<Integer> scores = new ArrayList<>();
        for (Integer i= 0 ; i < total ; i++){
            scores.add(sc.nextInt());
        }
        List<Integer> fix = BreakingTheRecords.breakingRecords(scores);

        String res = "";
        for (Integer x : fix){
            res = res + x + " ";
        }

        System.out.println(res);
    }
}
