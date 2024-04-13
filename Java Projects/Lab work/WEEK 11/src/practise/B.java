package practise;

public class B {
    private String name;
    private char g ;
    private String cnin;
    private String ariline;
    public B(String name,char g,String cnin,String ariline) {
        setName(name);
        setG(g);
        setCnin(cnin);
        setAriline(ariline);
    }

    public String getAriline() {
        return ariline;
    }

    public void setAriline(String ariline) {
        this.ariline = ariline;
    }

    public String getCnin() {
        return cnin;
    }

    public void setCnin(String cnin) {
        this.cnin = cnin;
    }

    public char getG() {
        return g;
    }

    public void setG(char g) {
        this.g = g;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printingDetails(){
        System.out.println("Name: "+name);
        System.out.println("CNIC: "+cnin);
        System.out.println("Gender: "+g);
        System.out.println("Airline: "+ariline);
    }
}
