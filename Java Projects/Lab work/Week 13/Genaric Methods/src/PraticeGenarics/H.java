package PraticeGenarics;

import javax.naming.Name;

public class H extends G{
    public H(Object ob1, Object cnic, Object db, String name) {
        super(ob1, cnic, db);
        setName(name);
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    void showTypes() {
        super.showTypes();
        System.out.println("Name : "+name);
    }
}
