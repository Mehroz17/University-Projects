package com.company;

public class CitizenData {
    // States
    String name;
    int CNIC;
    String type;                // Constructor OverLoading

    // Constructor
    // Rules for Making constructor
    /*
    1. Its scope will be public always
    2. It will return nothing
    3. Its name will be same as of Class name
     */
    public CitizenData(int CNIC){
        this.CNIC = CNIC;           // This is initializing the value given from the main class
    }

    // Making Contructor for Govt Citizen
    public CitizenData(int CNIC , String type){
        this.CNIC = CNIC;
        this.type = type;
    }

    /* When there are already constructors present in the class with the parameter then we have to make
     a default constuctor
     */

    // A default Constructor
    public CitizenData(){

    }

    //Making Seters and Getters
// Of Name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //Of CNIC

    public void setCNIC(int CNIC) {
        this.CNIC = CNIC;
    }

    public int getCNIC() {
        return CNIC;
    }
//OF Type
    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }


    // Changing Address
    int houseNumber;
    String streetName;
    String city3;
    String address;

    //Methods
    //public void ChangeAddress(int houseNumber){
        //this.houseNumber = houseNumber;
    //}
    public  void ChangeAddress(int houseNumber , String streetNumber , String city3){
        this.houseNumber = houseNumber;
        this.streetName = streetNumber;
        this.city3 = city3;

    }

    public void Address(int houseNumber , String streetName ,String city3,String address){
        address ="  " + houseNumber + "  " + streetName+ " " + city3 ;
        System.out.println("The  New Address  of the Citizen is :  "+address);
    }
}
