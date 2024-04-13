package polymorphism;
/*
abstract keyword
we can not create objects form  abstract  class but we can use that class as a reference
it is just a virtual class
implementation details in full are not preset
Generalization

Abstract methods can only be declared in abstract classes only and they will have only definition its impelementation will not be in that class
 */

public  abstract class Student {

	String reg;
	String name;
	
	final static int admissionFee;
	final static int normalSemesterFee;
	final static String universityName;
	
	static {
		admissionFee = 10000;
		normalSemesterFee = 80000;
		universityName = "COMSATS University Islamabad, Lahore Campus";
	}
	//Constructors
	public Student(String reg, String name) {
		super();
		this.reg = reg;
		this.name = name;
	}
	
	public String getReg() {
		return reg;
	}
	public void setReg(String reg) {
		this.reg = reg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int calculateFee() {
		return admissionFee + normalSemesterFee;
	}

	// This is an abstract method
	/*
	no body , only definition
	 */
	public abstract  int getNumberOfsemeseters();
}
