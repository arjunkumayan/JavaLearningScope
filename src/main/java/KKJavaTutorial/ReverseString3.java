package KKJavaTutorial;

public class ReverseString3 {
	
	public static StringBuffer reverserSting(String str) {
		
		StringBuffer rev;
		StringBuffer sb = new StringBuffer(str);
		rev = sb.reverse();
		
		return rev;
	}

	public static void main(String[] args) {
	
System.out.println(reverserSting("ARJUN"));
	}

}
