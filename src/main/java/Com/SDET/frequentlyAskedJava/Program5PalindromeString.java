package Com.SDET.frequentlyAskedJava;

public class Program5PalindromeString {

	public static boolean reverseString(String str)
	{
		String original = str;
		int len = str.length();
		/*
		 * if(len<0) { return false; }
		 */
		String rev = " ";
		
		for(int i =len-1 ; i>=0; i--)
		{
			rev= rev+str.charAt(i);
		}
		
		boolean check = rev.equals(original);
		
		return check;

	}
	public static void main(String[] args) 
	{
		
		  System.out.println(reverseString("Arjun"));
		  System.out.println(reverseString(""));
		  System.out.println(reverseString("MADAM"));
		 
		
	}

}
