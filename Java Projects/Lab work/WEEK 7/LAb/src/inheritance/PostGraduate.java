package inheritance;

// Thsi is a child class of student
public class PostGraduate extends Student {
    private String technology;

    public PostGraduate(){}
    public PostGraduate(String name , String reg){
        super(name , reg);
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public void getTechnology() {
        System.out.println(technology);
    }
}
