package HackerRank;

import java.util.*;
import java.util.stream.IntStream;

public class CavityMap {

    public static List<String> cavityMap(List<String> grid){

        List<String> result = new ArrayList<>(grid);


        for (Integer i = 1 ; i <  grid.size() - 1 ; i++){

            String [] up = grid.get(i-1).split("");
            String [] line = grid.get(i).split("");
            String [] down = grid.get(i+1).split("");

            java.lang.StringBuilder data = new java.lang.StringBuilder(grid.get(i));



            for (Integer j = 1 ; j < grid.size() - 1 ; j++){

                    Integer upGrid = Integer.parseInt(up[j]);
                    Integer downGrid = Integer.parseInt(down[j]);
                    Integer left = Integer.parseInt(line[j-1]);
                    Integer right = Integer.parseInt(line[j+1]);
                    Integer point = Integer.parseInt(line[j]);

                    if (point > upGrid && point > downGrid && point > left && point > right){
                        data.setCharAt(j,'X');
                    }
            }


            result.set(i,data.toString());
        }



        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer init = sc.nextInt();

        List<String> grid = new ArrayList<>();
        sc.nextLine();
         IntStream.range(0,init).forEach(val->{

             String data = sc.nextLine();
             grid.add(data);
         });

          List<String> res =  cavityMap(grid);

          res.stream().forEach(val -> {
              System.out.println(val);
          });
    }
}
