package OverideTest;


class Vehicle{

    void display(String a){
        System.out.println(a);
    }

}

class Motor extends Vehicle{
    @Override
    void display(String a) {
        super.display(a);
    }
}

public class Solution2 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.display("Hello I am a motorcycle, I am a cycle with an engine.");
        Motor m = new Motor();
        m.display("My ancestor is a cycle who is a vehicle with pedals.");
    }

}
