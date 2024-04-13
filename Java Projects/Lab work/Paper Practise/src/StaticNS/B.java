package StaticNS;

public class B {
    static final  int m = 6;
    public static void p(){  //static method do not need an object to call
        System.out.println("This is the Static Method : "+m);
    }

    public void say(){
        System.out.println("This says Hello");
    }
  private static int number ;
    //Static block
    /*
    *** * static block can access only staic methods and static variables
    * any thing present in the static block runs first when ever the object of that class is made
     */
    static {
        number = 98;
        System.out.println("This is a static block");
    }
    //Non-Staic Block
    /*
    **** it can acces all the static and non-static variables and methods
    *
     */
    {
        p();
        System.out.println("This is a non- static block");
    }

public final void fina(){
    System.out.println("This is a final block and can not be overriden");
}
}
