package Array.ArrayLsit;

import FileHandling.Object.S;

import java.util.*;

public class MAin {
    public static void main(String[] args) {
        ArrayList<String> m = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("prees -1 to leave");
//        for (int i = 0;i<4;i++){
//            System.out.print("Name:");
//            String n = input.nextLine();
//            m.add(n);
//        }
//        System.out.println(m);

        LinkedList<Integer> l = new LinkedList<>();
        l.add(25);
        l.add(74);
        System.out.println(l);
        System.out.println(l.peek()); // retrieves but do not reamove the first element

        Set<String> s1 = new HashSet<>();  //set is an iterface
        s1.add("Arif");
        s1.add("Moeez");
        Iterator<String> itr = s1.iterator();
        System.out.println("Index\t\tvalues");
        for(int i = 0 ;i<s1.size();i++){
            System.out.println(i+"\t\t\t"+itr.next());
        }

        try{
            System.out.print("Enter : ");
            String s = input.nextLine();
            if(s1.contains(s)){
                throw new Exception();
            }
            else {s1.add(s);}
        } catch (Exception e) {
            System.out.println("Number is Present in the SEt");
        }


//        Map <String , Integer> m1 = new HashMap<>();
//        System.out.print("Enter the NAme of Employee");
//        String n = input.nextLine();
//        System.out.println("Entet slary: ");
//        int s = input.nextInt();
//        m1.put(n,s);
    }
}
