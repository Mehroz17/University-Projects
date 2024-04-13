package Genarics.GM;

public class GClass <T>{
    T o , b;

    public GClass(T o) {
        setO(o);
    }

    public void setO(T o) {
        this.o = o;
    }

    public T getO() {
        return o;
    }

    public T getB() {
        return b;
    }

    public void setB(T b) {
        this.b = b;
    }

    //Returing the type of the object
    void shoe(){
        System.out.println("Type is "+o.getClass().getName());
    }


    public void add(){


    }
}
