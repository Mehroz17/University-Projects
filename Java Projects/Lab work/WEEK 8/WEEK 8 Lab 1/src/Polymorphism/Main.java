package Polymorphism;
//Topic Polymorsphism

// binding polymorphism
/*
Polymorphism allow us to shrink code
 */
public class Main {
    public static void main(String[]args){

        Student undergrad = new Undergraudate("Mehroz","FA20-BSE-000");
        Student pstg = new Postgraduate("Ali","FA17-BCS-001");
        Student diploma = new Deploma("Ahmed","FA20-BSE-089");
        Challan challan1 = new Challan();
        challan1.printChallan(undergrad);
        challan1.printChallan(pstg);
        challan1.printChallan(diploma);
    }
}
