package inheritance;

import java.util.Scanner;

public class Person {
    private String name;
    private String designation;
Scanner input = new Scanner(System.in);
    public Person(String name , String designation){
        setName(name);
        setDesignation(designation);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public void learn(){
        System.out.println("The name of person:   " + name);
        System.out.println("The designation of person is:   " + designation);
        System.out.println("Press 1 to Learn walk\nPress 2 to Learn run");
        int a = input.nextInt();
        if(a == 1){System.out.println("\t\tThe person is learning how to run");}
        if(a == 2){System.out.println("\t\tThe person is learning how to run");}

    }
    public void walk(){
        System.out.println("Press 1 to walk\nPress 2 to run");
int a = input.nextInt();
if(a == 1 ){
    System.out.println("\t\t\tThe person is walking");
}
else if (a == 2){System.out.println("\t\t\tThe person is running");}

    }
    public void eat(){
        System.out.println("This peron like to eat a lot of:   choloate");
    }



}
