package amazon;

public class ReverseGivenString {

	public static void main(String[] args) {
		// coding = gnidoc
		
		String str = "coding";
		
//		String finalStr = "";
//		
//		for(int i=0 ; i<str.length() ; i++) {			
//			char ch = str.charAt(i);			
//			finalStr = ch + finalStr;			
//		}
//		System.out.println(finalStr);
//		
		
		StringBuilder finalSB = new StringBuilder();
		
		for(int i=0 ; i<str.length() ; i++) {			
			char ch = str.charAt(i);			
			//finalStr = ch + finalStr;		
			finalSB = finalSB.append(ch).append(finalSB);
		}
		System.out.println(finalSB);
		
	}

}
