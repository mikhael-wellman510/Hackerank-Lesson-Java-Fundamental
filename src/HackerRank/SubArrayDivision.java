package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubArrayDivision {
    public static Integer birthday(List<Integer> s , Integer d , Integer m){
        Integer total = 0;

        if (m == 1){
                if (s.get(0) == d){
                    total = 1;
                }
        }else {
            for (Integer i = 0 ; i <= s.size() - m ; i++){

                Integer sum = 0;

                for (Integer j = i ; j < i+m ; j++){
                    sum = sum + s.get(j);
                }

                if (sum == d){
                    total ++;
                };

            }
        }


        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer total = sc.nextInt();
        sc.nextLine();
        String data = sc.nextLine();
        String [] arrData = data.split(" ");
        List<Integer> datas = new ArrayList<>();
        for (Integer i = 0 ; i < total ; i++){
            datas.add(Integer.parseInt(arrData[i]));
        }

        String birth = sc.nextLine();
        String [] arrBirth = birth.split(" ");

        System.out.println(SubArrayDivision.birthday(datas,Integer.parseInt(arrBirth[0]) , Integer.parseInt(arrBirth[1])));
    }
}
