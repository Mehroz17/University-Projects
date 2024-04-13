package Classses;

public abstract class B {
    private String name;
    private int roll;

    public B(String name, int roll) {
        setName(name);
        setRoll(roll);
    }



    public void setName(String name) {
        this.name = name;
    }



    public void setRoll(int roll) {
        this.roll = roll;
    }



    public  void showdata(){
        System.out.println("Name: "+name);
        System.out.println("Roll Number: "+roll);
    }
}
