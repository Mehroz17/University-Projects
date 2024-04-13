package com.company;

public class Person {
    // States -- Data

String DateofBirth;
double height;
int speed = 0;
String n;

int speedup(int speedValue){
    speed  = speed + speedValue;
    //System.out.println("the speed of person is incresed by: "+ speed);
    return  speed;
}
}
