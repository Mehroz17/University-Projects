// Lab 3 5March 2021
//  Topic: Constructor
package com.company;
import java.util.Scanner;
public class CitizenApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        // Making  A CIttizen clas form CNIC
        CitizenData citizen1 = new CitizenData(36302);  // When we make an object a default constructor will be made in the class
        // Its purpose will be to initalize the values

        // Making an other object of Government Type citizen
        CitizenData GovtCitizen = new CitizenData(363021 , "Government Type ");

        // Making an other citizen whoes application is pending
        CitizenData citizen2 = new CitizenData();

        // CAlling Setters and Getters
        citizen1.setName();
        citizen1.getName();
        citizen1.setCNIC();
        citizen1.getCNIC();
        citizen1.setType();
        citizen1.getType();

         */
//Changing Address
        System.out.println("Enter House Number Street Name and City:  ");
CitizenData citizen1 = new CitizenData();

citizen1.ChangeAddress(citizen1.houseNumber= input.nextInt(), citizen1.streetName=input.nextLine(), citizen1.city3 = input.nextLine());
citizen1.Address(citizen1.houseNumber, citizen1.streetName, citizen1.city3, citizen1.address);
    }



}
