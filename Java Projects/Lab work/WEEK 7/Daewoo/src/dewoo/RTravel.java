package dewoo;

import java.util.Random;

public class RTravel extends  Single {

    private int locations;
    private String time;

    private String[] busType = {"Dragon","HIRoog","Simple"};
    Random r = new Random();
    int ran = r.nextInt(busType.length);


    public RTravel(String destination ,double distance, String name, int locations , String time ){
        super(destination,distance,name);
        setLocations(locations);
        setTime(time);
    }


    public void setLocations(int locations) {
        this.locations = locations;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double charges(){
        return super.charges()*locations;
    }

    public void printing(){
        super.printing();
        System.out.println("Your Time of Travel is:  "+time);
        System.out.println("YOu will visit " + locations + "   in  " + getDestination());
        System.out.println("You bus will be: " +busType[ran]);
    }
}
