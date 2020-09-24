package amazon;

import java.util.Stack;

public class ReverseIndividualWordString {
	
	public static String reverseIndividualWord(String str) {
		char ch[] = str.toCharArray();
		String finalStr = "";
		String tempStr = "";
		
		for(int i= 0 ; i<ch.length ; i++) {
			
			if(ch[i] !=' ') {
				tempStr = ch[i]+tempStr;
				System.out.println(tempStr);
			}
			else {
				finalStr = finalStr + tempStr + " " ;
				tempStr ="";
			}
			
			
		}
		
		finalStr = finalStr + tempStr ;
		return finalStr;
		
	}
	
	public static void usingStack(String str) {
		
		Stack<Character> st = new Stack<>();
		
		for(int i =0 ;i<str.length() ; i++) {
			char c = str.charAt(i);
			
			if(c == ' ') {
				while(!st.isEmpty()) {
					System.out.println(st.pop());
				}				
			}
			else {				
				st.push(c);
			}			
		}
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
		
		
		
	}

	public static void main(String[] args) {
		// coding simplified nice
		// gnidoc deifilpmis ecin
		
		String str = "coding simplified nice";
		System.out.println(reverseIndividualWord(str));
		

	}

}
