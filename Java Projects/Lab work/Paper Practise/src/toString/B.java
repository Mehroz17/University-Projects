package toString;

public class B {

    private int a,b;

    public B(int a,int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "B{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
