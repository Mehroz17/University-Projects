package dewoo;

public class Single {
    private String name;
   private String destination;
   private double distance;

   public Single(String destination ,double distance ,String name){
       setDestination(destination);
       setDistance(distance);
       setName(name);
   }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public double charges(){
        return distance*2;
    }
public void printing(){
       System.out.println("\n\nName :   " + name);
       System.out.println("Destination: "+destination);
       System.out.println("Rent: "+charges());
}
}

