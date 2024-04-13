// LAb 2 Physical 26 Feb 2021
// \
package com.company;

import java.util.Date;
import java.util.Scanner;

// Result Decalartion
public class Main {

    public static void main(String[] args) {
        student First = new student();
        Scanner input = new Scanner(System.in);
        System.out.println("\t\t\tCGPA Calculator");
        System.out.println("Enter the name of Student:");
        First.setName(input.nextLine());

        System.out.println("Enter the Registration number  of Student:");
        First.setReg(input.nextLine());
System.out.println("Enter ICT marks");
First.setIct(input.nextDouble());
First.setEca(input.nextDouble());
System.out.println("The total MArks is: "+ First.total());
        System.out.println("The total CGPA is: "+ First.CGPA());
        if(First.cgpa<=50)
            System.out.println("Your CGPA is 3.5");




    }
}
