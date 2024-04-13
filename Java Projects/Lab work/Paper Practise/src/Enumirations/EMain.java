package Enumirations;

import java.util.Scanner;

public class EMain {
    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the city: ");
     String c = input.nextLine();

       C m = new C(c);
        m.show();


    }
}
