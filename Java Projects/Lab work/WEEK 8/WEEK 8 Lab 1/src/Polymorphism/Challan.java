package Polymorphism;

public class Challan {
// This is static binding
    public void printChallan(Student student){

        System.out.println(student.uniname);
        System.out.println(student.getReg());
        System.out.println( student.getName());
        //System.out.println(undergrad.getType());
        System.out.println("Outstanding Fee");
        System.out.println(student.calculateFee());

    }

//    public void printChallan(Student pstg){
//        System.out.println("\n\nChallan for Post Graduate Studnet");
//        System.out.println(pstg.uniname);
//        System.out.println(pstg.getReg());
//        System.out.println(pstg.getName());
//        System.out.println(pstg.getType());
//        System.out.println("Outstanding Fee");
//        System.out.println(pstg.calculateFee());
//
//    }
}
