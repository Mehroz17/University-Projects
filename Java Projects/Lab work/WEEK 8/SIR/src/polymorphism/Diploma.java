package polymorphism;

public class Diploma extends Student {
	
	private String type = "Diploma";

	final static int diplomaExtraFee = 35000;
	
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
