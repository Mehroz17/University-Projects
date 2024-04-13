package polymorphism;

public class Postgraduate extends Student {

	private String type = "postgraduate";
	private int numberOfsemeseters = 8;
	final static int postgraduateExtraFee = 35000;

	@Override
	public int getNumberOfsemeseters() {
		return numberOfsemeseters;
	}

	public void setNumberOfsemeseters(int numberOfsemeseters) {
		this.numberOfsemeseters = numberOfsemeseters;
	}

	public Postgraduate(String reg, String name) {
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
		return postgraduateExtraFee + super.calculateFee();
	}

}
