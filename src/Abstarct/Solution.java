package Abstarct;


import java.util.Scanner;

abstract class Book{
    String title;

    abstract void setTittle(String s);
    String getTitle(){
        return title;
    }
}

class MyBook extends Book{
    String title;

    @Override
    void setTittle(String s) {
        this.title = "A tale of two cities";
    }

    @Override
    String getTitle() {
        return "the title is: " +  this.title;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String res = sc.nextLine();
        Book new_novel = new MyBook();
        new_novel.setTittle(res);
        System.out.println(new_novel.getTitle());


    }
}
