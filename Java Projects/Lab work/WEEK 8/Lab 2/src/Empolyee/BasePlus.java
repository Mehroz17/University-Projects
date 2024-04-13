package Empolyee;

public class BasePlus extends Commisiond {

    private double basicSalary;


    public BasePlus(int id, String name, int commision, int totalSale, double basicSalary) {
        super(id, name, commision, totalSale);
        this.basicSalary = basicSalary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public double getEarning() {
        return basicSalary*getCommision()*getTotalSale();
    }
}
