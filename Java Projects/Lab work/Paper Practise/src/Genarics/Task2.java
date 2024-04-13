package Genarics;

public class Task2 {
	public static void main(String[] args) {
		 Person <String, Integer> person1 = new Student("Ahmad", 15,"Student");
		 Person <String, Integer> person2 = new Employee("Ali", 01,"Employee");
		 Person <String, Integer> person3 = new Shop("Abubakar", 84,"ShopKeeper");
		 
		 person1.print();
		 person2.print();
		 person3.print();
		 
		 
	}

}
