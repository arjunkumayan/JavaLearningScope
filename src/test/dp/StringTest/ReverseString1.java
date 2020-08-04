package StringTest;

public class ReverseString1 {

	public static void main(String[] args) {
		
		
		String str ="coding";
		
		//String finalString =" ";
		StringBuffer finalString = new StringBuffer();
		char ch;
		for(int i=str.length()-1 ; i>=0; i--) {
			ch = str.charAt(i);
			finalString= finalString.append(ch);
			System.out.println(finalString);
		}

		System.out.println(finalString);
	}

}
