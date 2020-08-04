package KKJavaTutorial;

import java.util.Scanner;

public class StringAnagramConcept {

	public static void anagramCheck(String str1,String str2) {
		
		if (str1.length() == str2.length()) {
			System.out.println("its a Valid string because length are same and lets check the character");

			int count = 0;
			for (int i = 0; i < str1.length(); i++) {
				for (int j = 0; j < str2.length(); j++) {

					if (str1.charAt(i) == str2.charAt(j)) {
						count++;
					}

				}
			}
			if (count == str1.length()) {
				System.out.println("Anagram string");
			} else {
				System.out.println("Not a anagram string");
			}
			
		}
		else {
			System.out.println("not a valid string for anagram");
		}
		
	}
	public static void main(String[] args) {
		
		
		String s1 = "silent";
		String s2 = "lssten";
		
		// Same length
		// same charcter
		
		
		/* The string will have same length and same character but not in the same order
		 * is known as string anagram
		 */
		
		
//		try(Scanner sc = new Scanner(System.in)){
//			
//			System.out.println("Enter the String1");
//			String str1 = sc.nextLine();
//			
//			System.out.println("Enter the String2");
//		String str2= sc.nextLine();
//				
//		}
		anagramCheck(s1, s2);
		
		
		

	}

}
