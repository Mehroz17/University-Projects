package Saim;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class Generic <T>{

    T object;

    public Generic(T object){
        this.object = object;
    }

    public void write(){
        String fileName = object.getClass().getName() + ".txt";
        ArrayList<T> list = new ArrayList<>();
        list = read();
        list.add(object);
        try {
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream outputFile = new ObjectOutputStream(file);
            for (T obj:
                 list) {
                outputFile.writeObject(obj);
            }


        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public ArrayList<T> read() {
        String fileName = object.getClass().getName() + ".txt";
        ArrayList<T> list = new ArrayList<>();
        try{
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream inputFile = new ObjectInputStream(file);
            boolean END_OF_FILE = false;
            while (!END_OF_FILE){
                try {
                    list.add((T) inputFile.readObject());
                }catch (EOFException e){
                    END_OF_FILE = true;
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return list;
    }

}