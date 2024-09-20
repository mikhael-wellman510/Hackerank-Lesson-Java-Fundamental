package InstanceOf;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

class Student{

}

class Rockstar {

}

class Hacker {

}
public class Solution {

    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);
        Integer n = sc.nextInt();
        sc.nextLine();

        List<Object> data = new ArrayList<>();
        for (Integer i = 0 ; i < n ; i++){
            String a = sc.nextLine();
            if (a.equals("Student")){
                data.add(new Student());
            } else if (a.equals("Rockstar")) {
                data.add(new Rockstar());
            } else if (a.equals("Hacker")) {
                data.add(new Hacker());
            }
        }

        Integer s = 0;
        Integer r = 0;
        Integer h = 0;
        for (Object x : data){
            if (x instanceof Student){
                s++;
            } else if (x instanceof Rockstar) {
                r++;
            } else if (x instanceof Hacker) {
                h++;
            }
        }

        System.out.println(s + " " + r + " " + h);

    }


}
