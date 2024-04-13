/*Week 4
Date 9 March 2021
Topic : Memory Managment

 */

package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
Citizen person1 = new Citizen(); // as we have created an object buts its space is not allocated in memory , its space will be created when it uses any state of
            // the class.
            System.out.println("Enter the name of the perosn: "); // now its space is created in the memory of the size of Sting
            person1.setName(input.nextLine());

    }
}
