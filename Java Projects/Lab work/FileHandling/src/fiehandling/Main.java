package fiehandling;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {

        /*
        ***File Handling
        * it help us in real life senarios
        * If you need to process on the data permanently(data persistance) then there are 2 options to store that data
        *  1 . Databases 2. File
        * When ever you are wokring on your programs, these program are loaded in RAM, which are volatiel(mean when pc is shut down then data also removes)
        * Processing has 2 options 1. Read 2. Write
        * "Today's focus is only on text "
         To Work:
         * Reading 3 options
         FileInputStream used for reading
         * Writing 3 options
         1. FileOutputStream:
         * it is used to write in the file
         * it only writes characters in files and nothing else.
         2.File Writer Class:
         * it writes numbers - integers
         * it is a subclass of FileOutputStream.
         3. BufferWriter Class;
         *
         * Whenever a flie is read or write to , it is usually done in characters(two options, byte stream and character stream)
         File:-
         * it is a class in Java that lets you perfome operations on file.
         *  Whenever we work on file we need to import an class of "io.file"
         * to provide a path (two options 1. D:/ 2.D:\\) \n,t
         MetaData:
         * Info Regarding file is called metadata

                 */
            File file = new File("E:\\Comsats Lahore\\SEMESTER 2\\OOP Java\\Lab\\Lab work\\Week 12\\TExtFiles/test.txt");

      System.out.println("Creat a File");
if(file.exists()){
    System.out.println("File Exists");
}
else {
    file.createNewFile();
    System.out.println("File sussufuly created");
}
      System.out.println(file.length()); //returns in bytes

//      FileOutputStream fos = new FileOutputStream(file); // as there append is not true so it will overwrite the data
//      String country = "PAKISTAN";
//      // As in FileInputStream we can only write characters, so for this we can
//      System.out.println("Writing Begins");
//      char c[] = country.toCharArray();
//      for(int i = 0; i<country.length();i++){
//          fos.write(c[i]);
//      }

      FileOutputStream fos = new FileOutputStream(file ,true); //ITs stats to write again and again
      String country = "PAKISTAN";
      // As in FileInputStream we can only write characters, so for this we can
      System.out.println("Writing Begins");
      char c[] = country.toCharArray();
      for(int i = 0; i<country.length();i++){
          fos.write(c[i]);
      }

      // it is secind way
      String city = "Multan";
      byte data[] =city.getBytes();
      fos.write(data);

      //Using FileWriter
      FileWriter fw = new FileWriter(file,true);
      fw.append("12");

         // it ensures the file copy in RAM to be save on harddisk

//Bufferd Writer
      // it will speed up the input ouput stream
      BufferedWriter bw = new BufferedWriter(fw); // in buffer there are only 2 constructors
      bw.write("Buffer");
      bw.close();
      fw.close();
        }
    }

