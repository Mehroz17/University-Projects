package Week9LAb2;

public class Faculty extends Admin implements Salary{

    private double DA;
    private final static double bsicpay = 40000;

    public Faculty(String ID, String name, char attendence, String email, double distance, double DA) {
        super(ID, name, attendence, email, distance);
        setDA(DA);
    }

    public double getDA() {
        return DA;
    }

    public void setDA(double DA) {
        this.DA = DA;
    }

    @Override
    public double salaryCalculation() {
        if(getAttendence() == 'N'){
            System.out.println("\t\tEmployee is on leave");
            return 0;
        }
        else
        {
            double s =bsicpay*80+DA+getTA();
            return s;
        }
    }
}
