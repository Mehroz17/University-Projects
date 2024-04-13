package ExceptionHandling;

public class Calculator {
   private String name;
   private String cninc;

    public Calculator(String name, String cninc) {
        setCninc(cninc);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCninc() {
        return cninc;
    }

    public void setCninc(String cninc) {
        this.cninc = cninc;
    }

    public void data(){
        System.out.println("Name: "+ name);
        System.out.println("CNIC: "+ cninc);
    }
}
