package Empolyee;

public class Commisiond extends Employee{
    private int commision;
    private int totalSale;

    public Commisiond(int id, String name, int commision, int totalSale) {
        super(id, name);
        this.commision = commision;
        this.totalSale = totalSale;
    }

    public int getCommision() {
        return commision;
    }

    public void setCommision(int commision) {
        this.commision = commision;
    }

    public int getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(int totalSale) {
        this.totalSale = totalSale;
    }

    @Override
    public double getEarning() {
        return commision*totalSale;
    }
}
