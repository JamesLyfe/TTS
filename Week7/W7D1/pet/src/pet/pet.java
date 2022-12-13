package pet;

public class pet { 
	private String name; 
	private int age; 
	private String location; 
	private String type; 
	
	//empty constructor 
	public pet() { 
	}
	
	//constructor all attributes
	public pet( String name, int age, String location, String type) {
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
	}
	
	//constructor with only name
	public pet(String name) {
		this.name = name;
	}
	
	//get methods
	public void supDog() {
		System.out.println("Sup " + name);
	}

	public void ageTypeLocation () {
		System.out.println("I am a " + type);
	
	}
}