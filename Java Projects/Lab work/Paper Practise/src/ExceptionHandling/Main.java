package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String name = null;
        String cnic = null;


        try{
            System.out.print("enter Name: ");
            String n = input.nextLine();
            String r ="\\p{Upper}(\\p{Lower}+\\s?)";
            if(n .matches(r)){
                name = n;
            }
            else {
                throw new InputMismatchException();
            }

        }catch (InputMismatchException e){
            System.out.println("Enter Name Properly");
        }

        try{
            System.out.print("Enter CNINC: ");
            String c = input.nextLine();
            String re ="^[0-9+]{5}-[0-9+]{7}-[0-9]{1}$";
            if(c.matches(re)){
               cnic  = c;
            }else {
                throw new InputMismatchException();
            }
        }catch (InputMismatchException e){
            System.out.println("Lenght of CNinc is not valid");
        }

        Calculator c = new Calculator(name,cnic);
        c.data();

        }

}