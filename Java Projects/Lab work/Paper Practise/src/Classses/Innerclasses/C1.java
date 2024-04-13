package Classses.Innerclasses;

public  class C1 {
    private static int name;

void k(){
    System.out.println(Cinner.v);
}

    /*
        Static Inner Class
        * Static inner class can access all the static varaibales of the outer class with out creating any object
        *  but to access the non static member of the outer class in the inner class we need to create the object of the outer class
         */
    public static class Cinner {
        static int  v = 9;
    }
}


