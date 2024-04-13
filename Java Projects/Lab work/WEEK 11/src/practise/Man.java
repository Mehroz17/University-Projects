package practise;




public class Man {
    private String name;
    private String cnic;

//    public Man(String name) {
//       setName(name);
//    }

    public Man(String cnic) {
        this.cnic = cnic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }
}
