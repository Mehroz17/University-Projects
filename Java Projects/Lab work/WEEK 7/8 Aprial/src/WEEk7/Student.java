package WEEk7;

public class Student {
// if we make any variable private then we can not access it in subClass with out using of setters and gettes
    String name;
    String reg = "FA20-BSE-071";
    private int semester;
Student( String name){this.name = name;}

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void getSemester() {
        System.out.println(semester);
    }

    public String showName(){
    return name;
}
public void showReg(){
    System.out.println(reg);
}
}
