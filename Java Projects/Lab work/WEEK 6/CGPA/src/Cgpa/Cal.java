package Cgpa;

import java.util.Scanner;

public class Cal {
    private String name;
    private String reg;
   private String subname;
   private double labm;
   private double tm;
Scanner in = new Scanner(System.in);
    //Constructors
public Cal(){

}
    public Cal(String subname , double labm , double tm){
setSubname(subname);
this.labm = labm;
this.tm = tm;
    }

    //Getters and setters

    private void setSubname(String subname) {
        String regx = "^[a-zA-Z]*$";
        if (subname.matches(regx)){
        this.subname = subname;}
        else
            System.out.println("Enter valid subject naem");
    }

    public String getSubname() {
        return subname;
    }

    public void setName(String name) {
        String regx = "\\p{Upper}(\\p{Lower}+\\s?)";
        do {
            if(name.matches(regx))
                this.name = name;
            else
                System.out.println("Enter valid name:");
            name = in.nextLine();
        }while(name.matches(regx));

    }

    public void setReg(String reg) {
        this.reg = reg;
    }




}
