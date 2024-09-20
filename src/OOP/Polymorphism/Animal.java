package OOP.Polymorphism;

public class Animal {

    void makeSound(){
        System.out.println("Animal Make A sound ");
    }

    String name(String name){
        return "Nama Hewan Ini Adalah :  " + name ;
    }


    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal myDog = new Dog();

        System.out.println(myDog.name("Anjing"));

    }
}
