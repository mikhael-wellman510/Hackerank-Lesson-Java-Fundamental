package HackerRank.JavaArrayListHackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
    private List<List<Integer>> data = new ArrayList<>();

    public Solution() {
    }

    public void addData(String data ){
        String [] arrData = data.split(" ");
        List<Integer> add = new ArrayList<>();
        for (Integer i = 0 ; i < arrData.length ; i++){
            add.add(Integer.parseInt(arrData[i]));
        }

        this.data.add(add);

    }

    public void cekData(String angka){
        try {
            String [] arrAngka = angka.split(" ");

            System.out.println("hasil : " + this.data.get(Integer.parseInt(arrAngka[0]) -1 ).get(Integer.parseInt(arrAngka[1]) ));
        }catch (Exception e){
            System.out.println("ERROR!");
        }


    }

    public List<List<Integer>> getData() {
        return data;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Solution solution = new Solution();
        System.out.print("Masukan Total : ");
        Integer total = in.nextInt();
        in.nextLine();


        for (Integer i = 0 ; i <total ; i++){
            System.out.print("Masukan Number : ");
            String number = in.nextLine();
            solution.addData(number);
        }

        System.out.println(solution.getData());

        // Todo - > Cek Data
        System.out.print("total cek : ");
        Integer totalCek = in.nextInt();
        in.nextLine();
        for (Integer j = 0 ; j < totalCek ; j++){
            System.out.print("Masukan angka [1,2] :");
            String number = in.nextLine();
            solution.cekData(number);
        }


    }
}
