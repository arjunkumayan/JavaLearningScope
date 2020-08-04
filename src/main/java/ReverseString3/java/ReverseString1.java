package ReverseString3.java;

public class ReverseString1 {
	
	public static String reverserSting(String str) {
		int len = str.length();
		String rev="";
		for(int i=len-1 ; i>=0 ; i--) {
			rev = rev+str.charAt(i);
			
		}
		
		return rev;
	}

	public static void main(String[] args) {
	
System.out.println(reverserSting("ARJUN"));
	}

}
