package Polymorphism;

public class Postgraduate extends Student{
    private  String type = "PostGraduate";
    final static int postgraduatExtraFee = 35000;
    public Postgraduate(String name, String reg){
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
        return  super.calculateFee()+postgraduatExtraFee;
    }
}
