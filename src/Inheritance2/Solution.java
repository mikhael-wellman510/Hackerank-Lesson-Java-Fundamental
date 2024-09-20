package Inheritance2;



class Arithmetic{

    Integer add(Integer a , Integer b){

        return a+b;
    }
}

class Adder extends Arithmetic{

    Integer result(Integer a, Integer b){

        return super.add(a, b);
    }
}
public class Solution {

    public static void main(String[] args) {
        Adder a = new Adder();
        System.out.println("My superclass is: Arithmetic");
        System.out.println( a.result(20,22) + " " + a.result(10,3)+" " + a.result(10,10));

    }

}
