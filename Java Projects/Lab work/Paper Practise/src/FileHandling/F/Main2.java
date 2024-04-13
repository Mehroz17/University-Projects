package FileHandling.F;

import FileHandling.F.coustomer;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Map<Integer, coustomer> co = new HashMap<>();

        System.out.println("Enter the Order Nomber or -1 to exit");
        int order = input.nextInt();
        do {

            System.out.print("Enter the Name of Coustomer: ");
            input.nextLine();
            String na = input.nextLine();
            System.out.print("What they want to Eat: ");
            String eat = input.nextLine();


            coustomer c1 = new coustomer(na, eat);


            co.put(order, c1);


        } while (order == -1);


        System.out.println("Your order ");
        System.out.println(co.get(1));

        }
    }

