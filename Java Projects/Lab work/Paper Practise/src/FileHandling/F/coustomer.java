package FileHandling.F;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class coustomer {

    private String name;
    private String order;

    private int ordel = 3698;
    Random rn1 = new Random(ordel);
    private int orderNo = rn1.nextInt();


    public coustomer(String name, String order) {
        setName(name);
        setOrder(order);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }





}
