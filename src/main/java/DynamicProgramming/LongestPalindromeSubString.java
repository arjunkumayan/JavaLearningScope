package DynamicProgramming;

public class LongestPalindromeSubString {

	public static void main(String[] args) {
	
		
		String str = "madam";
		
		int len = checkLongestPalindromeSubstring(str);
		System.out.println("Maximum length= "+len);

	}

	private static int checkLongestPalindromeSubstring(String str) {
		
		if(str==null || str=="") {
			return 0;
		}
		
		int len = str.length();
		int counter = len;
		
		boolean arr[][] = new boolean[len][len];

		int left = 0;
		int right = 0;
		int maxLaps = 1;
		 for(int i=0; i<len; i++) {
			 arr[i][i] = true;
			 //System.out.println(arr[i][i]);
		 }
		 
		
		 for(int i=len-2 ; i>=0; i--) {
			 for( int j=i+1; j<len; j++) {
				 if(str.charAt(i)==str.charAt(j)) {
					 if(arr[i+1][j-1] || j-i==1 ){
						 
						 arr[i][j]=true;
					   
						 counter++;
						 System.out.println(counter);
						 left = i;
						 right = j;
						 System.out.println("substring= "+str.substring(left, right+1));
						 maxLaps = Math.max(maxLaps, j-i+1);
						
					 }
				 }
			 }
		 }
  
		return maxLaps;
		
	}

}
