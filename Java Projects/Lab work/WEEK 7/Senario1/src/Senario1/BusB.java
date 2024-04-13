package Senario1;

public class BusB extends  Bus {
    public BusB(String name, String CNIC, String source , String destination, String dateandTime, int numberOfSeats,String seatType){
        super(name,CNIC,source,destination,dateandTime,numberOfSeats,seatType);

    }

    public double busrent(){
        if(getSeatType().equals("W")){
            return super.busrent()*2;
        }
        else if(getSeatType().equals("A")){
            return super.busrent()*1.5;
        }
        return 0;
    }

    public void busprinting(){
        super.busprinting(); }

}
