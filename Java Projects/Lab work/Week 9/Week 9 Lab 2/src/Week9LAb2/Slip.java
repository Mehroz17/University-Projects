package Week9LAb2;

import java.util.ArrayList;
import java.util.Scanner;

public class Slip {

// making arrayList
    ArrayList<Employee> employeeArrayList = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    // Add Function to h=get all the informations here o we do not need to make all these statements in main class
    public void adddataofemployee(){
        int choice;
        String name;
        String ID = null;
        String email = null;
        Employee employee;
        double dis = 0;
        char att = 0;
        System.out.println("Selesct Employee Type ");
        System.out.println("-> 1  FACULTY\n-> 2 Admin\n->3 Fized Pay\n-> 4 Wager ");
        choice = input.nextInt();

        System.out.print("Enter Name:  ");
        input.nextLine();
        name = input.nextLine();

        if (choice != 4 ){
            System.out.print("Enter the ID of Employee: ");
            ID = input.nextLine();
            System.out.print("Enter Email: ");
            email = input.nextLine();
            System.out.println("IS Employee Present(Y/N)");
            att = input.next().charAt(0);
            System.out.print("Enter the Travle Distance: ");
             dis = input.nextDouble();
        }
        if(choice == 1){
            System.out.print("Enter Dinner Expence: ");
            double dinner = input.nextDouble();
            employee = new Faculty(ID,name,att,email,dis,dinner);
            employeeArrayList.add(employee);
        }
      else   if (choice == 2){
          employee = new Admin(ID,name,att,email,dis);
          employeeArrayList.add(employee);
        }
      else if(choice == 3){
            System.out.print("Enter number of Lectures: ");
            int numberlecture = input.nextInt();
          employee = new FixedEmployee(ID,name,att,email, numberlecture);
        }
    }
    public void printing() {
        System.out.println("\t\t\t\t-------------------Salary Slip------------------");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("--------------------------COMSATS UNIVERSITY ISLAMABAD--------------------------------");
        for (Employee employee : employeeArrayList) {
            System.out.println("Name: " + employee.getName());
            System.out.println("ID: " + employee.getID());
            System.out.println("Email Address:  " + employee.getEmail());

            if (employee instanceof Admin) {
                System.out.println("TA: " + employee.getTA());
            }
            if (employee instanceof Faculty) {
                System.out.println("DA: " + ((Faculty) employee).getDA());
            }
            System.out.println("Salary: " + employee.salaryCalculation());

        }
    }


    public void wager(Wager wager){
        System.out.println("\t\t\t\t-------------------Salary Slip------------------");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("--------------------------COMSATS UNIVERSITY ISLAMABAD--------------------------------");

        System.out.println("Name: ");
        System.out.println("Salary of wager is: "+wager.salaryCalculation());
    }
    }
