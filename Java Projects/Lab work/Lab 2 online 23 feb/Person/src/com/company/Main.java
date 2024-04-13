package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("This is Class of Person");
        Person Ali = new Person();
        //Accesing the and modifing the data
        System.out.println("The name of Perosn is Ali");
        System.out.println("The height of ALi ");
        System.out.println(Ali.height = 5.7);
        System.out.println("The Date  of Birth of  ALi is ");
        System.out.println( Ali.DateofBirth = "5 March 1998");
        Ali.speedup(20);
        System.out.println("The speed of Ali at running is :  "+ Ali.speed);

        // Class of Car
        System.out.println();
        System.out.println("\t\tThis is the class of Car");

        Car m23 = new Car();
        // Accessing Data
        System.out.println("The name of car is : "+m23.name);
        System.out.println("The name of company is : "+m23.comp);
        System.out.println("Car falls in the catagory of  : "+m23.type);
        System.out.println("Car produce horse power  : "+m23.hp);
        System.out.println("Torque of the car is : "+m23.torque);
        m23.roof("Open Sun Roof");
        System.out.println("the seed pf car is: "+m23.getSpeed());
        System.out.println("the seed pf car is: "+m23.getSpeed());




    }
}
