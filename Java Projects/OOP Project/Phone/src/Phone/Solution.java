package Phone;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
        System.out.println("Enter Int: ");
        int a = input.nextInt();
        System.out.println("Enter Double:  ");
        double d = input.nextDouble();
        System.out.println("Enter String: ");
        input.nextLine();
        String s = input.nextLine();

        System.out.println("String: "+s);
        System.out.println("Double: "+d);
        System.out.println("Int: "+a);

    }
}