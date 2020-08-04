package KKJavaTutorial;

public class ReverseEachWordInStringPart1 {

	public static void main(String[] args) {
		
		
		getEachStringWord("WELCOME TO JAVA");

	}

	private static void getEachStringWord(String string) {
		
		String[] word = string.split(" ");
		String reverseString="";
		
		for(String name : word) {
			String reverseWord="";
			for(int i=name.length()-1; i>=0;i--) {
				reverseString = reverseString+reverseWord+String.valueOf(name.charAt(i));
			}
			System.out.print(" ");
		
	}
		System.out.println("Reverse String: "+reverseString);

}}
