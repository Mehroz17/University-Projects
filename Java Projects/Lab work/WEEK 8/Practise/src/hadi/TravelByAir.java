package hadi;
public class TravelByAir extends hello{

    public TravelByAir(String name, String cnic) {
        super(name, cnic);
    }

    private int generateGateNo(){
        int max = 20, min = 1;
        int gateNo =(int)Math.floor(Math.random()*(max-min+1)+min);
        return gateNo;
    }

    private int generateFlightNo(){
        int max = 500, min = 100;
        int flightNo =(int)Math.floor(Math.random()*(max-min+1)+min);
        return flightNo;
    }
}
