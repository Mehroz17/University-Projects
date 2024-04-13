package Genarics.G3;

public class G {
    public static void main(String[] args) {
        Integer[] name = {13, 14, 15, 160};
        Double[] k = {56.32};
String n ="Mehroz";
        inner.print(name,n);
        inner.print(k,n);
    }

public static class inner{
    public static  <T,U> void print(T[] t,U m){
        for (int i = 0;i<t.length;i++){
            System.out.println(t[i]);
        }
        System.out.println(m);
    }
}
        }


