package Senario1;

public class AriplaneBussiness extends Ariplane {
    public AriplaneBussiness(String name, String CNIC, String source , String destination, String dateandTime, int numberOfSeats,String seatType){
        super(name,CNIC,source,destination,dateandTime,numberOfSeats,seatType);
    }

    public double rent(){
        if(getSeatType().equals("W")){return super.rent()*4;}
        else if(getSeatType().equals("A")){return super.rent()*3;}
return 0;
    }

    @Override
    public void printingAriplane() {
        super.printingAriplane();
    }
}
