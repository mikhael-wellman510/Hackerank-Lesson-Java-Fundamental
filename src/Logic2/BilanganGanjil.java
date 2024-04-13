package Logic2;

import java.util.ArrayList;

public class BilanganGanjil {
    public static void main(String[] args) {
        int total = 40;
        boolean stop = true;
        int i = 1;

        ArrayList<Integer> hasil = new ArrayList<Integer>();

        while (total > i) {

            if (i % 2 == 1) {
                hasil.add(i);
            }
            i++;


        }

        System.out.println(hasil);
    }
}
