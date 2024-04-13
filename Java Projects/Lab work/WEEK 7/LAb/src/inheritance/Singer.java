package inheritance;

public class Singer extends Person{
    private String bandName;

    public Singer(String name , String designation , String bandName){
        super(name , designation);
        setBandName(bandName);
    }
    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void learn(){
        super.learn();
        System.out.println("Press 3 to learn Piano\nPress 4 to Learn Ca");
        int a = input.nextInt();
        if(a == 3){System.out.println("the person is learning java");}
        else if(a==4){System.out.println("The person is Learning Pythone");}
        else
            System.out.println("Wrong Command");
    }
}
