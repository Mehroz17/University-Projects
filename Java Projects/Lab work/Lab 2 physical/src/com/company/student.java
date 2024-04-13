package com.company;

public class student {
    String name;
    String reg;
    double ictm;
    double ecam;
    double cgpa;
    double total_M;

    public void setName(String name) {
        this.name = name;
    }
        public String getName() {
        return name;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getReg() {
        return reg;
    }

    public void setIct(double ictm) {
        this.ictm = ictm;
    }

    public void setEca(double ecam) {
        this.ecam = ecam;
    }

    public double total(){
        total_M = ictm  + ecam;
        return  total_M;

    }
    public double CGPA(){
        cgpa = total_M/2;

    return  cgpa;
    }

}
