package Week9LAb2;

public  abstract class Employee implements Salary {
    private String ID;
    private String name;
    private char attendence;
    private String email;

    public Employee(String ID, String name, char attendence, String email) {
        setAttendence(attendence);
        setName(name);
        setID(ID);
        setEmail(email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getAttendence() {
        return attendence;
    }

    public void setAttendence(char attendence) {
        this.attendence = attendence;
    }
public abstract double getTA();

    @Override
    public double salaryCalculation() {
        return 0;
    }
}
