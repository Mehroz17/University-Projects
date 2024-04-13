package inheritance;

public class Programmer  extends Person{
    private String companyName;

    public Programmer(String name , String designation ,String companyName){
        super(name ,designation);
        setCompanyName(companyName);
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }


    public void learn(){
        System.out.println("The Name of Company is:  "+companyName);
        super.learn();
        System.out.println("Press 3 to learn JAVA\nPress 4 to Learn Pythone");
        int a = input.nextInt();
        if(a == 3){System.out.println("the person is learning java");}
        else if(a==4){System.out.println("The person is Learning Pythone");}
        else
            System.out.println("Wrong Command");
    }

    public void walk(){
        super.walk();
        System.out.println("Press 3 to Jump \nPress 4 to Backflip");
        int a = input.nextInt();
        if(a == 3){System.out.println("the person is jumping");}
        else if(a==4){System.out.println("The person is doing backflip");}
        else
            System.out.println("Wrong Command");
    }

    public void eat(){
        super.eat();
        System.out.println("This person also like icecream");
    }
}
