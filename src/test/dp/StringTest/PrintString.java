package StringTest;

public class PrintString {

	public static void main(String[] args) {
		
		String s ="Hello World";
		
		System.out.println(s);
		
		int len = s.length();
		for(int i=0; i<len; i++) {
			System.out.println(s.charAt(i));
		}
		
		System.out.println("-----------");
		
		char[] arr = s.toCharArray();
		
		for(char c:arr) {
			System.out.println(c);
		}
		
		
		String str = "Arjun Singh Kumayan";
		
		int len1 = str.length();
		
		char[] strToArray = str.toCharArray();
		int start = 0;
		int end = len1-1;
		
		 while(start<end) {
			 
			 char temp= strToArray[start];
			 strToArray[start] = strToArray[end];
			 strToArray[end] = temp;
			 
			 start++;
			 end--;
		 }
		
		 System.out.print("reversed String: "+String.valueOf(strToArray));
		
	}

}
