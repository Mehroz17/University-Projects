package Singal;
import java.util.ArrayList;
import java.util.Scanner;
// Date 19 March
// Topics
/*
Arrays
1. Single dimesnsion Arrays
2. Multi Demension Arrays
3. Irregular Dimenion Arrays
   Array List    -> focus
   1. Enhanced For Loop
 */
public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        //Array
//        // Why we use Arrays
//        /*
//        1. TO avoid the use of many different variables
//        Note:
//        Java and C supports strictly Same DAta type
//        In C Array Array is stored in countinuous memory
//        But in Java it does not do so.
//         */
//
//        //Topic of this class
//        // * SINGLE Dimension Array
//
//        // Creating an Array
//        // Array Must be Initalize The type of initalization are 2 [1.Hard code(has 3 different variations) , 2.Dynamic]
//        // In real life it is dynamic
//
//        // 1.First Variation of Hard Code
//        // Provide Initializer Value (Means provide Size of array)
        int[] b = new int[3];
        int c[] = new int[2];  //-> These both statements are ture
//        // 2.Second Variation of HArd Code
//        // In this provide Values
        int[] marks = new int[]{1, 2, 3, 4, 5};  // in this it oocupies size according to the value
//        // 3.Third Variation of Hard Code
//        // Provide values but using index
        int[] jerseyes = new int[4];
//        // Index valus in java stats from 0
        jerseyes[0] = 10;
        jerseyes[1] = 2;
        jerseyes[2] = 9;
        jerseyes[3] = 7;
//        //Parsing array or Printing
        System.out.println("Printig using For Loop");
        for (int i = 0; i < 4; i++) {
            System.out.println("Jerseyes" + "  " + (i + 1) + " " + "is" + "  " + jerseyes[i]);
        }
//        // Printing using foreach
        System.out.println("Printing using foreach");
        // in this we do not need to povide the lenght
        // Enhanced for loop
        for (int value : jerseyes) {
            System.out.println("Values of Jersies ara: " + value);
        }
////        //Taking input for user in an Array
////int n [] = new int[4];
////        for(int j = 0; j<4;j++){
////            n[j] = input.nextInt();
////        }
////for (int p:n){
////    System.out.println(p);
////}
//
//
//        //Subjects  sub1 = new Subjects("OOp",4);
//int[] abc = new int [2];
//// this is object creation but we are not intrested right now
////Subjects sub = new Subjects("OOP",4);
//
//        // Creating Array of object
//        Subjects[] sub = new Subjects[3];
//        // In this we are creating objects at index leve;
//        // To pass vlaue we have to made a objec
//        sub[0] = new Subjects("OOP", 4);
//        sub[1] = new Subjects("ECC", 3);
//        sub[2] = new Subjects("ISL", 3);
//// Parsing it
//        System.out.println("Printing Values from Objects");
//        for(int k = 0 ;k< sub.length;k++){
//            System.out.println(sub[k].creditHours);
//        }
//// Making a second array
//        Subjects[] sub2 = new Subjects[]{
//            new Subjects("ECC", 3),
//            new Subjects("ISL", 3),
//        };
//        System.out.println("Printing Values from Objects");
//        for(int o = 0 ;o< sub.length;o++){
//            System.out.println(sub2[o].name);
//        }

        //2. MultiDimensional Array
        //Java do not have concpt of multi dimensional arrays as other languages
        // so in java multi dimensinal array means arrays of arrays.
        int[][] mn = new int[2][3];
        mn[0][0] = 1;
        mn[0][1] = 2;
        mn[0][2] = 3;

        mn[1][0] = 1;
        mn[2][0] = 2;
        mn[3][0] = 3;
    }

    ;
    int[] dummy = new int[2];
//        System.out.println(dummy.length);  //  This will print the lenght of array
//
//        for (int l = 0 ; l< mn.length;l++){
//            for(int g = 0;g<mn[l].length;g++){
//                System.out.println(mn[l][g]);
//            }
//
//        }

    //3.Irregular Dimensiona Array
//        int[][] mun = new int[][]{
//                {1,2,3},
//                {4,5,6,7,8},
//                {9,10}
//        };
//System.out.println(mun[1].length);

//Diadvantages of Array
        /*
        1. Fixed Size
        2. Modification is cery difficult
        3. if you are removing something from the array , index mangment is poor
         */

    // Java Facilitates us about the problems of array
    // Array List
        /*
        it is an array which is resizeable noting else. in this modifiactionis easy
        we can mange index easily.
         */
    //Synatx
    // in this we have to  use Wrapper class.
    // We have to import java.util.ArrayList
    ArrayList<Integer> registration = new ArrayList<Integer>();
    // in this we do not see size so
//
//        registration.add(7);
//        registration.add(7); //to add number
//        registration.add(7);
//        registration.add(8);
//        System.out.println("Size of Array ");
//        System.out.println(registration.size());
//
//        //Parsing
//        System.out.println("Priting in the form of List");
//        System.out.println(registration); //this will print in the form list
//        // by using enhanced loop
//        System.out.println("Enhanced for loop will give only elements");
//        for(int t : registration){
//            System.out.println(t);
//        }
//        System.out.println("geting vlue at 2 index");
//System.out.println(registration.get(2));  // Geting values at indexes
//
//        // Removing
//        //registration.remove(2);
//        //System.out.println("Size after removing" +"   "+ registration.size());
//
//        //Modification
//        // We can perform arithmatic operations on Array List also and can set them
//        // Back in the array
//        registration.set(3,80);
//        System.out.println("After modification at index 3 and replacing value of 7 with 80");
//        System.out.println(registration);
//
}

