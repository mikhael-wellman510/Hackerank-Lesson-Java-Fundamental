package HackerRank;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AnggryProfesor {

    public static String angryProfessor(Integer k , List<Integer> a){

       Long onTime =  a.stream().filter(val -> val <= 0 ).count();

       if (onTime >= k){
           return "Yes";
       }
        return  "No";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer total = sc.nextInt();

        sc.nextLine();
        IntStream.range(0, total).forEach(val -> {

            String [] data1 = sc.nextLine().split(" ");
            String [] jam = sc.nextLine().split(" ");
            Integer min = Integer.parseInt(data1[1]) ;
            List<Integer> data = Arrays.asList(jam).stream().map(Integer::parseInt).collect(Collectors.toList());
            String res = AnggryProfesor.angryProfessor( min ,data);
            System.out.println(res);
        });



    }
}
