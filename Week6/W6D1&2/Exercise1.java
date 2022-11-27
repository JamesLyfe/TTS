import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
    	ArrayList<Integer> nextInt = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        
        int count = 0, sum = 0, num, min = 0, max = 0, product = 1;

        System.out.println("Please enter five numbers:");

        do{
            num=scan.nextInt();
            product*=num;
            sum+=num;
              if(count==0){
              min=num;
              max=num;}
              if(num>max)
                       max=num;
                    if(num<min)
                       min=num;

            count++;
            }while(count<5);
             

        System.out.println("Your product is: " + product);
        System.out.println("The sum is: " + sum);    

        System.out.println("Your maximum number is: " + max);
        System.out.println("Your minimum number is: " + min);
    }

	private static int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}
}