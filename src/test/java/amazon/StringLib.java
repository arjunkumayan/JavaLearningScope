package amazon;

import java.util.Stack;

public class StringLib {
	
	
	public static String swapString(String str) {		
		char ch[] = str.toCharArray();
		
		int start = 0;
		int end = ch.length-1;
		
		while(start<end) {
			char temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
			start ++;
			end --;
		}
		return String.copyValueOf(ch);		
	}
	
	public static void swapStringUsingStack(String str) {		
		char ch[] = str.toCharArray();
		
		Stack<Character> st = new Stack<>();
		
		for(int i=0 ; i<ch.length ; i++) {
			st.push(ch[i]);
		}
		
		while(!st.isEmpty()) {
			System.out.print(st.pop());
		}
		
	}


	public static void main(String[] args) {
		
		String str = "codingsimplified";
		
		String finalStr = "";
		String tempStr = "";
		
		for(int i = 0 ; i<str.length() ; i++) {			
			char c = str.charAt(i);
			finalStr = c + finalStr;
			// misgnidoc			
		}
		
		System.out.println(finalStr);
		
		System.out.println(swapString("WELCOME"));

		swapStringUsingStack("ARJUN");
		
		System.out.println(" /n");
		StringBuilder sbr = new StringBuilder("Kumayan");
		StringBuilder revStr = sbr.reverse();
		
		System.out.println(revStr);
	}

}
