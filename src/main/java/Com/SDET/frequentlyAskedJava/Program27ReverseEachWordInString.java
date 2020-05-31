package Com.SDET.frequentlyAskedJava;

public class Program27ReverseEachWordInString {

	public static void main(String[] args) {

		// WELCOME TO JAVA   - original string 
		// EMOCLEW OT AVAJ   - after reverse string
		
		String str = "WELCOME TO JAVA";
		
		String[] words = str.split(" ");
		
		String revereString = "";
		
		for(String word: words)
		{
			//System.out.println(word);
			
			String reverseWord = "";
			for(int i=word.length()-1 ;i>=0; i--)
			{
				reverseWord = reverseWord+word.charAt(i);
			}
			revereString = revereString + reverseWord + " ";
			
		}
		
		System.out.println(revereString);
		
		
	}

}
