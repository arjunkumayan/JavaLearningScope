package CommonlyAskedInterviewQuestions;

public class P23PalindromeNumber {

	public static void main(String[] args) {
		
		int num = 1221;
		int rev = 0;
		
		int actualNumber = num;
		
		while(num!=0)
		{
		  int remainder = num%10;
		  rev = rev*10+remainder;
		  num = num/10;
		  			
		}
		System.out.println(rev);
		
		if(actualNumber == rev)
		{
			System.out.println(actualNumber+ " number is palindrome");
		}
		else
		{
			System.out.println(actualNumber+ "is not a palindrome");
		}

	}

}
