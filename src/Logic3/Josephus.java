package Logic3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Josephus {


    public static List<Integer> jsResult(List<Integer> init){

        List<Integer> result = new ArrayList<>();


        int idx=0;

        while (init.size() > 0){

        idx = (idx + 3 - 1) % init.size();
        result.add(init.remove(idx));




        }
        System.out.println("hasil : " + result);
        return null;
    }

    public static void main(String[] args) {

        Josephus.jsResult(new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7)));


    }
}
