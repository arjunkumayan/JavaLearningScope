package Com.SDET.frequentlyAskedJava;

public class Program3ReverseAString {
	
	public static String reverseAString(String str)
	{
		String rev = " ";
		int len = str.length();
		
		for(int i = len-1 ; i>=0; i--)
		{
			rev = rev+ str.charAt(i);
		}
		return rev;
		
	}
	
	public static StringBuffer reverseStringUsingStringbuffer(String str)
	{

		StringBuffer sb = new StringBuffer(String.valueOf(str));
		return sb.reverse();
		
	}
	

	public static void main(String[] args) {
 
		System.out.println(reverseAString("Arjun"));
		System.out.println(reverseStringUsingStringbuffer("notepal"));
		
	}

}
