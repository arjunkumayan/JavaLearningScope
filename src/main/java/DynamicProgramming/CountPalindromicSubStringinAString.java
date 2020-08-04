package DynamicProgramming;

public class CountPalindromicSubStringinAString {
	

	public static void main(String[] args) {
		
		
		String test ="abba";
		
		int totalCount = countPalindromeSubstring(test,test.length());
		System.out.println(totalCount);

	}

	private static int countPalindromeSubstring(String str, int n) {
		if(str==null || str.length()==0) {
			return 0;
		}
		boolean[][] arr = new boolean[n][n];
		int count = str.length();
		
		for(int i=0; i<str.length(); i++) {
			arr[i][i] = true;
		}
		for(int i=n-2; i>=0; i--) {
			for(int j = i+1; j<n ; j++) {
				if(str.charAt(i)==str.charAt(j))
						{
					if(arr[i+1][j-1]|| j-i==1)
				 {
				arr[i][j]= true;
				count++;
				}
			}
		}
		
		
		
		
	}
		
		return count;
	}
}
