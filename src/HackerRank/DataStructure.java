package HackerRank;

import java.util.*;

public class DataStructure {
   private Set<String> uniqName = new HashSet<>();

    public void result(String nama){


        if (uniqName.isEmpty()){
            this.uniqName.add(nama);
        } else if (!uniqName.contains(nama)) {
            this.uniqName.add(nama);
        }

        System.out.println(uniqName.size());

    }

    public static void main(String[] args) {

        DataStructure ds = new DataStructure();
        Scanner in = new Scanner(System.in);
        Integer total = in.nextInt();
        in.nextLine();

        for (Integer i = 0 ; i < total ; i++){
            String nama = in.nextLine();
            ds.result(nama);
        }


    }
}
