package Poly;

public class Painter {

    final static int RATE = 200;

    public double estimateRate(Shape shape){   // Shape class will see that which class has to be called at run time
        return shape.calculateAre()* 200;
    }
//
//    public double estimateRate(Circle c1){
//        return c1.calculateAre()* 200;
//    }

//Look we have to use a simple line to get estimate cost it does not need any shape.
    // so we can use polymorphism in this case to shrink the code;
    /*
    what we have done is just give assign the parent class and then from it we are getting the area of the all shapes
    also the output will remains same
     */
}
