package inheritance;

//This is a child class of postgraduate
public class Masters extends PostGraduate{
    String type = "MASTERS";
    public Masters(){}
    public Masters(String name, String reg){
        super(name , reg);
    }
}
