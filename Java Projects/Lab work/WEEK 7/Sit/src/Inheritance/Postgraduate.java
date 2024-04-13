package inheritance;

//child class of class Student but it is a parent class to class Masters

public class Postgraduate extends Student {

	private String technology;
	
	public Postgraduate() {
		
	}
	
	public Postgraduate(String name, String id) {
		super(name, id);	 
	}
	
	public void setTech(String technology) {
		this.technology = technology;
	}
	
	public void getTech() {
		System.out.println(technology);
	}
	
	@Override
	public String toString() {
		return "Hello from parent class post graduate\n" + super.toString();
	}

}
