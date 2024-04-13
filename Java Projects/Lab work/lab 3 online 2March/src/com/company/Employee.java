package com.company;

public class Employee {
    // State
private String name;
private int salary;
String grade;
private int work_H;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setWork_H(int work_H) {
        this.work_H = work_H;
    }

    public int getWork_H() {
        return work_H;
    }

    public void calS(){
        if(work_H >40){
            System.out.println("Salary is 50000");
                    }
        else if(work_H>50){

            System.out.println("Salary is 60000");
        }
        else if(work_H<=30){
            System.out.println("Salary is 20000");
        }
    }
}
