package LabFriday21;

import java.util.Scanner;

// Topic
public class Main {
    public static void main(String[] args){
        System.out.println("-> Karachi \n-> Lahore\n-> Islamabad\n-> Peshawar");
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of City: ");
        String name = input.nextLine();
        Data d1 = new Data(name);
        d1.priting();
        System.out.println();
        System.out.println("\t\t\t\tFull List ");
        System.out.println("City\t\t\t\tCoordianates");
        for(Cities s : Cities.values()){
            System.out.println(s.getNameOfCity()+": "+"\t\t\t" + s.getLongitudeLatitudes());
        }

        }
    }

