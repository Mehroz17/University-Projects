package com.company;
// creating a class(blueprint)
public class Car {
    //State -- Data
    String manufracture;
    String color;
    String enginecpacity;
    double speed;
    int gears;
    String modelno;
    int numberofseats;
    int gear = 0;


    // Methods --  Behaviour
    // How we can write methods
    // Creting methods for gear change
    // by convetions the name of methods follows camel casing
int gearchange(int gearValue){   // this is returing a vlue
    return gear = gear + gearValue;
}

void speedUp(double speedValue){
    speed = speed  + speedValue;
    System.out.println("your speed is : "+speed);
}
    /*
    gearchange
    speedup
    brakes
    turnleft
    turnright

 */

}
