package CommonlyAskedInterviewQuestions;

public class PalindromeNumber {

	public static void main(String[] args) {

		int num = 1;
		int rev = 0;
		
		while(num !=0)
		{
			int n = num % 10;
			rev = rev*10 +n;
			num  =num /10;
		}
		System.out.println(rev);
		if(num == rev)
		{
			System.out.println(" its palindrome number");
		}
		else {
			System.out.println(" its not a palindrome number");
		}
		
	}

}
