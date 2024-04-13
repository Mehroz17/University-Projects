package Saim;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Employee employee= new Employee("M.Mehroz", "FA20-BSE");
        Student student = new Student("Saim", "FA20-BSE-011");
        Generic generic = new Generic(student);
        generic.write();
        ArrayList<Student> list = new ArrayList<>();
        list = generic.read();
        for (Student emp:
             list) {
            System.out.println(emp.getName());
            System.out.println(emp.getId());
        }

    }
}
