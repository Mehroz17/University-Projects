package salary;

public class Faculty extends Admin implements SalaryMethod{
    private double DA;
    private final static double bsicpay = 40000;
    public Faculty(String name, String ID, String email, char attendence, double distance,double DA) {
        super(name, ID, email, attendence, distance);
        setDA(DA);
    }

    public double getDA() {
        return DA;
    }

    public void setDA(double DA) {
        this.DA = DA;
    }

    @Override
    public void calculateSalary() {
        if(getAttendence() == 'N'){
            System.out.println("\t\tEmployee is on leave");
        }
        else
        {
            System.out.println("Salary : " + bsicpay*80+DA+getTA());
        }
    }
}
