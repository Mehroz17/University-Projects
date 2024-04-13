package ThisKeyWord;

public class Ex {
    void m(int s , String m){
        System.out.println("S = "+s);
        System.out.println("M ="+m);
    }

    void m(String ms , String mn){
        System.out.println("MS= "+ms);
        System.out.println("MN= "+mn);
    }
    void p(){
        m(56,"Ali");
    }

    void clasI(){
        System.out.println("Class instance "+this.getClass().getName());  // it is tellig the details of the class package name and then name of the class
    }
}
