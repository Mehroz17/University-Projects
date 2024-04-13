package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
Employee em1 = new Employee();
System.out.println("Enter the Name of Employee:  ");
String name = input.nextLine();
em1.setName(name);
System.out.print("Enter your Grade:");
String grade = input.nextLine();
em1.setGrade(grade);
        System.out.print("Enter your working hours: ");
        int hours = input.nextInt();
        em1.setWork_H(hours);
        System.out.println();
        System.out.println("Name of Employee == "+em1.getName());
        System.out.println("Grade of Employee == "+em1.getGrade());
        System.out.println("Working Hours of Employee == "+em1.getWork_H());
        em1.calS();

    }
}
