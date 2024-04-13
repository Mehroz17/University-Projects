package Tasks;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        File f1 = new File("E:\\Comsats Lahore\\SEMESTER 2\\OOP Java\\Lab\\Lab work\\Paper Practise\\textfile/St.txt");

// how to read scaner object
        if(f1.exists()){
            System.out.println("file is Present");
        }
        else {
            System.out.println("File is created");
        }
        String toWrite = "I Love Pakistan";

        FileWriter fw = new FileWriter(f1);
        fw.write(toWrite);
        fw.close();

        //Reading using Scanner
        Scanner scnr = new Scanner(f1);
        System.out.println("Reading File");
        System.out.println(scnr.nextLine());







    }
}
