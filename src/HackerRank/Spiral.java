package HackerRank;

import java.util.Arrays;

public class Spiral {

    public static int [][] createSpiral(Integer n){

        Integer [][] result = new Integer[n][n];

        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        int value = 1;

        // Iterasi untuk mengisi array dua dimensi dengan pola spiral
        while (value <= n * n) {
            // Isi bagian atas baris dari kiri ke kanan
            for (int i = left; i <= right; i++) {
                result[top][i] = value++;
            }
            top++;

            // Isi bagian kanan kolom dari atas ke bawah
            for (int i = top; i <= bottom; i++) {
                result[i][right] = value++;
            }
            right--;

            // Isi bagian bawah baris dari kanan ke kiri
//            for (int i = right; i >= left; i--) {
//                result[bottom][i] = value++;
//            }
//            bottom--;
//
//            // Isi bagian kiri kolom dari bawah ke atas
//            for (int i = bottom; i >= top; i--) {
//                result[i][left] = value++;
//            }
//            left++;
        }

        // Untuk Array 2 Dimensi
        System.out.println(Arrays.deepToString(result));

        return null;
    }

    public static void main(String[] args) {
        Spiral.createSpiral(3);
    }
}
