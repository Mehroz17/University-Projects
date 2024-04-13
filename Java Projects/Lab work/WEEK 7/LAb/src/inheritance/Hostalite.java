package inheritance;
// This is a sub class
public class Hostalite extends  Student{
     private String hostelName;
    private int roomNo ;
    private int hostelFee = 30000;

    //To call the constructor from parent class we use key word SUPER
    public Hostalite(String name , String reg,String hostelName , int roomNo){
        // it must be in first line
  /* Using */      super(name , reg); // This initaliztion is done by parent class
        setHostelName(hostelName);
        setRoomNo(roomNo);
         }

    public void setHostelName(String hostelName) {
        this.hostelName = hostelName;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public String getHostelName() {
        return hostelName;
    }

    public int getRoomNo() {
        return roomNo;
    }

    // This method is also present in parent class
    // This is method overriding
    /*
    int his we can call a parent method in subclass by using super keyword
     */

    /*
    Rules for overriding method
    1. name should be same
    2. Number of arguments must be same as well
     */
    @Override
    public int calculateFee(){
        return hostelFee + super.calculateFee(); // This is calling paent calculateFee and use it
    }

    public void Challan(){
        super.Challan();
        System.out.println("Hostel Name : " + hostelName);
        System.out.println("Room Number:  "+ roomNo);
      System.out.println("Also the hostle fee is:  "+ calculateFee());
    }

}
