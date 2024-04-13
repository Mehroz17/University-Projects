package Empolyee;

public class Main {
    public static void main(String [] args){


        Employee e1 = new Commisiond(1,"Ali",200, 240);
        e1.setBankAccountNumber(20);

        Employee e2 = new BasePlus(2,"Sajid",2000,300,2500.32);
        e2.setBankAccountNumber(50);
        Accounts a1 = new Accounts();
        a1.deposit(e1);
        a1.deposit(e2);
    }
}
