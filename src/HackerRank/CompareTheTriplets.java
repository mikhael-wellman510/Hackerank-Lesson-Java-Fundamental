package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompareTheTriplets {

    public static List<Integer> compareTriplets(List<Integer> a , List<Integer> b){
        List<Integer> result = new ArrayList<>();

        Integer resA = 0;
        Integer resB = 0 ;
        for (Integer i = 0 ; i< a.size() ; i++){
            if (a.get(i)  > b.get(i)){
               resA++;
           }else if(a.get(i)  < b.get(i)) {
               resB++;
           }

        }
        result.add(0,resA);
        result.add(1,resB);



        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data1 = sc.nextLine();
        String data2 = sc.nextLine();
        String [] dataArr1 = data1.split(" ");
        String [] dataArr2 = data2.split(" ");

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        for (Integer i = 0 ; i < dataArr1.length ;i++){
            a.add(Integer.parseInt(dataArr1[i]));
        }

        for (Integer i = 0 ; i < dataArr2.length ;i++){
            b.add(Integer.parseInt(dataArr2[i]));
        }

        String finalresult = "";

        for (Integer cek : CompareTheTriplets.compareTriplets(a,b)){
            finalresult = finalresult + cek + " ";
        }

        System.out.println(finalresult);


    }
}
