package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String [] iterator = sc.nextLine().split(" ");
        Integer a = Integer.parseInt(iterator[0]);
        Integer b = Integer.parseInt(iterator[1]);
        Integer total = a + b;


        ArrayList arr = new ArrayList<>();
        for (Integer i = 0 ; i < total ; i++){
            arr.add(sc.nextLine());
        }

        Iterator it = arr.iterator();
        Integer i = 0;
        while (it.hasNext()){
            Object res = it.next();
            if (i >= a){
                System.out.println(res);
                i++;
            }else {
                i++;
            }


        }





    }
}
