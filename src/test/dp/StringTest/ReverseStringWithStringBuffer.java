package StringTest;

public class ReverseStringWithStringBuffer {

	public static void main(String[] args) {
		String str ="Coding";
		
		StringBuilder sb= new StringBuilder(str);
		
		sb= sb.reverse();
		System.out.println("Reverse String: "+sb);

	}

}
