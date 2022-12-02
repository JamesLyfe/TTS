import java.util.Scanner;

public class ControlFlow {  

 static int methodCount;

 static String className;
public static void main(String[] args)   { 

    


	System.out.println("Printing Numbers \n");
	AsciiChars.printNumbers();
	System.out.println("Printing LowerCase! \n");
	AsciiChars.printLowerCase();
	System.out.println("Printing UpperCase!  \n");

	AsciiChars.printUpperCase();
	
	
	
	startUI();

	}



public static void startUI() {
	

	Scanner scanner = new Scanner(System.in);
	System.out.print("Please enter your name: \n");
	String someString = scanner.next();
	
	System.out.println("Hello " + someString);
	
	System.out.print("Do you wish to continue to the interactive portion:(yes/no, y/n) ");
	
	String moveOn = scanner.next();
	
	if(moveOn.equals( "y" ) || moveOn.equals( "yes" ) ) {
		playGame();
	}
	else {
		ByeBye();
	}

	
	


	
	
}
public static void playGame() {
	int flag = 0;
	
	while(flag == 0) {
		RandomGenerator newNumbers = new RandomGenerator();
		
		Scanner formScanner = new Scanner(System.in);
		
		//red car
		boolean errorCheck = false;
		while (errorCheck == false) {
			//red car
			System.out.print("Do you have a red car? (yes, no):  ");
			String redCar = formScanner.next();
			errorCheck = newNumbers.checkCar(redCar);
			// checking error check
			if(errorCheck == false) {
				System.out.println("Error");
			}
			
		}
		
		
		//favorite pet
		errorCheck = false; //reset
		while (errorCheck == false) {
			System.out.print("What is your favorite pet?: ");
			String petString = formScanner.next();  // no change
			errorCheck = newNumbers.checkPet(petString);
			// checking error check
			if(errorCheck == false) {
				System.out.println("Error");
			}		
		}
		
		//lucky number 
		errorCheck = false; //reset
		while (errorCheck == false) {
			System.out.print("	What is your lucky number (0-9):	");
			String favoriteNumber = formScanner.next(); /// ################ convert to number
			errorCheck = newNumbers.checkLuckyNumber(favoriteNumber);
			// checking error check
			if(errorCheck == false) {
				System.out.println("Error");
			}	
		}
		
		//favorite quarterback
		errorCheck = false; //reset
		while (errorCheck == false) {
			System.out.print("	Do you have a favorite quarterback, if so, what is their jersey number (0-99)? 	");
			String jerseyNumber = formScanner.next(); //// ############### convert to number
			errorCheck = newNumbers.checkJerseyNumber(jerseyNumber);
			// checking error check
			if(errorCheck == false) {
				System.out.println("Error");
			}	
		}		
		
		//2 digit car model of the quarterbacks car 
		errorCheck = false; //reset
		while (errorCheck == false) {
			System.out.print("	What is two-digit model year of their car? (0-99): ");
			String twoDigitCarModelYear = formScanner.next(); 
			errorCheck = newNumbers.checkTwoDigit(twoDigitCarModelYear);
			// checking error check
			if(errorCheck == false) {
				System.out.println("Error");
				}	
		}	
		//first name - actor 
		errorCheck = false; //reset
		while (errorCheck == false) {
			System.out.print("What is the first name of the their favorite actor or actress? ");
			String firstNameFavoriteActor = formScanner.next();// no change
			errorCheck = newNumbers.checkActorName(firstNameFavoriteActor);
			// checking error check
			if(errorCheck == false) {
				System.out.println("Error, wrong message. Please try again");
				}	
		}			
		
		//random number (1-50) 
		errorCheck = false; //reset
		while (errorCheck == false) {
			System.out.print("Enter a random number between 1 and 50.");
			String numberBetweenOneAndFifty = formScanner.next();
			errorCheck = newNumbers.checkNumberInRange(numberBetweenOneAndFifty);
			// checking error check
			if(errorCheck == false) {
				System.out.println("Error, invalid input. Please choose a number between 1 and 50, inclusively");
				}	
		}
		newNumbers.generateNumbers();
		newNumbers.printLotteryNumbers();

		String moveOn = formScanner.next();
		
		if(moveOn.equals( "y" ) || moveOn.equals( "yes" ) ) {
			playGame();
		}
		else {
			ByeBye();
		}
		
		
	}
}

public static void ByeBye() {
	System.out.println("Bye! Please return later to complete the survey!");
}


}