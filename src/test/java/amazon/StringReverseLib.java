package amazon;

import java.util.Stack;

public class StringReverseLib {

	public static String reverseString1(String str) {
		
		char ch[] = str.toCharArray();
		
		String finalString = "";
		
		for(int i=0 ; i<ch.length ; i++) {
			
			char c = ch[i];
			finalString = c + finalString;
			
		}
		
		return finalString;
		
	}
	
	public static String reverseString2(String str) {
		
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
		
		return String.valueOf(ch);
		
	}
	
	public static String reverse4(String str) {
		
		String temp_str = "";
		String final_str = "";
		
		for(int i= 0  ; i< str.length() ; i++) {
			
			if(str.charAt(i)!= ' ') {
				temp_str = str.charAt(i) + temp_str;
				
			}
			else {			
				final_str = final_str +  temp_str + " ";
				temp_str = " ";
			}
			
		}
		
		final_str = final_str + temp_str;
		return final_str;
		
		
	}
	public static void reverse3(String str) {
		
		char ch [] = str.toCharArray();
		Stack<Character> st=  new Stack<Character>();
		
		for(int i=0 ; i<ch.length ; i++) {
			
			st.push(ch[i]);
			
			
		}
		
		while(!st.isEmpty()) {			
			System.out.print(st.pop());
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "coding simplified java";
		
		//String st = reverseString1(str);
		//System.out.println(st);
		
		
		//String str1 = reverseString2(str);
		//System.out.println(str1);
		
		// reverse3(str);
		
		String rev = reverse4(str);
	 System.out.println(rev);
	
	}

}
