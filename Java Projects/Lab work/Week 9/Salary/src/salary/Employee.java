package salary;

public  abstract class Employee {

    private String name;
    private String ID;
    private String email;
    private char attendence;

    public Employee(String name, String ID, String email, char attendence) {
        setName(name);
        setID(ID);
        setEmail(email);
        setAttendence(attendence);
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
}
