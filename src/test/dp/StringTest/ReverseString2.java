package StringTest;

public class ReverseString2 {

	public static void main(String[] args) {
		
		
		String str ="coding";
		
		String finalString =" ";
		
		char ch;
		for(int i=str.length()-1 ; i>=0; i--) {
			ch = str.charAt(i);
			finalString= finalString + ch;
			System.out.println(finalString);
		}

		System.out.println(finalString);
	}

}
