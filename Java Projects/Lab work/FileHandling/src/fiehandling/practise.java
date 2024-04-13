package fiehandling;

import java.io.*;

public class practise {
public static void main(String []ags)throws IOException {
    System.out.println("File Handling");

    // Using FileOutput Stream
    File fileout = new File("E:\\Comsats Lahore\\SEMESTER 2\\OOP Java\\Lab\\Lab work\\Week 12\\TExtFiles/pratice.txt");

    if(fileout.exists()){
        System.out.println("File Already Exists:");
    }
    else {
        System.out.println("File is Created");
    }
String Data = "File Handling Using FileOutput Stream + \n Test";
    char a[] = Data.toCharArray();

    FileOutputStream fo = new FileOutputStream(fileout);
    for(int i = 0; i< Data.length();i++){
        fo.write(a[i]);
    }

    //Buffer
    //for buffer we need file writer
    FileWriter fw = new FileWriter(fileout);
    BufferedWriter bw = new BufferedWriter(fw);
    bw.write("Pakitan");
    bw.close();


}
}
