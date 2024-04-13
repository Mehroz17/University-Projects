package Genarics;

public class Person <S,I> {

	private S name;
	private I id;
	private S type;
	
	public Person(S name,I id,S type)
	{
		this.name = name;
		this.id = id;
		this.type = type;
	}
	
	public void print()
	{
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
		System.out.println("Type: "+type);
		System.out.println("\n");
	}
		

}


