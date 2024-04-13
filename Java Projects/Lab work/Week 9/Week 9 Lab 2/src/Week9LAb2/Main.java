package Week9LAb2;

import java.util.Scanner;

/*
Revision

 */

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
Slip slip = new Slip();
        System.out.println("\t\t\tSalary Calulation");
        int choice;
        do {
            System.out.println("->Press 1 to Add Employee\n->Press 2 to Show\n-> Press 3 to exit");
            choice = input.nextInt();
            if(choice == 1){
               slip.adddataofemployee();
                }

                else if (choice == 2) {
                    slip.printing();
                }
                else if (choice == 3) {
                   break;
                }


            else{
                System.out.println("invalid Choice");}
        }while(choice !=3);
    }
}
