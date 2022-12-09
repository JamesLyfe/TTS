package ArraysDataStructures;

import java.util.Arrays;
import java.lang.Math;

public class toPower {
	
	//Write a public static method called "toPower" that takes in as parameters two integers called size and power. 
	//The method should return an array of size "size" with each array index raised to the value of "power." 
	//So, for example, if we passed in "size = 4" and "power = 2" to the "toPower," the method should return the following result: [0,1,4,9].

	public static void main(String[] args) {
	System.out.println(Arrays.toString(toPower(4, 2)));
	}

	public static int [] toPower(int size, int power) {
	
		int [] powerArr = new int [size];
		
		for (int i = 0; i < powerArr.length; i++) {
			powerArr[i] = (int) Math.pow(i, power);
		}
		
		return powerArr;
	}

}
	
	



