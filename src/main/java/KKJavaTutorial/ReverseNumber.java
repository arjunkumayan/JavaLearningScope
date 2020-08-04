package KKJavaTutorial;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
	    int number = sc.nextInt();
	 
	    StringBuffer rev;
	    StringBuffer sb = new StringBuffer(String.valueOf(number));
	    
	    rev= sb.reverse();
	    
	    System.out.println("Reverse number is: "+rev);
	    
	    StringBuilder rev1;
	    StringBuilder sb1 = new StringBuilder();
	    sb1.append(number);
	    rev1 = sb1.reverse();
	    System.out.println("Reverse number is: "+rev1);
	    
	 
	}

}
