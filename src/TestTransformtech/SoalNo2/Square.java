package TestTransformtech.SoalNo2;

public class Square extends Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculate() {
        return 4 * side;
    }
}
