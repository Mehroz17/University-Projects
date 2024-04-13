package Cgpa;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Cal st = new Cal();
        Scanner input = new Scanner(System.in);
System.out.print("Enter name:");
st.setName(input.nextLine());

System.out.print("Enter Registration Number:");
st.setReg(input.nextLine());

        ArrayList<Cal> sub = new ArrayList<>();

        System.out.println("Press Y to Enter Marks or N to Exit");
        char menue1 = input.next().toUpperCase(Locale.ROOT).charAt(0);
        while (menue1 != 'N') {
            if (menue1 == 'Y') {
                System.out.println("1.Press 1 to enter Subject marks (Theory)\n2. Press 2 to enter subject marks (Lab)");
int menue2 = input.nextInt();
switch (menue2){
    case 1:{
        System.out.print("Enter subject name:");
        input.nextLine();
        String n = input.nextLine();
        System.out.println("Enter Theory Marks:");
        double t = input.nextDouble();
        sub.add(new Cal(n , 0 , t));
        break;
    }
    case 2:{
        System.out.print("Enter Subject Name");
        input.nextLine();
        String na = input.nextLine();
        System.out.println("Enter Theory Marks:");
        double th = input.nextDouble();
        System.out.println("Enter Lab marks:");
        double l = input.nextDouble();
        sub.add(new Cal(na , l , th));
        break;
    }
    default:
        System.out.println("Wrong Command");
}
System.out.println("Press Y to Enter Marks or N to Exit");
menue1 = input.next().toUpperCase(Locale.ROOT).charAt(0);

            } if(menue1 == 'N'){
               for(Cal n : sub){System.out.println("The Subjects are :" + sub.);}
            }
            }

            }
        }

