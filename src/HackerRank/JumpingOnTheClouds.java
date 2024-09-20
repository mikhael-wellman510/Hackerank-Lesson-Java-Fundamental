package HackerRank;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JumpingOnTheClouds {

    public static Integer jumpingOnClouds(List<Integer> e){

        Integer s = 0;
        Integer jump = 0;
        while (s < e.size()){

            if (s < e.size() - 2) {


                if (e.get(s) == e.get(s+2) && e.get(s) == e.get(s+1)) {
                    s = s + 2;
                    jump = jump + 1;
                }  else   if (e.get(s) == e.get(s+1) ){
                    s++;
                    jump++;
                }else {
                    s = s + 2;
                    jump++;
                }
            }else {
                if (e.get(s) == e.get(s+1) ){
                    s++;
                    jump++;
                }else {
                    s = s + 2;
                    jump++;
                }
            }


            if (s == e.size()-1){
                break;
            }


        }



        return jump;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();

        List<Integer> data = IntStream.range(0,n).mapToObj((val)->{

            Integer x = sc.nextInt();
            return x;
        }).collect(Collectors.toList());

        System.out.println(jumpingOnClouds(data));;
    }
}
