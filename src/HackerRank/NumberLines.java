package HackerRank;

import java.util.Scanner;

public class NumberLines {

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v1 == v2) {
            if (x1 == x2) {
                return "YES";
            } else {
                return "NO";
            }
        } else {
            int distanceDifference = x2 - x1;
            int speedDifference = v1 - v2;
            if (distanceDifference % speedDifference == 0 && distanceDifference / speedDifference >= 0) {
                return "YES";
            } else {
                return "NO";
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        String [] arrData = data.split(" ");

        System.out.println(NumberLines.kangaroo(Integer.parseInt(arrData[0]) , Integer.parseInt(arrData[1]) , Integer.parseInt(arrData[2]) , Integer.parseInt(arrData[3])));
    }
}
