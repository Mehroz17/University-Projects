package polymorphism;

public class Challan  {

	//this method is now generic , it can work in any case
	/*
	This is called polymorphism
	 */
	public void printChallan(Student student) {
		
		//System.out.println("Challan for an undergraduate student");
		//to call a method, we must have an object
		System.out.println(student.universityName);
		System.out.println(student.getReg());
		System.out.println(student.getName());

		//System.out.print("Outstanding semester fee : "+student.getNumberOfsemeseters());
		System.out.println(student.calculateFee());
		if(student instanceof Undergraduate){
			System.out.println("number of semesters: " + student.getNumberOfsemeseters());
			System.out.println("number :  "+((Undergraduate) student).getNumber());
		}
		if(student instanceof Diploma){
			System.out.println("Semesters: "+ student.getNumberOfsemeseters());
		}

	}
	

	
}
