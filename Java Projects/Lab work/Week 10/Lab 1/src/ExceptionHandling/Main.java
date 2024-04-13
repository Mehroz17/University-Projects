package ExceptionHandling;
// Date: 28 April 2021
//Topic: Exception Handling

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        BankAccount bac = new BankAccount();

// Uncheck Exceptions we have done

//        try{
//            System.out.println("Enter Transfer Amount");
//            bac.setTrancferAmount(input.nextInt());
//            // in case of exception , it is java that is passing that exception to catch
//            //in case of abnoraml event, exception information is carried in an object
//        }catch (InputMismatchException | IllegalArgumentException a){ //InputMismatch is a senario . There are lots of senarios which will be handling exceptions
//            System.out.println("Please provide valid input: ");
//        }finally { // it is important block, it runs anyway either we provied valid or non valid input
//            System.out.println("Runs any way");
//        }
        try {
            System.out.println("Enter Email");
            bac.setEmail(input.nextLine());
        }catch (InputMismatchException a){
            System.out.println("Mismatch ");
        }

    }
}
