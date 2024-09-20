package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PickingNumber {
    public static Integer pickingNumbers(List<Integer>a){
        List<List<Integer>> res = new ArrayList<>();


        for (Integer i = 0 ; i < a.size() ; i++){
            List<Integer> temp = new ArrayList<>();
            for (Integer j = 0 ; j < a.size(); j++){
                if (Math.abs(a.get(i) - a.get(j)) <= 1 ){
                    temp.add(a.get(j));
                }
            }

            res.add(temp);
        }

        List<List<Integer>> subArrays =new ArrayList<>();
        System.out.println(res);
        for (List<Integer> sub : res){
            Boolean isTrue = true;
            for (Integer i = 0 ; i <  sub.size()-1 ; i++){
                if (Math.abs(sub.get(i) - sub.get(i+1)) > 1 || Math.abs(sub.get(0) - sub.get(i+1)) > 1){
                    isTrue = false;
                    break;
                }

            }
            if (isTrue){
                subArrays.add(sub);
            }

        }
        System.out.println(subArrays);

        Integer big = 0 ;
        for (List<Integer> find : subArrays){
            if (find.size() > big){
                big = find.size();
            }
        }




        return big;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer loop = sc.nextInt();
        sc.nextLine();
        String data = sc.nextLine();
        String [] arrData = data.split(" ");
        List<Integer> a = new ArrayList<>();
        for (Integer i = 0 ; i < loop; i++){
                a.add(Integer.parseInt(arrData[i]));
        }

        System.out.println(PickingNumber.pickingNumbers(a));


    }
}
