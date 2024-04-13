package practise;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);


//            try {
//                String name = input.nextLine();
//                String reg = "\\p{Upper}(\\p{Lower}+\\s?)";
//                if(name.matches(reg)){
//                    Man m  = new Man(name);
//                }
//                else {
//                    throw new InputMismatchException() ;
//                }
//            }catch (InputMismatchException m){
//                System.out.println("Input does not match the pattren");
//            }

//

        System.out.println("Enter the name: ");
        String m = null;
        try {
            String n = input.nextLine();
            String rege= "\\p{Upper}(\\p{Lower}+\\s?)";
        if(n.matches(rege)){
            m = n;
        }
        else {
            throw new InputMismatchException();
        }
        }catch (InputMismatchException m1){
            System.out.println("Name patren is not valid;");
        }

        System.out.println("Enter Gender ");
        char g1= '\u0000';
        try {
            char g = input.next().charAt(0);
            if(g == 'M' || g == 'F'){
                g1 = g;
            }
            else {
                throw new InputMismatchException();
            }
        }catch (InputMismatchException m2){
            System.out.println("Enter M or F only");
        }


        String cn= null;
 System.out.print("Enter Cnin");
            try {
                input.nextLine();
              String cnic = input.nextLine();
              String reg = "^[0-9+]{5}-[0-9+]{7}-[0-9]{1}$";
                if (cnic.matches(reg)){
                  cn = cnic;
                }
                else {
                    throw new InputMismatchException();
                }
            }catch (IllegalArgumentException| InputMismatchException  e){
                System.out.println("The lenght of CNINC is not valid");
            }


        System.out.println("\n\t\t\t\tChoose Airline");
        System.out.println("->Press 1 for Emiriates\n-> 2 PIA");
        String ar = null;

        try{
            int i = input.nextInt();
            if(i == 1 ){
                ar = "Emirates";
            }
            else if (i ==2){
                ar = "PIA";
            }
            else {
                throw new InputMismatchException();
            }
            }catch (InputMismatchException m3){
            System.out.println("\t\t\tError");
            System.out.println("Enter 1 for Emirates of 2 for PIA ");
        }
            B b = new B(m,g1,cn,ar);


if(m == null || g1 =='\u0000' || cn == null || ar ==null){
    System.out.println("Go check that you have given write information");
}
else {
    b.printingDetails();
}

    }

}
