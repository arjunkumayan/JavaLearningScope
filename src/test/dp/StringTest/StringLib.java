package StringTest;

import java.util.Stack;

public class StringLib {
	
	public static String reverseAnotherString(String str) {
		String s=" ";
		for(int i=0 ;i<str.length();i++) {
			s= str.charAt(i)+s;
		}
		return s;
		
	}
	
	public static String printReverseString(String str) {
		int start =0;
		int end = str.length()-1;
		char ch[] = str.toCharArray();
		while(start<end) {
			char c= ch[start];
			ch[start] = ch[end];
			ch[end] = c;
			start++;
			end--;
			
		}
		for(int i=0 ;i<ch.length ; i++) {
			System.out.println(	ch[i]);
		}
		
		return String.copyValueOf(ch);
	}
	
	
	public static void reverseStack(String str) {
		Stack<Character> st= new Stack<>();
		
		for(int i=0 ; i<str.length() ; i++) {
			st.push(str.charAt(i));
		}
		
		while(!str.isEmpty()) {
			System.out.println(st.pop());
		}
	}

	public static void main(String[] args) {
		
  String str ="Coding";
 System.out.println(reverseAnotherString(str));
  System.out.println(printReverseString(str));
  
  reverseStack(str);
	}

}
