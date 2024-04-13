package fiehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws IOException {

        /*File Handling in Java
         *if you need to process the data permanently (data persistence), then there are two options
         *1. database 2. file
         *whenever you are working on your programs, these programs are loaded in RAM which is volatile
         *to process means (either read or write)
         *today's focus is only on text
         *Reading (3 options)
         *Writing (3 options)
         *1. FileOutputStream class (it only writes characters in files and nothing else)
         *2. FileWriter class (it writes numbers - integers) it is a subclass or child of FileOutputStream
         *3. BufferedWriter class
         * whenever a file is read or write to, it is usually done in characters (two options , byte stream and character stream)
         *File -- is actually a class in Java that lets you perform operations on files (metadata - info regarding files)
         *to provide a path (two options 1. D:/ 2. D:\\) \n,t
         * */

        File file = new File("D:/Java21/test.txt");

        if (file.exists()) {
            System.out.println("File alraedy exist.");
        }else {
            file.createNewFile();
            System.out.println("File successfully created.");
        }

		/*System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		System.out.println(file.length()); //return in bytes*/


        FileOutputStream fos = new FileOutputStream("D:/Java21/test2.txt",true); //true is a value to append
        FileWriter fw = new FileWriter(file,true);
        BufferedWriter bw = new BufferedWriter(fw); //there are only two constructors

        String country = "Pakistan";
        String city = "Peshawar";

        System.out.println("Writing begins.");

        char c[] = country.toCharArray();
        byte data[] = city.getBytes();


        for (int i =0;i<country.length();i++) {
            fos.write(c[i]);
        }

        fos.write(data);
        //fos.write(12);
        fw.append("12");
        bw.write(country);
        bw.close();

        fw.close();//it ensures the processing on file copy in RAM to be saved on hard disk


		/*Scanner input = new Scanner(System.in);
		System.out.println("Enter your first number :");
		int input1 = input.nextInt();
		System.out.println("Enter your second number :");
		int input2 = input.nextInt();*/


    }

}
