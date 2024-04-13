package IntheritanceP;

public class T {
    public void t(ModeofTravel modeofTravel){
        System.out.println("Ticket");
        System.out.println("Name: "+modeofTravel.getName());
        System.out.println("ID: "+modeofTravel.getId());
        if(modeofTravel instanceof Train){
            System.out.println("Mode of Travel");
            ((Train) modeofTravel).seatnumer();
            System.out.println("Number of Passenger: "+((Train) modeofTravel).getNumberofpassenger());
        }
    }
}
