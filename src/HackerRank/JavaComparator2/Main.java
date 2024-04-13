package HackerRank.JavaComparator2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Biodata> data = new ArrayList<>();

        data.add(new Biodata("Mikael" , 24));
        data.add(new Biodata("Andre" , 21));
        data.add(new Biodata("umar" , 27));
        data.add(new Biodata("dika" , 24));

          // Todo , cara simple
        data.sort((b1 , b2)-> Integer.compare(b1.getUsia(), b2.getUsia()));

      // Todo , menggunakan Comparator
        Collections.sort(data,new SortByUsia());
        System.out.println(data);


    }
}
