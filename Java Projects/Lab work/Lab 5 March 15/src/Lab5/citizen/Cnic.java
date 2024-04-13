package Lab5.citizen;

public class Cnic {
    //States of Citizen
     //final String  cnic;
      private String name;

     //As we know that cnic is not provided by the person in Nadra it has lots of conditions in it
    /* for processing of final varable we can make a non-static block in which we can perform all the processing of that final
    vaiable
     */
// This is a non static block
//     {
//         if (name.equals("Mehroz"))
//
//                 cnic = "36302-1710958-5";
//             System.out.println("the Cninc is "+ cnic);
//
//
//
//
//         }
//
//     public Cnic(String name){
//        setName(name);



    private void setName(String name) {
        this.name = name;
    }

}
