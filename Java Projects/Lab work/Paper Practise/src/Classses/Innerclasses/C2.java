package Classses.Innerclasses;

public class C2 {

    int x = 10;

    void s (){
        for (int i = 0 ;i<4;i++){
            class MK{
                void m(){
                    System.out.println(x);
                }
            }
            MK m = new MK();
            m.m();
        }

    }

}
