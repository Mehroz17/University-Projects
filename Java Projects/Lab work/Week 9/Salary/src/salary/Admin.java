package salary;

public class Admin extends Employee implements SalaryMethod{

    private double TA;
    private final static double bsicpay = 30000;
    private  double distance;
    public Admin(String name, String ID, String email, char attendence,double distance) {
        super(name, ID, email, attendence);
        setTA(distance);

    }

    public double getTA() {
        return TA;
    }

    public void setTA(double TA) {
        this.TA = TA;
    }

    @Override
    public void calculateSalary() {
        if(getAttendence() == 'N'){
            System.out.println("\t\tEmployee is on leave");
        }
        else
        {
            System.out.println("Salary : " + bsicpay*80+getTA());
        }
    }
}
