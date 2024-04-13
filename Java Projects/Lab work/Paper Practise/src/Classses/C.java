package Classses;

import java.util.Scanner;

public class C extends B{
    private int num1 ;
    private int num2;

    public C(String name, int roll, int num1, int num2) {
        super(name, roll);
        setNum1(num1);
        setNum2(num2);
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    @Override
    public void showdata() {
        super.showdata();
        System.out.println("The sum of the numbers is: "+(num1+num2));
    }

    class main{}

    public static void main(String[] args) {
        C c1 = new C("Mehroz",71,4,2);
        c1.showdata();
        c1.setNum1(7);
        c1.showdata();


    }

}
