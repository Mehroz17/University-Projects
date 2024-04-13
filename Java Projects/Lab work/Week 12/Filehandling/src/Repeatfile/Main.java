package Repeatfile;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {


        File file = new File("E:\\Comsats Lahore\\SEMESTER 2\\OOP Java\\Lab\\Lab work\\Week 12\\TExtFiles/sport.txt");
        if (file.exists()) {
            System.out.println("File Exists");
        } else {
            file.createNewFile();
            System.out.println("File successfull created");
        }

        FileOutputStream fo = new FileOutputStream(file, false);
        String sports = "Cricket";

        byte v[] = sports.getBytes();
        fo.write(v);

        int n;
        System.out.println("character using");
        char c[] = sports.toCharArray();
        for (n = 0; n < sports.length(); n++) {
            fo.write(c[n]);
        }


        // Reading using FileInputStream
        // Negative index will propmt you the end of file
        FileInputStream fin = new FileInputStream(file);
//        System.out.println("Reading Using File input Stream");
//        do {
//            n = fin.read(); // .read method returns the numeric representation of a character
//            System.out.println(n);
//        } while (n != -1);


        FileReader fr = new FileReader(file);
        BufferedReader be = new BufferedReader(fr); //
        System.out.println("Reading using BufferedReader.");
        while ((n = be.read()) != -1) {
            System.out.print((char) n);

        }

        System.out.println("\nNumeric to char");
        do {
            n = fin.read(); // .read method returns the numeric representation of a character
            System.out.print((char) n); // we have type cat the numeric values to char value
        } while (n != -1);

    }
}
