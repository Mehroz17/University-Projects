package polymorphism;

public class Diploma extends Student {
	
	private String type = "Diploma";
	private int numberOfsemeseters = 5;
	final static int diplomaExtraFee = 35000;

	@Override
	public int getNumberOfsemeseters() {
		return numberOfsemeseters;
	}

	public void setNumberOfsemeseters(int numberOfsemeseters) {
		this.numberOfsemeseters = numberOfsemeseters;
	}

	public Diploma(String reg, String name) {
		super(reg, name);
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public int calculateFee() {
		return diplomaExtraFee + super.calculateFee();
	}

}
