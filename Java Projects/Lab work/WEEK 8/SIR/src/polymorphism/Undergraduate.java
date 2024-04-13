package polymorphism;

public class Undergraduate extends Student {

	private String type = "undergraduate";

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
	
	@Override
	public int calculateFee() {
		return undergraduateExtraFee + super.calculateFee();
	}

}
