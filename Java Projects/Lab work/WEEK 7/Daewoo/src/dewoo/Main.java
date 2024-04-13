package dewoo;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
Scanner input = new Scanner(System.in);
System.out.println("\t\t\t\t\tWelcome to Daewoo ");
System.out.println("1. Single Tour\n2. Return Travel\n3.Full Package");
System.out.print("Press 1 to for Single 2 for Return Travel and 3 for Full Package: ");
int choice = input.nextInt();

if(choice == 1){
    System.out.print("Enter your Name:  ");
    input.nextLine();
    String na = input.nextLine();
    System.out.print("Enter Destination:     ");
    String die = input.nextLine();
    System.out.print("Enter you distance:     ");
    int dis = input.nextInt();
    Single p1 = new Single(die, dis , na);

p1.printing();

}
else if  (choice==2){
            System.out.print("Enter your Name:  ");
             input.nextLine();
            String na = input.nextLine();
            System.out.print("Enter you Destination:     ");
            String dis = input.nextLine();
            System.out.print("Enter Distance:     ");
            double di = input.nextInt();
            System.out.print("Enter Locations you want to visit in "+ dis+ " :");
            int lo = input.nextInt();
            System.out.print("Enter the time at which you want to go :  ");
            String time = input.nextLine();
            RTravel p2 = new RTravel(dis,di,na,lo,time);
            p2.printing();
       }
else if(choice == 3){
    System.out.print("Enter your Name:  ");
    input.nextLine();
    String na = input.nextLine();
    System.out.print("Enter you Destination:     ");
    String dis = input.nextLine();
    System.out.print("Enter Distance:     ");
    double di = input.nextInt();
    System.out.print("Enter number of people:  ");
    int no = input.nextInt();
    System.out.print("Enter number of days you want to travel:  ");
    int days = input.nextInt();
    System.out.println("How many locations for sight seeings: ");
    int sight = input.nextInt();
    String [] si = new String[10];
    for (int i  = 0 ;i<=sight;i++){
        si[i] = input.nextLine();
    }
    Full o5 = new Full(dis,di,na,no,sight,si,days);
o5.printing();
}
else
    System.out.println("Wrong command");



    }
}
