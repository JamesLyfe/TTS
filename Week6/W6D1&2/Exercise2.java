import java.util.HashMap;
import java.util.Scanner;

class Exercise2 {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

    // create a hashmap
    HashMap<String, String> car = new HashMap<String, String>();
  
    //get user input
    System.out.println("What Model do you want?");
    // add elements to hashmap
    car.put("Civic", "Honda");
    car.put("Prius", "Toyota");
    car.put("Focus", "Ford");
    
    
    String query = input.nextLine();
	if(car.containsKey(query)) {
		System.out.println("Oh, you're looking for a " + query + " ? Our " + car.get(query).toString() + " selection is right over here...");
	
	}
	else {
		System.out.println("we don't have that model");
		
	}
  }
}