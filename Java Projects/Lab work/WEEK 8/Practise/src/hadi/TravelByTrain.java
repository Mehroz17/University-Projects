package hadi;
public class TravelByTrain extends Ticket{

    private BoardingPass boardingPass;

    public TravelByTrain(String passengerName, String passengerCnic, String departureCity, String arrivalCity) {
        super(passengerName, passengerCnic, departureCity, arrivalCity);
        boardingPass = new BoardingPass(generateGateNo(), generateTrainNo());
    }

    private int generateGateNo(){
        int max = 20, min = 1;
        int gateNo =(int)Math.floor(Math.random()*(max-min+1)+min);
        return gateNo;
    }

    private int generateTrainNo(){
        int max = 500, min = 100;
        int trainNo =(int)Math.floor(Math.random()*(max-min+1)+min);
        return trainNo;
    }

}
