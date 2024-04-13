package Inheritance;


//parent class, base class, super class

public class Student {

    //we always apply data hiding concept unless otherwise you are sure to use other access modifier
    //scope of private access modifier is only within that particular class
    private String name;
    private String id;

    protected String uniName = "COMSATS";

    int admissionFee = 10000;
    int semesterFee = 80000;

    public Student() {

    }

    public Student(String name, String id) {
        setName(name);
        setId(id);
    }

    //if data hiding is applied, then encapsulation is applied as well
    public void setName(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println(name);
    }

    //if data hiding is applied, then encapsulation is applied as well
    public void setId(String id) {
        this.id = id;
    }

    public int calculateFee() {
        return admissionFee + semesterFee;
    }

    public void getId() {
        System.out.println(id);
    }

    @Override
    public String toString() {
        return "Hello from grand parent class student";
    }

}

