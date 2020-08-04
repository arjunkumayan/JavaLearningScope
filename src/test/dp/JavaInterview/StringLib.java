package JavaInterview;

import java.util.Stack;

public class StringLib {
	
	
	public static String reverseIndividualWord(String str) {

		String finalString = "";
		String tempString = "";
		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);

			if (c == ' ') {
				finalString = finalString + tempString + " ";
				tempString = "";

			} else {
				tempString = c + tempString;
			}

		}

		finalString = finalString + tempString;

		return finalString;

	}
	
	public static String reverseWordIndividualWordStringBuilder(String str) {
		
		StringBuilder finalStr = new StringBuilder();
		
		StringBuilder tempStr = new StringBuilder();
		
		for(int i=0 ; i<str.length() ; i++) {
			char c = str.charAt(i);
			if(c == ' ') {
				finalStr= finalStr.append(tempStr).append(" ");
				tempStr.setLength(0);
			}
			else {
				tempStr.insert(0, c);
				}
			finalStr = finalStr.append(tempStr);
		}
		
		return finalStr.toString();
	}
	
	public static String reverseWholeWordInAString(String str) {

		String finalStr = "";
		String tempStr = "";

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);

			if (c != ' ') {
				tempStr = tempStr + c;
			} else {

				finalStr = " " + tempStr + finalStr;
				tempStr = "";
			}

		}

		finalStr = tempStr + finalStr;
		return finalStr;

	}
	public String reverseStringAnother(String str) {
		
		String s="";
		for(int i=0 ; i<str.length() ; i++) {
			
			s= str.charAt(i)+s;
		}
		return s;
		
	}
	
	public static void printReverseString(String str)
	{
		int start = 0;
		int end = str.length()-1;
		
		char ch[] = str.toCharArray();
		while(start<end) {
			
			char c = ch[start];
			ch[start]= ch[end];
			ch[end] = c;
			
			start++;
			end--;
			
			
		}
		
		for(int i=0 ; i<ch.length ; i++) {
			System.out.print(ch[i]+" ");
		}
		
	}
	
	public static void reverseStack(String str) {
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0 ; i<str.length() ; i++) {
			stack.add(str.charAt(i));
		}
		
		while(!stack.isEmpty()) {
			
			System.out.print(stack.pop());
		}
		
	}

	public static void main(String[] args) {
		StringLib obj = new StringLib();
		
		String str = "coding";
		
		StringBuilder sb = new StringBuilder(str);
		sb= sb.reverse();
		
		System.out.println(sb);
		
		System.out.println(obj.reverseStringAnother(str));
		printReverseString(str);
		reverseStack(str);
		
		System.out.println(reverseIndividualWord("coding simplified java"));
	    System.out.println("------------");
	    
	    String str1 = "coding simpliefied java";
		System.out.println(reverseWholeWordInAString(str1));
	
	}

}
