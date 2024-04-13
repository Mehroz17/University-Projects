package inheritance;
// This is a parent class which is also called Super Class or base Class

public class Student {
// Scope of private acces modifier is onlu within that particular class
    private String name ;
    private String reg;
    int admisionFee = 10000;
    int semesterFee = 80000;
    // https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
    // Protected scope will be access able at package level
    protected  String uniNAme = "COMSATS";
    public Student(String name , String reg){

        setName(name);
        setReg(reg);
    }
    // when data hiding is applied then encapsulation is also applied as well
   public void setName(String name) {
        this.name = name;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getName() {
        return name;
    }

    public String getReg() {
        return reg;
    }


// the challan of hoelaite and dayschoarl is different
    // Method Overriding

public Student(){}
public int calculateFee(){
        return admisionFee*semesterFee;
}

public void Challan(){
        System.out.println("the name of Student is:  "+name);
        System.out.println("the reg # : " +reg);

        System.out.println("The fee of Student is:  "+ calculateFee());
}
}
