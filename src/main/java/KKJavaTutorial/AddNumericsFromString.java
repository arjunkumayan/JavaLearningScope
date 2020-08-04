package KKJavaTutorial;

import java.util.Scanner;

public class AddNumericsFromString {
	
	public static int addNumericsFromString(String str) {
		
		
		int sum = 0;
		for( int i=0 ; i<str.length() ; i++) {
			
			if(Character.isDigit(str.charAt(i))){
				sum = sum+ Character.getNumericValue(str.charAt(i));				
			}
			
		}
		return sum;
	}

	public static void main(String[] args) {
		// I/P -  java123 program23
		
		// we use isdigit method from java.lang.character wrapper class
		// to check the character is number or not
		
		// Method signature - 
	//	public static void isDigit(char);
		
		
		String str1 = "java123 program234 gt11";
		
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter the string");
		 * String str = sc.next();
		 */
		System.out.println(addNumericsFromString(str1));
		

		//Character.getType(5);
	}

}
