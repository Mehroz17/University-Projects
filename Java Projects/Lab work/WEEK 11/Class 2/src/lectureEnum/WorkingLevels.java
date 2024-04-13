package lectureEnum;

public enum WorkingLevels {

	level1("Student",8), level2("Permit holder", 40);
	
	private String name;
	private int workingHours;
	
	//enum constructor is private, means you cannot call it from outside
	// As the object of enum can not be created so the constructor will be automaticalyy private
	private WorkingLevels(String name, int workingHours) {
		this.name = name;
		this.workingHours = workingHours;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
