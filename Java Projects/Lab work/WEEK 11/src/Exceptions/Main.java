package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int input;

        System.out.println("Begin. ");
        System.out.println("Please Enter a number in range 0 to 50: ");
        // this is unchecked exceptions like we want number between 0 to 50 but the user is entering 55, this is not the problem of compl
        try { // dependent lines are  always in try block
            input = scan.nextInt();   // Java's default throw is operating
        // whatever the type of exception , try block creats an object of the exception and throws it to
            // catch block and the exception info  carried in an  object by the same type in catch block

            if (input <0 || input > 50){
                // keywrod throw is used to throw your own exception
                // your are throwing yourself
                throw new IllegalArgumentException("Out of Range");
            }
        }
        catch (InputMismatchException | IllegalArgumentException e ) // we can use multiple and same catch
        {
            System.out.println("invalid input Out of Range ");  // this will not crash the program
        }
//        catch (IllegalArgumentException el){
//           //System.out.println("Out of Range ");
//            System.out.println(el.getMessage()); // This is catching the error from throw
//        }

        finally {
            System.out.println("I am Finally"); // it will  work if error present or not present
        }
        System.out.println("Finish. ");
    }
}
