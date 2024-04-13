package com.company;

import javax.annotation.processing.SupportedSourceVersion;

public class Car {
// Statics of CAR
    String comp = "Kia";
    String type = "MPV";
    String name = "Grande Carnival";
    String hp = "300bhp";
    String torque = "350 Nm";
     private int speed = 0;
    String sun = " ";
//Methods or functions of the Car
    void roof( String commad){

        if( commad == "Open Sun Roof"){
            System.out.println("the sun roof is opened");
        }
        else if(commad == "Close Sun Roof"){
            System.out.println("the sun roof is closed");
        }
    }

    // Getter and Setters
    public void setspeed(int speed){
        if (speed > 160)
            System.out.println("Maximum Speed Have been Achived");
        else
            this.speed = speed;
    }
    public int getSpeed(){
        return this.speed;
    }

}
