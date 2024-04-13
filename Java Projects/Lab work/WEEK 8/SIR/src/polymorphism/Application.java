package polymorphism;

public class Application {

	public static void main(String[] args) {
		
		Student undergrad = new Undergraduate("FA20-BSE-000", "Ali");
		Student postgrad = new Postgraduate("FA20-RCS-000", "Ahmad");
		Student diploam = new Diploma("SP20-BSE-000","Usman");
		
		Challan challan1 = new Challan();
		
		challan1.printChallan(undergrad);
		challan1.printChallan(postgrad);
		challan1.printChallan(diploam);
		

	}

}
