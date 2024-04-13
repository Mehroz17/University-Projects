//  LAb 1 19 - 2 -2021
// Topics of Lab :
/*
1 .Variables
types
Range
Size
Rules and conventins
Literlas
2. Print
    3 Different Types
3. Reference Types
   Input
   User
4. Control Structures
   If ifelse
   do while
   for
*/
package com.company;
//Imporitng Library
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
            System.out.println("Hello !");
            //Taking input from user
            System.out.println();
            System.out.println("Using Scanner and taking input from user");

            Scanner input = new Scanner(System.in);
            System.out.println("Enter your Registration number: ");
            String reg = input.nextLine();   //nextLine is for String input only

            System.out.println("Enter your Semester number: ");
            int  sem = input.nextInt();   //nextInt is for Interger  input only

            System.out.println("Enter your Registration CGPA: ");
            double gpa = input.nextDouble();   //nextDouble is for float input only
            System.out.println("\t\tOutput is  Follows");
            System.out.println("Your Registration number is : " + reg);
            System.out.println("YOur Semester number is : "+ sem);
            System.out.println("YOur GPA is :  "+gpa);
            //Printing with printf
// in printf we have to use format specifier for printing with concatication
            System.out.println();
            System.out.printf("Printing with PRintf\n");
            System.out.printf("Your Registration number in print f: %s \n",reg);
            System.out.printf("Your semseter number number in print f: %d \n",sem);
            System.out.printf("Your cgpa in print f: %f \n",gpa);
        }
    }
