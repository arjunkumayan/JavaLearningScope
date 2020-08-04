package KKJavaTutorial;

import java.util.Scanner;

public class ReverseNumberUsingStringBuffer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
	    int number = sc.nextInt();
	 
	    int rev =0;
	    while(number!=0) {
	    	int remainder = number%10;
	    	rev= rev*10+remainder;
	    	number = number/10;
	    }
	    
	    System.out.println("Reverse number is: "+rev);
	 
	}

}
