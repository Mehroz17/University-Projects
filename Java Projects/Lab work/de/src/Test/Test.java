package Test;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
//Books students = new Books();
//int n = input.nextInt();
//for(int i=0 ; i<=n ; i ++){
//    students.addName(input.nextLine());
//}
//
//students.size();
//
//students.Get(2);
        int[][] array = {{87,98,56},{56,23,45}};
Grades n = new Grades(array);
System.out.println("The minimum grades in the class is : "+n.min());
         }
}
