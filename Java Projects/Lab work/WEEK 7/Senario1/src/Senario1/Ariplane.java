package Senario1;

public class Ariplane {
    private String name;
    private String CNIC ;
    private String source;
    private String destination;
    private String dateandTime;
    private int numberOfSeats;
    private String seatType;

    public Ariplane(String name, String CNIC, String source , String destination, String dateandTime, int numberOfSeats,String seatType){
        setDateandTime(dateandTime);
        setDestination(destination);
        setSource(source);
        setCNIC(CNIC);
        setName(name);
        setNumberOfSeats(numberOfSeats);
     setSeatType(seatType);
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCNIC(String CNIC) {
        this.CNIC = CNIC;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDateandTime(String dateandTime) {
        this.dateandTime = dateandTime;
    }

    public String getName() {
        return name;
    }

    public String getCNIC() {
        return CNIC;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public String getDateandTime() {
        return dateandTime;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getSeatType() {
        return seatType;
    }

    public double rent(){
        if(seatType.equals("W")){
        return 2000*getNumberOfSeats();
    }
    else if(seatType.equals("A")){
        return 1500*getNumberOfSeats();
        }
    return 0;
    }

    public void printingAriplane(){
        System.out.println("Name:  "+ name);
        System.out.println("CNIC:  "+ CNIC);
        System.out.println("Start Journey :  "+ source);
        System.out.println("Destination: "+destination);
        System.out.println("DATE and Time: "+dateandTime);
        System.out.println("Number of Seats: "+ numberOfSeats+"   Seat Type:  "+seatType);
        System.out.println("Your Total Rent IS:  "+ rent());

    }
}
