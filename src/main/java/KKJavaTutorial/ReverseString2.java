package KKJavaTutorial;

public class ReverseString2 {
	
	public static String reverserSting(String str) {
		
		char[] charArray = str.toCharArray();
		int len = charArray.length;
		String rev="";
		for(int i=len-1 ; i>=0 ; i--) {
			rev = rev+charArray[i];
			
		}
		
		return rev;
	}

	public static void main(String[] args) {
	
System.out.println(reverserSting("ARJUN"));
	}

}
