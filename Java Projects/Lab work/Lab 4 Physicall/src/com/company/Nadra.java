package com.company;
// Topic
public class Nadra {
    public static void main(String[] args) {
        Address citizenPresentAddress = new Address(35,"BilalLane","Peshawar","KPK");
                NationalIdentityCard citizen = new
                NationalIdentityCard("Ali","Sardar","Male","2020-02-25","KPK",
                citizenPresentAddress);
        citizen.printDetails();
        citizen.getAddress();
    }
}