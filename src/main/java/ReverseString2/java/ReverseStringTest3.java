package ReverseString2.java;

import java.util.Scanner;

public class ReverseStringTest3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string which you want to reverse");
		String inputText = sc.nextLine();
		
		String reversedString = reverseStringUsingForwardLogic(inputText);
	    System.out.println("Reversed String: "+reversedString);
	}

	private static String reverseStringUsingForwardLogic(String inputText) {
		
		if(inputText==null || inputText.trim().isEmpty()) {
			return inputText;
		}
		
		char[] inputArray = inputText.toCharArray();
		int start = 0;
		int end = inputArray.length-1;
		
		while(start < end) {
			char temp = inputArray[end];
			inputArray[end] = inputArray[start];
			inputArray[start]= temp;
			
			++start;
			--end;
			
			
		}
		
		
		return String.valueOf(inputArray);
	}

}
