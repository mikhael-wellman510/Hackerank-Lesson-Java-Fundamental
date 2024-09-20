package HackerRank.StackJava;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StackS {

    public static List<Integer> waiter (List<Integer> num, Integer q){

        List<Integer> cek = new ArrayList<>();
        Stack<Integer> nums = new Stack<>();
        nums.addAll(num);
        Integer x = 2 ;
        Integer y = 1;

        while(cek.size() < q){
            Integer temp = 0;
            while (y <= x ){
                if (x % y == 0 ){
                    temp++;
                    y++;
                }else {
                    y++;
                }

            }

            if (temp  <= 2){
                cek.add(x);
                x++;
                y=1;
            }else {
                x++;
                y=1;
            }
        }


        List<Integer> answer =  new ArrayList<>();
        System.out.println(cek);
        for (Integer i = 0 ; i < q ; i++){
            Stack<Integer> newA = new Stack<>();
            Stack<Integer> newBos =  new Stack<>();

            while (!nums.isEmpty()){
                Integer plate = nums.pop();
                if (plate % cek.get(i) == 0){
                    newA.push(plate);
                }else {
                    newBos.push(plate);
                }
            }

            while (!newA.isEmpty()){
                answer.add(newA.pop());
            }

            if (q==1){
                while (!newBos.isEmpty()){
                    answer.add(newBos.pop());
                }
            }


            nums =  newBos;



        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] arrIn = sc.nextLine().split(" ");
        Integer len = Integer.parseInt(arrIn[0]);
        Integer loop = Integer.parseInt(arrIn[1]);

        List<Integer> num = IntStream.range(0,len).mapToObj(val->{
            int x = sc.nextInt();
            return x;
        }).collect(Collectors.toList());

       List<Integer> res =  waiter(num, loop);
        for (Integer x : res){
            System.out.println(x);
        }
    }
}
