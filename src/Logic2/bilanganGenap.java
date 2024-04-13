package Logic2;

import java.util.ArrayList;

public class bilanganGenap {
    public static void main(String[] args) {
        int total = 50;
        int i = 0;

        ArrayList<Integer> hasil = new ArrayList<Integer>();

        while (total > i) {

            if (i % 2 == 0) {
                hasil.add(i);
            }

            i++;
        }
        System.out.println(hasil);
    }
}
