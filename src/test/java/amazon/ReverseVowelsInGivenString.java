package amazon;

public class ReverseVowelsInGivenString {
	
	public static boolean isVowel(char c) {
		
		if(c == 'a' || c == 'A' || c=='e' || c=='E' || c =='o'|| c=='O' || c =='u'||c=='U') {
			return true;
		}
		
		return false;
	}
	
	public static String reverseVowelsInString(String str) {
		int start = 0;
		int end = str.length()-1;
		
		char charArr[] = str.toCharArray();
		while(start<end) {
			
			if(!isVowel(charArr[start])) {
				start++;
				continue;
			}
			
			if(!isVowel(charArr[end])) {
				end--;
				continue;
			}
			
			char temp = charArr[start];
			charArr[start]= charArr[end];
			charArr[end] = temp;
			start ++;
			end --;
			
			
		}
		
		return String.copyValueOf(charArr);
	}

	public static void main(String[] args) {
		// e q u a t i o n
		// e u a i o
		// o i a u e
		
		String str = "equation";
		
		String vowelsReverse = reverseVowelsInString(str);
		System.out.println(vowelsReverse);

	}

}
