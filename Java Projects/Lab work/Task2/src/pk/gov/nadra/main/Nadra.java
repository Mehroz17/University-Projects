package pk.gov.nadra.main;

import pk.gov.nadra.NI.NationalIdentityCard;
import pk.gov.nadra.common.Address;

public class Nadra {
    public static void main(String[] args) {
        Address citizenPresentAddress = new Address(35,"BilalLane","Peshawar","KPK");
        NationalIdentityCard citizen = new
                NationalIdentityCard("Ali","Sardar","Male","2020-02-25","KPK", citizenPresentAddress);
        citizen.printDetails();
        citizen.getAddress();
    }
}

