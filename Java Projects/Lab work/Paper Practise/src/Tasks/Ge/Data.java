package Tasks.Ge;
//Genaric class

public class Data< T , U> {

private T name;
private U ID;

   public Data(T name, U ID) {
        setName(name);
        setID(ID);
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public U getID() {
        return ID;
    }

    public void setID(U ID) {
        this.ID = ID;
    }


    public void printData(){
        System.out.println("Name: "+ name);
        System.out.println("ID: "+ID );
    }

}
