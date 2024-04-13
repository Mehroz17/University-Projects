package com.company;
// 23 February 2021 Lab 2 online
public class Main {

    public static void main(String[] args) {
	// Creating a Car object
        System.out.println("Creating a Car object");
// it is outside world, implimentation of real world object is not trusted
        // This the way to creat a new object this will creat a new object like the attributes we have given in the Car Class
        Car hondaCity = new Car(); //Pranenthesis is a constructure
        // we want to give manufacture name
//Accesing class States
        hondaCity.manufracture = "Honda"; // we have given the name of manufactureer
        hondaCity.color = "Black";
        hondaCity.enginecpacity = "1500cc";
        System.out.println(hondaCity.manufracture = "Honda");
        System.out.println(hondaCity.color = "Black");
//Accesing class Methods

        System.out.println("you are in gear ");
   System.out.println(hondaCity.gearchange(2));
   //Accessing speed method
        System.out.println("Your initilzed value is: "+ hondaCity.speed);
        hondaCity.speedUp(120.26);
    }


}
