package inter;

public class Human{
private String name;
private int height;
private String Cnic;

    public Human(String name, int height, String cnic) {
    setCnic(cnic);
    setName(name);
    setHeight(height);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getCnic() {
        return Cnic;
    }

    public void setCnic(String cnic) {
        Cnic = cnic;
    }
}
