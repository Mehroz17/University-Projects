package polymorphism;

public class Undergraduate extends Student {

	private String type = "undergraduate";
	private int numberOfsemeseters = 8;
	private int number = 897;
	final static int undergraduateExtraFee = 20000;
	
	public Undergraduate(String reg, String name) {
		super(reg, name);
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNumberOfsemeseters() {
		return numberOfsemeseters;
	}

	public void setNumberOfsemeseters(int numberOfsemeseters) {
		this.numberOfsemeseters = numberOfsemeseters;
	}

	@Override
	public int calculateFee() {
		return undergraduateExtraFee + super.calculateFee();
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
