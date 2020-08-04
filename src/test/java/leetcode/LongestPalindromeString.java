package leetcode;


// Logic
// s.charAt(i) == s.charAt(l) 
// inner also be same [i+1][j-1] || j-i <=2 and if inner is less than 2
public class LongestPalindromeString {
	
	public static String longestPalindrome(String s) {
		
		int length = s.length();
		
		if(s==null || length<=2) {
			return s;
		}
		
		boolean[][] isPalindrome = new boolean[length][length]; 
		int left=0;
		int right=0;
		
		for(int j=1; j<length ; j++) {
			for(int i=0; i<j; i++) {
				boolean isWorldPalindrome = isPalindrome[i+1][j-1] || j-i <=2;
				
				if(s.charAt(i) == s.charAt(j) && isWorldPalindrome) {
					isPalindrome[i][j] = true;
					//System.out.println(s.substring(left, right+1));
					
					if(j-i > right-left) {
						left = i;
						right = j;
					}
				}
				
			}
			
		}
		
		return s.substring(left, right+1);
		
	}

	public static void main(String[] args) {
		System.out.println(longestPalindrome("abbagoodtecher"));
		System.out.println(longestPalindrome("aba"));
		System.out.println(longestPalindrome("aa"));
		System.out.println(longestPalindrome("a"));
		System.out.println(longestPalindrome("acdcalkjmjkl"));
		System.out.println(longestPalindrome("ab"));
		

	}

}
