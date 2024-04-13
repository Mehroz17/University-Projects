package Poly;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    @Override
    public double calculateAre() {
        System.out.println("Calculate Area from Circle: ");
        return Math.PI*radius*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
