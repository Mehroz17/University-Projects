package Inheritance;

public class Hostelite extends Student{

    private String hostelName;
    private int roomNumber;

    private int hostelFee = 30000;

    public Hostelite(String name, String id, String hostelName, int roomNumber) {
        //it must be the first line
        super(name, id);
        setHostel(hostelName);
        setRoom(roomNumber);
        calculateFee();
    }

    public void setHostel(String hostelName) {
        this.hostelName = hostelName;
    }

    public void getHostel() {
        System.out.println(hostelName);
    }

    public void setRoom(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void getRoom() {
        System.out.println(roomNumber);
    }

    //method override - annotate
    //rules - method name must be same and the number of arguments must be same as well

    @Override
    public int calculateFee() {
        return hostelFee + super.calculateFee();
    }



}



