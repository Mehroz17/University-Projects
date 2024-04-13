package Poly;

public class Main {
 public static void main(String[]args){

    Rectangle rectangle = new Rectangle(12,45);
    Circle c1 = new Circle(6);

    Painter p2 = new Painter();
    double cost = p2.estimateRate(rectangle); // in this retangle will go to shape and then at run time decides which area is being used
    double cost1 = p2.estimateRate(c1);
    System.out.println("This will print us an estimate cost of paintint: " + cost);
     System.out.println("estimate cost of circle: " + cost1);


 }
}
