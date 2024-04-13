package Hotel;

import javax.swing.*;
import java.util.Objects;

public class LogicofMenue {

    //Storing Room Number
    private int roomnumber;
    private double total;
    private double subtotal;
    private double bT;
    private double kT;
    private double pizzaT;
    private double burgerT;
    private double paraT;
    private int d;


    public void setRoomnumber(int roomnumber) {
        this.roomnumber = roomnumber;
    }

    //Logic for the total price of Cold Drinks
    private int pricceofcoca = 30;
    private int sting = 50;
    private int pepsi = 30;
    private int mangojuice = 20;
    private int mint = 200;
    private int water = 20;

    public void costofDrink(JComboBox cb,int quantiy, JLabel tc){
       if(cb.getSelectedItem().equals("Coca Cola")){
             d = pricceofcoca*quantiy;
           tc.setText(String.valueOf(d));
       }
       else if(cb.getSelectedItem().equals("Sting")){
            d = sting*quantiy;
           tc.setText(String.valueOf(d));
       }
       else if(cb.getSelectedItem().equals("Pepsi")){
            d = pepsi*quantiy;
           tc.setText(String.valueOf(d));
       }
       else if(cb.getSelectedItem().equals("Mango Juice")) {
           d = mangojuice * quantiy;
           tc.setText(String.valueOf(d));
       }

       else if(cb.getSelectedItem().equals("Mint Margarita")) {
            d = mint * quantiy;
           tc.setText(String.valueOf(d));
       } else if(cb.getSelectedItem().equals("Water")){
           d = water*quantiy;
           tc.setText(String.valueOf(d));
       }
       else if(cb.getSelectedItem().equals("Choose A Drink")){
           tc.setText("0");
       }
    }//End of method


    // Method of Meal
    private int biryani = 150;
    private int karhai = 800;
    private int pizza = 1500;
    private int burger = 500;
    private int parathro = 180;

    public void totalcostofMeal(JLabel c, double biq, double kq,double pq,double bq,double prq){
         bT = biq *biryani;
         kT = kq *karhai;
         pizzaT = pq *pizza;
         burgerT = bq *burger;
         paraT = prq *parathro;
        total = bT+kT+pizzaT+burgerT+paraT;
        String t = String.format("%.3f",total);
        c.setText(t);

    }


//Method of Calculating Subtotal Price

    public void subprice (int de , int tax,JLabel c){
        subtotal = de+tax+total+d;
        String subt = String.format("%.3f",subtotal);
        c.setText(subt);
    }
// Total Rent

        public void Total(JLabel c){
        total = subtotal+ 1500;
        c.setText(String.valueOf(total));
        }
    //Method of converter

    public void converter(double amount,JLabel amountconvert , JComboBox c){
        if(Objects.equals(c.getSelectedItem(), "USA")){
            double amo = amount/160;
            amountconvert.setText(String.valueOf(amo)+"$");
        }      //"USA", "UK", "UAE", "China", "Saudia Arabia", "Qatar"
        else if(Objects.equals(c.getSelectedItem(), "UAE")){
            double amo = amount/43.76;
            amountconvert.setText(String.valueOf(amo)+"د.إ");
        }else if(c.getSelectedItem().equals("China")){
            double amo = amount/27.8;
            amountconvert.setText(String.valueOf(amo)+"¥");
        }else if(c.getSelectedItem().equals("Saudia Aribia")){
            double amo = amount/42.85;
            amountconvert.setText(String.valueOf(amo)+"RA");
        }else if(c.getSelectedItem().equals("Qatar")){
            double amo = amount/44.5;
            amountconvert.setText(String.valueOf(amo)+"QAR");
        }
        else if(c.getSelectedItem().equals("UK")){
            double amo = amount/220;
            amountconvert.setText(String.valueOf(amo)+"£");
        }
        else if(c.getSelectedItem().equals("Choose Country")){
            amountconvert.setText("Select the Country");
        }
    }

    //Getters
    public int getD() {
        return d;
    }

    public double getTotal() {
        return total;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getbT() {
        return bT;
    }

    public double getkT() {
        return kT;
    }

    public double getPizzaT() {
        return pizzaT;
    }

    public double getBurgerT() {
        return burgerT;
    }

    public double getParaT() {
        return paraT;
    }

    public int getRoomnumber() {
        return roomnumber;
    }

}
