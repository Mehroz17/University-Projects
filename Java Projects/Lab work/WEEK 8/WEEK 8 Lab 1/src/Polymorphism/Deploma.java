package Polymorphism;

public class Deploma extends Student{

    private  String type = "Demploma Student";

    final static int deplomaEtraFee = 35000;

    public Deploma(String name, String reg){
        super(name,reg);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int calculateFee(){
        return  super.calculateFee()+deplomaEtraFee;
    }
}

