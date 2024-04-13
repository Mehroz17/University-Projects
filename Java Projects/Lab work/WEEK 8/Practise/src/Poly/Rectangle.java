package Poly;

public class Rectangle extends Shape{
    private double length;
    private double width;


    public Rectangle(double length, double width) {
       setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateAre() {
        System.out.println("Calculaate Area Called form Rectangle: ");
        return getLength()*getWidth();
    }
}
