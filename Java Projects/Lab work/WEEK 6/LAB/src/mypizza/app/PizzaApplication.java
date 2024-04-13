package mypizza.app;
// Main Class
import mypizza.pos.PointOfSale;
import mypizza.top.Topping;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class PizzaApplication {
    public static void main(String[] args){

  PointOfSale order;
  System.out.println("Toppings are \n1.Pepronie\n2.Pineapple\n3.Tikka\n4.Corn\n5.Mushroom\n6.BlackOlives");
  System.out.println(" Enter Order (To Exit Press -1) ");
  Map<Integer, PointOfSale> orders = new HashMap<>();
  int toppings = 0;
  boolean extra = false;
  boolean al = false;
  Scanner input = new Scanner(System.in);

do {
    System.out.println("\nHow many topping sdo you want:   ");
    toppings = input.nextInt();
    if (toppings != -1) {
        System.out.println("Enter the size of Pizza(small , medium , large): ");
        String size = input.next();
        System.out.println("Wants Some extra toppings? (Y/N):");
        char choice = input.next().charAt(0);
        System.out.println("Are you alergic to some thing? (Y/N):");
        char choice2 = input.next().charAt(0);
        if (choice == 'y') {
            extra = true;
        }
        if (choice2 == 'y') {
            al = true;
        }
        if (extra && al) {
            System.out.println("Enter the Desired Extra-Toppings:  ");
            String extra4 = input.next();
            System.out.println("Enter Your ALergies: ");
            String al5 = input.next();
            order = new PointOfSale(size, toppings, extra4, al5);
        } else if (extra) {
            System.out.println("Enter the Desired Extra-Toppings:  ");
            String extra6 = input.next();
            order = new PointOfSale(size, toppings, extra6);
        } else if (al) {
            System.out.println("Enter Your ALergies: ");
            String al6 = input.next();
            order = new PointOfSale(size, toppings, "none", al6);
        } else {
            order = new PointOfSale(size, toppings);
        }

            orders.put(1,order);
        order.Shower();
    }
}while (toppings != -1);

System.out.println("Do you want ot Edit the order (Y/N):   ");
char change = input.next().charAt(0);


if(change == 'y'){
    System.out.println("Enter the Order Number:  ");
    int on = input.nextInt();
    System.out.println(orders.get(on));
System.out.println("Press 1 to change size\nPress 2 to change toppings\nPress 3 to Change add/remove extratoppings\nPress4 Change alergies");
System.out.println("Prees 5 to change size and toppings\nPress 6 to change size toppings extra toppings and alergies");

 int cha = input.nextInt();

if(cha == 1){
    System.out.println("Enter the size : ");
    String sizeChange = input.nextLine();


    }
}





    }
}



