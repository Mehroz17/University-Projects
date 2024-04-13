package Senario1;

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\t\t\tModes of Travel");
        System.out.println("Press 1.To Travel from Plane\nPress 2. To Travel From Train\nPress 3 .to Travel From Bus");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Enter your Class (B/E):   ");
            input.nextLine();
            String classt = input.nextLine();
            if (classt.equals("E")) {
                System.out.print("Enter your Name:  ");
                String name = input.nextLine();
                System.out.print("Enter You CNINC: ");
                String cnic = input.nextLine();
                System.out.print("From where you want to Travel; ");
                String source = input.nextLine();
                System.out.print("Enter Your Destination:   ");
                String des = input.nextLine();
                System.out.print("Enter date and time at which you want to travel:  ");
                String da = input.nextLine();
                System.out.print("Enter number of seats:  ");
                int seat = input.nextInt();
                System.out.print("Enter seat Type Window or Aisle(A/W):  ");
                input.nextLine();
                String seatType = input.nextLine();
                Ariplane p1 = new Ariplane(name, cnic, source, des, da, seat, seatType);
                System.out.println("\t\t\tYour Airpalne Ticket");
                System.out.println("Your Class : Bissines");
                p1.printingAriplane();
            } else if (classt.equals("B")) {
                System.out.print("Enter your Name:  ");
                String name = input.nextLine();
                System.out.print("Enter You CNINC: ");
                String cnic = input.nextLine();
                System.out.print("From where you want to Travel; ");
                String source = input.nextLine();
                System.out.print("Enter Your Destination:   ");
                String des = input.nextLine();
                System.out.print("Enter date and time at which you want to travel:  ");
                String da = input.nextLine();
                System.out.print("Enter number of seats:  ");
                int seat = input.nextInt();
                System.out.print("Enter seat Type Window or Aisle(A/W):  ");
                input.nextLine();
                String seatType = input.nextLine();
                AriplaneBussiness p2 = new AriplaneBussiness(name, cnic, source, des, da, seat, seatType);
                System.out.println("\t\t\tYour Airpalne Ticket");
                System.out.println("Your Class : Bissines");
                p2.printingAriplane();

            }

        } else if (choice == 2) {
            System.out.print("Enter your Class (B/E):   ");
            input.nextLine();
            String trainclass = input.nextLine();
            if (trainclass.equals("E")) {
                System.out.print("Enter your Name:  ");
                String name = input.nextLine();
                System.out.print("Enter You CNINC: ");
                String cnic = input.nextLine();
                System.out.print("From where you want to Travel; ");
                String source = input.nextLine();
                System.out.print("Enter Your Destination:   ");
                String des = input.nextLine();
                System.out.print("Enter date and time at which you want to travel:  ");
                String da = input.nextLine();
                System.out.print("Enter number of seats:  ");
                int seat = input.nextInt();
                System.out.print("Enter seat Type Birth or single(S/B):  ");
                input.nextLine();
                String seatType = input.nextLine();
                Train p4 = new Train(name, cnic, source, des, da, seat, seatType);

                System.out.println("\t\tYour Train  Ticket");
                System.out.println("Class:   Economy");
                p4.printing();
            }
            if (trainclass.equals("B")) {
                System.out.print("Enter your Name:  ");
                String name = input.nextLine();
                System.out.print("Enter You CNINC: ");
                String cnic = input.nextLine();
                System.out.print("From where you want to Travel; ");
                String source = input.nextLine();
                System.out.print("Enter Your Destination:   ");
                String des = input.nextLine();
                System.out.print("Enter date and time at which you want to travel:  ");
                String da = input.nextLine();
                System.out.print("Enter number of seats:  ");
                int seat = input.nextInt();
                System.out.print("Enter seat Type Birth or single(S/B):  ");
                input.nextLine();
                String seatType = input.nextLine();

                TrainB p5 = new TrainB(name, cnic, source, des, da, seat, seatType);
                System.out.println("\t\tYour Train Ticket Ticket");
                System.out.println("Class:   Bussiness");
                p5.printing();

            }
        }

        else if(choice == 3){
            System.out.print("Enter your Class (B/E):   ");
            input.nextLine();
            String busclass = input.nextLine();

            if(busclass.equals("E")){
                System.out.print("Enter your Name:  ");
                String name = input.nextLine();
                System.out.print("Enter You CNINC: ");
                String cnic = input.nextLine();
                System.out.print("From where you want to Travel; ");
                String source = input.nextLine();
                System.out.print("Enter Your Destination:   ");
                String des = input.nextLine();
                System.out.print("Enter date and time at which you want to travel:  ");
                String da = input.nextLine();
                System.out.print("Enter number of seats:  ");
                int seat = input.nextInt();
                System.out.print("Enter seat Type Window / Aisle(W/A):  ");
                input.nextLine();
                String seatType = input.nextLine();

                Bus p6 = new Bus(name, cnic, source, des, da, seat, seatType);
                System.out.println("\t\tYour Bus Ticket Ticket");
                System.out.println("Class:   Bussiness");
                p6.busprinting();

            }
            if (busclass.equals("B")){
                System.out.print("Enter your Name:  ");
                String name = input.nextLine();
                System.out.print("Enter You CNINC: ");
                String cnic = input.nextLine();
                System.out.print("From where you want to Travel; ");
                String source = input.nextLine();
                System.out.print("Enter Your Destination:   ");
                String des = input.nextLine();
                System.out.print("Enter date and time at which you want to travel:  ");
                String da = input.nextLine();
                System.out.print("Enter number of seats:  ");
                int seat = input.nextInt();
                System.out.print("Enter seat Type Window / Aisle(W/A):  ");
                input.nextLine();
                String seatType = input.nextLine();

                Bus p6 = new Bus(name, cnic, source, des, da, seat, seatType);
                System.out.println("\t\tYour Bus Ticket Ticket");
                System.out.println("Class:   Bussiness");
                p6.busprinting();

            }

        }
    }
}
