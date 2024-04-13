package HackerRank.TesFibbo;

import javax.swing.plaf.basic.BasicTableUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DeleteList {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        data.add(3);
        data.add(9);
        data.add(2);
        data.add(3);
        data.add(1);
        data.add(7);
        data.add(2);
        data.add(3);
        data.add(5);
        System.out.println(data);
        //Todo -> Cara Gampang nya
        data.removeAll(Collections.singleton(3));
        System.out.println(data);
        // Todo -> Menggunakan looping


      
    }
}
