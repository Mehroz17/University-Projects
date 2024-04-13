package Enumirations;

// Topic Enum
/*
An enum type is a special data type that enables for a variable to be a set of predefined constants.
 */
public class Main {
    public static void main(String[] args){

        //Enumiration
        /*
        1. Values that are fixed or a list is fixed or anything that is fixed and to be used, we can take
        advantage of using a special data type provided by Java that is called "Enum".
        2. if something is fixed it is usually final.
        3. enum data types can not be instantiated means we can not makes objects of enum but we can declare it.
        4. by default enum list is static, final and public
        5. compiler can help you out to catch an entry that is not in the list
        6. Itrerate the full list by using for each loop
        7. by default , a static method called values() is available to all enum types
         */

   // SkypeStatus status = new SkypeStatus(); we can not do this

        SkypeStatus2 status1 = SkypeStatus2.available;
        System.out.println(status1);

        // Ietrerating the listl
//        SkypeStatus status;
//        for(SkypeStatus s: SkypeStatus.values()){ // values will return all the list in array form
//            System.out.println(s);
//
//        }
// To get some values of the list enum
//        for (SkypeStatus ss: EnumSet.range(SkypeStatus.available,SkypeStatus.offline)){
//            System.out.println(ss);
//        }

//Enum         SkypeStaus is the type of return in the method
        //public static SkypeStatus checkStatus(){
       //      return SkypeStatus.offline;}
        //checkStatus();


        Data2 d;
        for(Data2 s : Data2.values()){
            System.out.println(s);
        }

WorkingLevels2 w;
        for (WorkingLevels2 k : WorkingLevels2.values()){
            System.out.println(k);
        }




    }



    }


