package HackerRank;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CutTheStick {

    public static List<Integer> cutTheSticks(List<Integer> data){
        List<Integer> result = new ArrayList<>();
        while (!data.isEmpty()){
            Integer min = Collections.min(data);
            List<Integer> curr = new ArrayList<>();
            for (Integer x : data){
                if (result.isEmpty()){
                    curr.add(x-min);
                }
                else if (x > min){
                    curr.add(x-min);
                }

            }
            data = curr;

            if (curr.size() !=0){
                result.add(curr.size());
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer len = sc.nextInt();
        sc.nextLine();
        String [] data = sc.nextLine().split(" ");

        List<Integer> datas = IntStream.range(0,len).mapToObj(val->{

            return Integer.parseInt(data[val]) ;
        }).collect(Collectors.toList());

        cutTheSticks(datas).stream().forEach(val->{
            System.out.println(val);
        });
    }
}
