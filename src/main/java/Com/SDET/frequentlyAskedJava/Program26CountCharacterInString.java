package Com.SDET.frequentlyAskedJava;

public class Program26CountCharacterInString {

	public static void main(String[] args) {

		String str = "Java programming Java oops";
		
		int len = str.length();
		
		String str1 = str.replace("J", "");
		
		int len2 = str1.length();
		
		int count = len - len2;
		
		System.out.println(" count of character: "+count);
	}

}
