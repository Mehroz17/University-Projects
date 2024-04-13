package PraticeGenarics;

import java.util.Scanner;

public class Main {
    public static  void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number:   ");
        int n = input.nextInt();

        System.out.print("Enter cnin:  ");
        input.nextLine();
        String cn = input.nextLine();

        System.out.print("Enter the date: ");
        double bd = input.nextDouble();

        G<Integer,String,Double> g1 = new G<>(n,cn,bd);
        g1.showTypes();


        H  h2 = new H(56,"Mehroz", 23.65 ,"Arif");
h2.showTypes();


        }
}
