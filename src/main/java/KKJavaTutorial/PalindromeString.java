package KKJavaTutorial;

public class PalindromeString {
	
	public static void checkPalindromeString(String str) {
		
		String original = str;
		System.out.println("Original String: "+original);
		
		String strToCheck = str;
		char[] charArray = strToCheck.toCharArray();
		int len = charArray.length;
		
		int start = 0;
		int end = len-1;
		
		while(start<end) {
			char temp = charArray[start];
			charArray[start] = charArray[end];
			charArray[end] = temp;
			++start;
			--end;
			
		}
		String rev = String.valueOf(charArray);
		
		System.out.println("Reversed STring: "+rev);
		
		if(original.equals(rev)) {
			System.out.println(original+" Palindrome");
		}
		else {
			System.out.println(original+" Not Palindrome");
		}
	}

	public static void main(String[] args) {
		checkPalindromeString("MADAM");

	}

}
