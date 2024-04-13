package Week9LAb2;

public class Wager implements Salary{
    private String name;
    private final int salary = 700;

    public Wager(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double salaryCalculation(){
        return salary;
    }
}
