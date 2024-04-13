package salary;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Press 1 for Faculty\nPress 2 for Admin\nPress 3 for Fixed Employee\nPress 4 for Daily Wagers");
        int choice = input.nextInt();
        Slip slip =new Slip();
        if (choice == 1) {
            System.out.println("\nEnter the name of Employee: ");
            String name1 = input.nextLine();
            input.nextLine();
            System.out.print("Enter the ID: ");
            String ID = input.nextLine();
            System.out.print("Enter the email: ");
            String email = input.nextLine();
            System.out.print("Is employee is Presnt (Y/N): ");
            char att = input.next().charAt(0);
            System.out.print("Enter the distance you travel in one month for calculating TA: ");
            double dis = input.nextDouble();
            System.out.print("Enter your Dinner Expenses: ");
            double dinner = input.nextDouble();
            Employee faculty = new Faculty(name1, ID, email, att, dis, dinner);
            slip.printslip(faculty);
        }

        if (choice == 2) {
            System.out.print("\nEnter the name of Employee: ");
            String name2 = input.nextLine();
            input.nextLine();
            System.out.print("Enter the ID: ");
            String ID = input.nextLine();
            System.out.print("Enter the email: ");
            String email = input.nextLine();
            System.out.print("Is employee is Presnt (Y/N): ");
            char att = input.next().charAt(0);
            System.out.print("Enter the distance you travel in one month for calculating TA: ");
            double dis = input.nextDouble();
            Employee admin = new Admin(name2, ID, email, att, dis);
            slip.printslip(admin);
        }
        if (choice == 3) {
            System.out.print("\nEnter the name of Employee: ");
            String name = input.nextLine();
            input.nextLine();
            System.out.print("Enter the ID: ");
            String ID = input.nextLine();
            System.out.print("Enter the email: ");
            String email = input.nextLine();
            System.out.print("Is employee is Presnt (Y/N): ");
            char att = input.next().charAt(0);
            System.out.print("Enter teh number of Lectures: ");
            int lectures = input.nextInt();
           // FixedEmployee fixed = new FixedEmployee(name, ID, email, att, lectures);
            //slip.printing(fixed);
           // slip.salaryprint(fixed);
        }
        if (choice == 4) {
            System.out.print("\nEnter the name of Employee: ");
            String name4 = input.nextLine();
            input.nextLine();
           // Wager wager = new Wager(name4);

        }
    }
}
