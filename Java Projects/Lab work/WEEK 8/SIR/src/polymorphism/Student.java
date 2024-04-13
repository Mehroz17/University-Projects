package polymorphism;

public class Student {

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
		
}
