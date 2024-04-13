package TestTransformtech.SoalNo5;

import java.util.ArrayList;
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

        // Todo -> menghapus semua data yang mengandung angka 3
//        data.removeAll(Collections.singleton(3));
//        System.out.println(data);
        List<Integer> newData = new ArrayList<>();
        // Todo -> Manual
        for (Integer i = 0 ; i < data.size() ; i++){
            if (data.get(i) != 3){
                newData.add(data.get(i));
            }
        }

        System.out.println(newData);
    }
}
