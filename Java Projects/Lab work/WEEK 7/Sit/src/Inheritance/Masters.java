package inheritance;

//child class of class Post graduate and grand child of class Student
//there is a difference between multiple level inheritance and Multiple inheritance
//Java doesn't support Multiple inheritance 

public class Masters extends Postgraduate{
	
	String type = "Masters";
	
	public Masters() {
		
	}

	public Masters(String name, String id) {
		super(name, id);
		 
	}
	
	@Override
	public String toString() {
		return "Hello from current class Masters\n" + super.toString();
	}
	

}
