package FileHandling.F;

import java.io.Serial;
import java.io.Serializable;

public class Data45 implements Serializable {
    private String name;
    private String roll;
    @Serial
    private static final long serialVersionUID = 1L;
    public Data45(String name, String roll) {
        setName(name);
        setRoll(roll);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }


}
