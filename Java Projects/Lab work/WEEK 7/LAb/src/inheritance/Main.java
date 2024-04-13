package inheritance;

import java.util.Scanner;

// Lab of Inheritance
public class Main {
    public static  void main(String[] args){
// using constructor
        Hostalite hstd = new Hostalite("Ali " , "FA20-BSE-000" , "johar Hostel", 42);
Student st1 =new Student("Jinnah" , "Fa20-BSE-007");
//        System.out.println(hstd.getName());
//        System.out.println(hstd.getReg());
//        System.out.println("Hostel name:  "+ hstd.getHostelName());
//        System.out.println("Room number:  "+hstd.getRoomNo());
//        System.out.println("Hostalite Student");
        hstd.Challan();

        System.out.println("\n\nStudnet");
        st1.Challan();

// Mutlti level inheritance

        Masters m1 = new Masters();
        System.out.println(m1.type);

// Accessing parent State
        m1.setTechnology("Cyber");
        m1.getTechnology();

        //Accessing grand parent State


       }
}
