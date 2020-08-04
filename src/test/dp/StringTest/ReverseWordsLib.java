package StringTest;

public class ReverseWordsLib {
	
	public static String reverseWords(String str) {
		
		String finalStr="";
		String tempStr="";
		
		for(int i=0 ;i<str.length() ; i++) {
			char c = str.charAt(i);
			
			if(c==' ') {
				finalStr = " "+tempStr+finalStr;
				tempStr="";
			}
			else {
				tempStr = tempStr+c;
				
			}
		}
		
		finalStr = tempStr+finalStr;
		System.out.println(finalStr);
		
		return finalStr;
	}
	
	public static void reversewordsBuilder(String str) {
		StringBuilder finalString = new StringBuilder();
		StringBuilder tempString = new StringBuilder();
		
		
		for(int i=0 ;i<str.length() ;i++) {
			char c = str.charAt(i);
			
			if(c ==' ') {
				finalString.insert(0, tempString).insert(0, " ");
				tempString.setLength(0);
			}
			else {
				tempString.append(c);
				
			}
			
			
		}
		finalString.insert(0, tempString);
		
		System.out.println(finalString.toString());
		
	}

	public static void main(String[] args) {
		// Coding Simplified nice
		// nice simplified coding
		
		
		String str = "Coding Simplified nice";
		//reverseWords(str);

		
		reversewordsBuilder(str);
	}

}
