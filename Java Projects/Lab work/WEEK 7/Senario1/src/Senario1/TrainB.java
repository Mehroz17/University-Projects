package Senario1;

public class TrainB extends Train{
    public TrainB(String name, String CNIC, String source , String destination, String dateandTime, int numberOfSeats,String seatType){
        super(name,CNIC,source,destination,dateandTime,numberOfSeats,seatType);
    }

    public double trainRent(){
        if(getSeatType().equals("B")){
            return super.trainRent() * 3;
        }
        else if(getSeatType().equals("S")){
            return super.trainRent() * 2 ;
        }
        return 0;
    }

    public void printing(){
        super.printing();
    }
}
