package genarics;

public class GenMetods {

    // Generic Methods
    // in any method there are few things specefic (arguments and return type
    // before return type use , generic letter in angular brackets <>

    public <G> void printrecord(G[] record) { // to make generic method
        for (G  r : record) {
            System.out.println(r);
        }

    }

    // The letter can be any one but same as written before void.
//You cannot directly perfrom matehmatical ooperations on objects , espacially on genaric method
public <T extends Comparable<T>>  T lrgestnumber(T a , T b , T c){
        //Compaable is an interface
    System.out.println("Largest Number");
       T larges = a;
       if(b.compareTo(larges) > 0 ){
           larges = b;
       }
       if(c.compareTo(larges)> 0){
           larges = c;
       }
       return larges;
}









    //Non genaric method , a return type is defferent and argument type is different
    // all these methods are printing the detalis of teh employees
//public void printrecord(String[] record){
//    for (int i = 0 ;i<record.length;i++){
//        System.out.println(record[i]);
//    }
//}
//
//public void printrecord(int[] record){
//    for(int r : record){
//        System.out.println(r);
//    }
//}
//
//public void printrecord(double[] record){
//    for(double d : record){
//        System.out.println(d);
//    }
//}






}
