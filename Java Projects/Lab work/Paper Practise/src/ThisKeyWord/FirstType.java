package ThisKeyWord;
// Invoking the Constructors

/*
the real life example is to invokde constructors using this keyword is to reuse the
constructor from the constructor. it maitanis the chain between the constructos.
 */
public class FirstType {

  private String name;
  private String rollNO;
  private String sub;

    public FirstType(String name, String rollNO) {
        this.name = name;
        this.rollNO = rollNO;
    }

    public FirstType(String name, String rollNO, String sub) {
        this(name,rollNO);
        this.sub = sub;
        System.out.println("SEcond Constrctor is called ");
    }

    void D(){
        System.out.println("Name: "+name);
        System.out.println("Roll Number: "+rollNO);
        System.out.println("Sub: "+sub);
    }
}
