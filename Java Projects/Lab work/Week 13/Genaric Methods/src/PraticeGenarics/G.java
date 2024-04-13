package PraticeGenarics;

public class G<T,V ,B> {
    T ob1;
    V cnic;
    B db;

    public G(T ob1, V cnic, B db) {
        setCnic(cnic);
        setDb(db);
        setOb1(ob1);
    }

    public T getOb1() {
        return ob1;
    }

    public void setOb1(T ob1) {
        this.ob1 = ob1;
    }

    public V getCnic() {
        return cnic;
    }

    public void setCnic(V cnic) {
        this.cnic = cnic;
    }

    public B getDb() {
        return db;
    }

    public void setDb(B db) {
        this.db = db;
    }

    void showTypes(){
        System.out.println("Number:  "+ob1);
        System.out.println("Cnic:   "+cnic);
        System.out.println("date of birth:   "+db);


       }
}
