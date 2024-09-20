package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VeryBigSum {

    public static Long aVeryBigSum(List<Long> ar){

        Long result = 0L;

        for (Integer i = 0 ; i < ar.size(); i++){
            result = result + ar.get(i);
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer total = sc.nextInt();
        sc.nextLine();
        String data = sc.nextLine();
        String [] dataArr = data.split(" ");
        List<Long> datas = new ArrayList<>();

        for (Integer i = 0 ; i <total ; i++){
            datas.add(Long.parseLong(dataArr[i]));
        }

        System.out.println(VeryBigSum.aVeryBigSum(datas));

    }
}
