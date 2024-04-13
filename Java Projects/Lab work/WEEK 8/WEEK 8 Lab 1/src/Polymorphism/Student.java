package Polymorphism;


// This is a parent class
public class Student {
    String name;
    String reg;

    final static int admissionFee ;  // this will remain same for all students
    final  static  int normalSemesterFee; // this is also same for all students
    final static String uniname;
    static {
        admissionFee=1000;
        normalSemesterFee = 80000;
        uniname = "COMSATS UNI Islmabad , Lahore Campuss";
    }
    public Student(String name,String reg){
        setName(name);
        setReg(reg);
    }

    public String getName() {
        return name;
    }

    public String getReg() {
        return reg;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

public int calculateFee(){
        return  admissionFee+ normalSemesterFee;
}

}
