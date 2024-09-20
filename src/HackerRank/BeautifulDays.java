package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BeautifulDays {


    public static Integer beautifulDays(Integer i , Integer j , Integer k){

        List<Integer> hasil = new ArrayList<>();
        for (Integer a = i ; a <= j ; a++){
            String [] n = String.valueOf(a).split("");

            String res = "";
            // Todo -> Reverse
            for (Integer b = n.length - 1 ; b >= 0 ; b--){
                res = res + n[b];
            }
            Integer val = Integer.parseInt(res);

            Integer points = a - val;

            if (points % k == 0){
                hasil.add(a);
            }

        }

        return (int) hasil.stream().count();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] data = sc.nextLine().split(" ");

        Integer i = Integer.parseInt(data[0]);
        Integer j = Integer.parseInt(data[1]);
        Integer k = Integer.parseInt(data[2]);
        System.out.println(beautifulDays(i,j,k));
    }
}
