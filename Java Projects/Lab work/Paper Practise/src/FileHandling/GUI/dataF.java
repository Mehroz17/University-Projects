package FileHandling.GUI;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class dataF {
   // Creating 2 file one for faculty and one for student

   // we wil creat a method

   public void file(String filepath, String name, String ID, String occ) {
      try {
         File f1 = new File(filepath + ".txt");
         FileWriter fw = new FileWriter(f1, true);
         BufferedWriter bw = new BufferedWriter(fw);

         //Adding data
         bw.newLine();
         bw.write("Name: " + name);
         bw.newLine();
         bw.write("ID: " + ID);
         bw.newLine();
         bw.write("Occupation: " + occ);
      } catch (IOException e) {
         JOptionPane.showMessageDialog(null, e.getMessage());
      }
   }
// Reading DAta


   public ArrayList<String> read(String filepath) {
      ArrayList<String> da = new ArrayList<>();
      try {
         File f2 = new File(filepath + ".txt");
         FileReader fr = new FileReader(f2);
         BufferedReader br = new BufferedReader(fr);
         String l;
         while ((l = br.readLine()) != null) {
            da.add(l);
         }
         br.close();
      } catch (Exception e) {
         JOptionPane.showMessageDialog(null, e.getMessage());
      }
      return da;
   }
}

