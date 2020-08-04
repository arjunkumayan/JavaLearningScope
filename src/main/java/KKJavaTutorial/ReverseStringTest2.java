package KKJavaTutorial;

import java.util.Scanner;

public class ReverseStringTest2 {

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
		String reverse = "";
		char[] charArray = inputText.toCharArray();
		for(int i=inputText.length()-1 ; i>=0 ;i--) {
			reverse=reverse+charArray[i];
			
		}
		
		return reverse;
	}

}
