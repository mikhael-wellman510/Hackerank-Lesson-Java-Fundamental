package HackerRank;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr){

        Integer negative = 0;
        Integer positive = 0;
        Integer zero = 0;

        for (Integer i = 0 ; i < arr.size(); i++){
            if (arr.get(i) < 0){
                negative++;
            } else if (arr.get(i) == 0) {
                zero++;
            } else if (arr.get(i)> 0) {
                positive++;
            }
        }

        DecimalFormat df = new DecimalFormat("0.000000");
        Double negativeD = Double.valueOf(negative) /arr.size();
        Double positiveD = Double.valueOf(positive) /arr.size();
        Double zeroD = Double.valueOf(zero) / arr.size();
        String resultPositive = df.format(positiveD);
        String resultNegative = df.format(negativeD);
        String resultZero = df.format(zeroD);


        System.out.println(resultNegative);
        System.out.println(resultPositive);
        System.out.println(resultZero);

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer total = sc.nextInt();
        sc.nextLine();
        String data = sc.nextLine();
        String [] dataArr = data.split(" ");
        List<Integer> datas = new ArrayList<>();


        for (Integer i = 0 ; i < total ; i++){
            datas.add(Integer.parseInt(dataArr[i]));
        }

        PlusMinus.plusMinus(datas);
    }
}
