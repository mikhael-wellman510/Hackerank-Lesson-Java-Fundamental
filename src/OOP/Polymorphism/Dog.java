package OOP.Polymorphism;

public class Dog extends Animal{

    @Override
    void makeSound() {
        System.out.println("Ini Kucing");
    }

    @Override
    String name(String name) {
        return super.name(name);
    }
}
