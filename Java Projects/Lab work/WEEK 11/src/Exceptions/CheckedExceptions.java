package Exceptions;


import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class CheckedExceptions {
    public static void main(String[] args) {
// Checked Exceptions
        // it is for the purpose of reading  of any file present in your computer

        // in this compiler is checking the data and force us to handle the exceptions
//         try {
//             FileInputStream fr = new FileInputStream("E:\\Comsats Lahore\\SEMESTER 2\\OOP Java\\Lab\\Lab work\\WEEK 11"); // given path of any file
//         }catch (FileNotFoundException e){
//             System.out.println("File not found");
//         }

        //if we remove try catch then we have to use following method
         // whichever method if your are handling checked exception, then
        // you can use the keyword (throws) to be used method signature
        // throws keyword will only removes compile time errors

        try {
            RunFileSystem();
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }
    }

    // Whenever we use throws then we have to call the method in other method
    public static void RunFileSystem() throws FileNotFoundException {
        FileInputStream fr = new FileInputStream("E:\\omsats Lahore\\SEMESTER 2\\OOP Java\\Lab\\Lab work\\WEEK 11\\Test.txt"); // given path of any file
    }

}
