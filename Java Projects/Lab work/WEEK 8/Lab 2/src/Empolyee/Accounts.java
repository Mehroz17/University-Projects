package Empolyee;

public class Accounts {
    private final static int companyAccount  = 20;
Bank b1 = new Bank();


public void deposit(Employee employee){
    if(employee.getBankAccountNumber()<=0){
        System.out.println("Account number is not Valid");
        return;
        }
    b1.transfer(companyAccount,employee.getBankAccountNumber(),employee.getEarning());
}
}
