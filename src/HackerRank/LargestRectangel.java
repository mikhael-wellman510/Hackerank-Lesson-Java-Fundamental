package HackerRank;

import java.util.*;
import java.util.stream.IntStream;

public class LargestRectangel {

    public static long largestRectangle(List<Integer>n){
        Stack<Integer> data = new Stack<>();

        for (Integer i = 0 ; i <  n.size() ; i++){
            data.push(n.get(i));
        }

        List<Integer> result = new ArrayList<>();
        Integer i = 0 ;
        while (!data.isEmpty()){
            Integer res = n.get(i) * data.pop();
            result.add(res);
            i++;
        }

        Integer res = Collections.max(result);
        Long hasil = Long.parseLong(String.valueOf(res));


        return hasil;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        sc.nextLine();
        String [] arr = sc.nextLine().split(" ");

        List<Integer> data = new ArrayList<>();
        IntStream.range(0, n).forEach(val ->{
            data.add(Integer.parseInt(arr[val]));
        });
        System.out.println(largestRectangle(data));
    }
}
