package amazon;

import java.util.Stack;

public class ReverseString1 {

	public static void main(String[] args) {
		String str = "coding";
		char ch[] = str.toCharArray();
		
		int start = 0;
		int end = str.length()-1;
		
		while(start<end) {
			
			char temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
			
			start++;
			end--;		
			
			
		}
		
		System.out.println(String.valueOf(ch));
		
		Stack<Character> st= new Stack<Character>();
		
		for(int i =0 ; i<str.length() ; i++) {
			st.push(str.charAt(i));
		}
		
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
		
				
	}

}
