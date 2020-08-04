package StringTest;

import java.util.Stack;

public class StringIndividualWorldLib {
	
	
	public static String reverseIndividualWorldString(String str) {
		
		String finalString ="";
		String tempString="";
		
		for(int i=0 ; i<str.length();i++) {
			
		char ch=str.charAt(i);
		if(ch==' ') {
			finalString = finalString + tempString + " ";
			tempString="";
		}
		else
		{
			tempString= ch+tempString;
		}
		
		}
		
		finalString = finalString+tempString;
		System.out.println(finalString);
		
		return finalString;
	}
	
	public static String reverseStringUsingBuilder(String str) {
		StringBuilder finalStr = new StringBuilder();
		StringBuilder tempStr = new StringBuilder();
		
		for(int i=0 ; i<str.length() ;i++) {
			char c = str.charAt(i);
			if(c==' ') {
				finalStr = finalStr.append(tempStr).append(" ");
				tempStr.setLength(0);
			}
			else
			{
				tempStr = tempStr.insert(0, c);
			}
			
		}
		
		finalStr = finalStr.append(tempStr);
		return finalStr.toString();
	}

	public static void reverseusingStack(String str) {
		
		Stack<Character> st = new Stack<Character>();
		
		for(int i=0;i<str.length() ; i++) {
			
			char c = str.charAt(i);
		if(c ==' ') {
			while(!st.isEmpty()) {
				System.out.println(st.pop());
			}
			System.out.println(" ");
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
	String str="Coding simplified learning";
	reverseIndividualWorldString(str);

	String str1="The test automation practice";
	System.out.println(reverseStringUsingBuilder(str1));
	
	
	}

}
