package dewoo;

import java.util.Random;

    public class Full extends Single {
    private int numberOfPeople ;
    private int numberOfDays ;
    private String[] hotels = {"PC","Metropole","Serna","Ramada","Marroit","Crown Plaza"};
    Random ho = new Random();
    int ran = ho.nextInt(hotels.length);
    private int numberofsights;
    private String[] sightsName ;

    public void setSightsName(String[] sightsName) {
        this.sightsName = sightsName;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

        public void setNumberOfDays(int numberOfDays) {
            this.numberOfDays = numberOfDays;
        }

        public void setNumberofsights(int numberofsights) {
            this.numberofsights = numberofsights;
        }

        public Full(String destination , double distance, String name, int numberOfPeople ,int numberofsightsR, String[] sightsName, int numberOfDays ){
        super(destination,distance,name);
        setNumberOfPeople(numberOfPeople);
        setSightsName(sightsName);
        setNumberOfDays(numberOfDays);
        setNumberofsights(numberofsights);
        }


    public double charges(){
        return super.charges()*numberOfPeople*numberOfDays;
    }


        @Override
        public void printing() {
            super.printing();
            System.out.println("Your Hotel is:  "+hotels[ran]);
            System.out.println("The sights you want to go are: ");
            for (int i = 0; i<=numberofsights; i++){
                System.out.println(sightsName[i]);
            }
        }
    }
