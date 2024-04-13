package TestTransformtech.SoalNo2;

public class MainApp {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(4,5);
        System.out.println(triangle.calculate());
        Square square = new Square(4);
        System.out.println(square.calculate());
    }
}
