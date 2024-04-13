package TestTransformtech.SoalNo2;

public class Triangle extends Shape{

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Todo -> Menghitung luas alas segitiga
    @Override
    public double calculate() {
        return this.base * this.height;
    }
}
