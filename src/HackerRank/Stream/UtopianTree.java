package HackerRank.Stream;

import java.util.Scanner;
import java.util.stream.IntStream;

public class UtopianTree {

    public static Integer utopianTree(Integer n){
        Integer temp = 0;
        for (Integer i = 0 ; i <= n ; i++){
            if (i == 0){
                temp = temp + 1;

            } else if (i % 2 != 0) {
                temp = temp * 2;

            }else {
                temp = temp + 1;

            }
        }

        return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer len = sc.nextInt();

//        for (Integer i = 0 ; i <  len ; i++){
//            Integer data = sc.nextInt();
//            System.out.println(UtopianTree.utopianTree(data));
//        }
        IntStream.range(0,len).forEach(val -> {
            System.out.println(UtopianTree.utopianTree(sc.nextInt()));
        });




    }
}
