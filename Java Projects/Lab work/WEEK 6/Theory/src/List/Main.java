package List;
// 25 March
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
/*
Array List - fancy word for arrays but it is resizeable and index mangment is good
works on object

        ArrayList<String> list = new ArrayList<String>();
        list.add("Mehroz");
        list.add("Moeez");
        // to get size
        System.out.println(list.size());

        // To change any entery in array list
        list.set(0 , "Ali");   // it changes 68 to 10

        //parsing
        for(String e : list){
            System.out.println(e);
        }
 */
        ArrayList<Subject> sub = new ArrayList<>();

        sub.add(new Subject("OOP", 5));
        sub.add(new Subject("ICT", 3));
        sub.add(new Subject("Data Science", 3));
        sub.add(new Subject("Web security", 4));

// Parsing this

        for (Subject m : sub)    // As we are parsing Subjcet type array list
        {
            System.out.print(m.creditHours + "\t");     // As we have 2 values so we have to specify the values
            System.out.println(m.name);
        }

        System.out.println("The size of the Array of Subject: " + sub.size());
        sub.remove(1);
System.out.println("After removing the subject at index 1:");
        for (Subject m : sub)    // As we are parsing Subjcet type array list
        {
            System.out.print(m.creditHours + "\t");     // As we have 2 values so we have to specify the values
            System.out.println(m.name);

        }
    }
}
