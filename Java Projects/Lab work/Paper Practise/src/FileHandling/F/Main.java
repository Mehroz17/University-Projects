package FileHandling.F;

import java.io.*;
import java.util.Scanner;

public class Main {
    private static final String filename = "Student";
    public static void main(String[] args)  {
        //File Handling
        Scanner input = new Scanner(System.in);
        System.out.println("Data Storing");

        System.out.print("Enter the Name: ");
        String n = input.nextLine();

        System.out.print("Enter the Registration: ");
        String r = input.nextLine();
        Data45 d = new Data45(n, r);
        try {
            File f1 = new File(filename + ".txt");
            FileOutputStream fo = new FileOutputStream(f1);
            ObjectOutputStream ob = new ObjectOutputStream(fo);
            ob.writeObject(d);
            ob.close();
            System.out.println("Data is stored in the file");
        } catch (IOException e) {
            System.out.println("File not Created ");
        }



        try {
            FileInputStream fi = new FileInputStream(filename + ".txt");
            ObjectInputStream oi = new ObjectInputStream(fi);
            Data45 dm = (Data45) oi.readObject();
            System.out.println(dm);
            System.out.println("The object is readed");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            }catch (FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
