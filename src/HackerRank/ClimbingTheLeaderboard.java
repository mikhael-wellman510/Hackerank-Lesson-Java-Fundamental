package HackerRank;

import java.util.*;

public class ClimbingTheLeaderboard {
    public static List<Integer> climbLeaderboard(List<Integer> ranked , List<Integer>player){

        LinkedHashSet<Integer> newRanked = new LinkedHashSet<>(ranked);
        List<Integer> rank = new ArrayList<>(newRanked);

        System.out.println("Player : " + player);
        System.out.println("ranked : " + rank);

        List<Integer> result = new ArrayList<>();
        Integer i = rank.size()-1 ; //
        for (Integer p : player){
                while (i >= 0 && p >= rank.get(i)){
                    i--;
                }
            result.add(i +2);

        }




        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer x = sc.nextInt();
        sc.nextLine();
        String dataX = sc.nextLine();
        String [] arrDataX = dataX.split(" ");
        Integer y = sc.nextInt();
        sc.nextLine();
        String dataY = sc.nextLine();
        String [] arrDataY = dataY.split(" ");

        List<Integer> ranked = new ArrayList<>();
        for (Integer i = 0 ; i <  x ; i++){
            ranked.add(Integer.parseInt(arrDataX[i]));
        }
        List<Integer> player = new ArrayList<>();
        for (Integer j = 0 ; j < y ; j++){
            player.add(Integer.parseInt(arrDataY[j]));
        }

        List<Integer> fix = climbLeaderboard(ranked,player);
        for (Integer hasil : fix){
            System.out.println(hasil);
        }


    }
}
