package Week9LAb2;

public class Admin extends Employee implements Salary{
    private double TA;
    private final static double bsicpay = 30000;
    private  double distance;

        public Admin(String ID, String name, char attendence, String email, double distance) {
        super(ID, name, attendence, email);
    setTA(distance);
    }

    public double getTA() {
        return TA;
    }

    public void setTA(double distance) {
        TA = distance*100;
    }

    @Override
    public double salaryCalculation() {
        if(getAttendence() == 'N'){
            System.out.println("Employee is not presnt");
            return 0;
        }
        else
        {
            double s = bsicpay*80+getTA();

            return s;
        }

    }
}
