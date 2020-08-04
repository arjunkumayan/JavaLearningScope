package JavaInterview;

public class StringReverse {

	public static void main(String[] args) {
		
		String s ="Selenium";
		
		int len = s.length();
		String reverseString = "";
		
		for(int i=len-1 ; i>=0 ; i--) {
			reverseString =  reverseString + s.charAt(i);			
		}
		
		System.out.println("Reverse = "+reverseString);
		
		
		
	}

}
