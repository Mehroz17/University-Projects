package polymorphism;

public class Challan  {

	//this method is now generic , it can work in any case
	
	public void printChallan(Student student) {
		
		//System.out.println("Challan for an undergraduate student");
		//to call a method, we must have an object
		System.out.println(student.universityName);
		System.out.println(student.getReg());
		System.out.println(student.getName());
		//System.out.println(student.getType());
		System.out.print("Outstanding semester fee : ");
		System.out.println(student.calculateFee());
	}
	
	/*public void printChallan(Postgraduate postgrad) {
		
		System.out.println("Challan for a postgraduate student");
		//to call a method, we must have an object
		System.out.println(postgrad.universityName);
		System.out.println(postgrad.getReg());
		System.out.println(postgrad.getName());
		System.out.println(postgrad.getType());
		System.out.print("Outstanding semester fee : ");
		System.out.println(postgrad.calculateFee());
	}*/
	
}
