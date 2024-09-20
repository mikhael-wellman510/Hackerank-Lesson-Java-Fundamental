package HackerRank;

import java.util.*;

public class FlatLand {

    public static Integer flatLandSpaceStations(Integer n , Integer [] c){
        List<Integer> data = new ArrayList<>();
        for (Integer i = 0 ; i < n ; i++){
            List<Integer> temp = new ArrayList<>();
            for (Integer j = 0 ; j < c.length ; j++){
                Integer res = Math.abs(c[j] - i);
                temp.add(res);
            }

            Integer hasil = Collections.min(temp);
            data.add(hasil);
        }

        return Collections.max(data);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] init = sc.nextLine().split(" ");
        Integer n = Integer.parseInt(init[0]);
        Integer [] c = new Integer[Integer.parseInt(init[1])];

        for (Integer i = 0 ; i < c.length ; i++){
            c[i] = sc.nextInt();
        }
        System.out.println(flatLandSpaceStations(n,c));


    }
}
