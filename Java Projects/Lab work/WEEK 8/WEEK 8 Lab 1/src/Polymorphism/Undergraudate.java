package Polymorphism;

public class Undergraudate extends  Student{

    private  String type = "UnderGraduate";
    final static int undergraduatExtraFee = 20000;

    public Undergraudate(String name, String reg){
        super(name,reg);
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public int calculateFee(){
        return  super.calculateFee()+undergraduatExtraFee;
    }
}
