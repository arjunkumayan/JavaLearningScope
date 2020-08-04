package StringTest;

import java.util.Stack;

public class ReverseString3 {

	public static void main(String[] args) {
		
		
		String str ="coding";
		
		Stack<Object> st = new Stack<>();
		
		for(int i=0; i<str.length(); i++) {
			st.push(str.charAt(i));
		}
		
		//System.out.println(st.pop());
		
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
	}

}
