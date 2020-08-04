package KKJavaTutorial;

public class ReverseEachWordInStringPart2 {

	public static void main(String[] args) {
		
		
		getEachStringWord("WELCOME TO JAVA");

	}

	private static void getEachStringWord(String string) {
		
		String[] word = string.split(" ");
		String reverseString="";
		
		for(String name : word) {
			String reverseWord="";
			
			char[] charArray = name.toCharArray();
			int start = 0;
			int end = name.length()-1;
			
			while(start<end) {
				char temp = charArray[start];
				charArray[start]= charArray[end];
				charArray[end]=temp;
				
				++start;
				--end;
			}
			reverseWord = String.valueOf(charArray);
			reverseString = reverseString+reverseWord+" ";
		
	}
		System.out.println("Reverse String: "+reverseString);

}}
