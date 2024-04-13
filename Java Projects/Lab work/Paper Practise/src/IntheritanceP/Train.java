package IntheritanceP;

import java.util.Random;

public class Train extends ModeofTravel implements L{
    private int numberofpassenger;
    Random r = new Random();
    private int seat = r.nextInt(50);
    private int car  = r.nextInt(10);

    public Train(String name, String id, int numberofpassenger) {
        super(name, id);
        setNumberofpassenger(numberofpassenger);
    }

    public int getNumberofpassenger() {
        return numberofpassenger;
    }

    public void setNumberofpassenger(int numberofpassenger) {
        this.numberofpassenger = numberofpassenger;
    }

    @Override
    public void seatnumer() {
        System.out.println("Seat Number is : "+seat);
        System.out.println("Car Number is : "+car);
    }
}
