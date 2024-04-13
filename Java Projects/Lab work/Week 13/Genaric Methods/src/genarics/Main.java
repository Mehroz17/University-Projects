package genarics;
/*
Topic : Genaric Classes
 */
// we canont operate on primitivee data types .. very important point
// genric methods works on wrapper classes , basically it give you the option on Objects
// polymophism , interface, class(generic story revolve around these concept)
// Genaric Methods
public class Main {
    public static void main(String[] args) {
        GenMetods g1 = new GenMetods();
        String employees[] = {"officers grade", "Staff Grade", "Admin"};
        g1.printrecord(employees);

        Integer employeesScale[] = {1,2,3}; // values 1,2,3 and 4 are now treated as Integer Objects
        g1.printrecord(employeesScale);


        Double salary[] = {90230.56,4000.230,78000.2};
        System.out.println("Salary");
        g1.printrecord(salary);


        Integer a = 2;
        Integer b = 3;
        Integer c = 4;
        System.out.println();
        System.out.println(g1.lrgestnumber(a,b,c));



        // GENEARIC Class
//
//        System.out.println("\t\t\tGenaric Class");
//        GenaricClass gc = new GenaricClass();
//        gc.setModel(2021);
//        System.out.println(gc.getModel());
//
//        gc.setModel("Khyber");
//        System.out.println(gc.getModel());

        //Challeenge
        // how to tell create objects? how to tell a class which type of object a class hold

        GenaricClass<Integer> honda = new GenaricClass<Integer>();
        // honda declare modeles in integers, so how we
        honda.setModel(2021);
        System.out.println("Printing for Honda");
        System.out.println(honda.getModel());

        GenaricClass<String> toyota = new GenaricClass<String>();
        // Toyota declare modeles in String
        toyota.setModel("Vitz");
        System.out.println("Printing for toyota");
        System.out.println(toyota.getModel());



        //Collection FrameWork
        /*
        Q.What is the difference between Collections and Collection
        Collections is a class
        Collection is an interface

                            Collection FarmeWork
        Why is this frameWork availabe?

        Why we use ArrayList istead of Arrays??
        1. index managment auto
        2. size is expandable
        3. there are set of methods that enables you to quickly performs some methods auto
        *In general , whenever you are manupulating data inside a class , you need a method a set data
        and need a method to get the data
        * in array list you have predefine methods

        **As seenjust now ,the genaric methods and genaric class in collections frameworks
        allows you to keep any kind of data , different type of data.
        Collection FrameWork has
        1. Collection interface
        2. Map interface

                Collection Interface(collection by name indicates gruping of objects)
         There are 3  interface in a collectioin interfaces -- very important
         1.List 2. Set 3. Queue
         Interface can extends interface in a same way as classes do
         interface A , interface B , interface B is extending interface A
         if some class C implements interfacce B, then all be methods of A and B will must be overriden

List interface: -

            Direct classe that implements List interface directly are 3 classe
1. ArrayList
2. LindekList
3. Vector
Indirectly 4. Stack -> it is a chlid class of vector that implemetns List
These classes have a defined data structure
Advantages:-
Duplication Allowed


Set Interface:-
        Typse
* SortedSet * NavigableSet->(Treeset is the implementing class)
HashSet, LinkedhashSet(is a chlid class of HashSet) are 2 implementing classes
no duplication allowed

Queue Interface:-

                        Map Interface
types
1. SortedMap
2. NavigableMap (Tree set is implementing class)

Behind the scene:-

objects are stored in keyvalue pare(associated array)
Employee (Faculty Ali) Subjects(OOPSEB) (grouped together) but
Employee (faculty ALi ) Subjects(OOPSAB)

key must be unique , values can be changedd

utility classes are also provided in the collection framework
1. Collection
Arrays

         */

    }

}
