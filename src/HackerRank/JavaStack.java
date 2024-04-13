package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaStack {

    private List<String> simbol ;

    public JavaStack() {
        this.simbol = new ArrayList<>();
    }

    void addData(String input){
        String [] a = input.split("");
        Integer temp = 0;
        for (Integer i = 0 ; i < a.length ; i++){

            if (a[i].equals("{") || a[i].equals("(") || a[i].equals("[")){
                this.simbol.add(a[i]);
            }else {
                if (this.simbol.contains("{") && a[i].equals("}")){
                    temp++;
                    System.out.println("Masuk {}");
                } else if (this.simbol.contains("(") && a[i].equals(")")) {
                    System.out.println("masuk ()");
                    temp++;
                } else if (this.simbol.contains("[") && a[i].equals("]")) {
                    System.out.println("masuk []");
                    temp++;
                }
            }
        }

        if (a.length /2.0 == temp){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JavaStack js = new JavaStack();


        while (sc.hasNext()){
            String input = sc.next();
            js.addData(input);
        }


    }
}
