package Week9LAb2;

public class FixedEmployee extends Employee implements Salary{

    private int fixedSalary = 1800;
    private int numberOfLectures;

    public FixedEmployee(String ID, String name, char attendence, String email, int numberOfLectures) {
        super(ID, name, attendence, email);
    setNumberOfLectures(numberOfLectures);
    }

    public int getNumberOfLectures() {
        return numberOfLectures;
    }

    public void setNumberOfLectures(int numberOfLectures) {
        this.numberOfLectures = numberOfLectures;
    }

    @Override
    public double salaryCalculation() {
        if (getAttendence() == 'N'){
            System.out.println("\t\tThe Employee is not Preset");
            return 0;
        }
        else {
            double s =  numberOfLectures*fixedSalary;
            return s;
        }
    }

    @Override
    public double getTA() {
        return 0;
    }
}
